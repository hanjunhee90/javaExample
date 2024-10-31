package ch09_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StudentMain {

	public static void main(String[] args) {
		Student pangsu = new Student("팽수",90,80,70);
		Student gildong = new Student("길동",80,70,100);
		System.out.println(pangsu);
		System.out.println(gildong);
		
		// 캡슣화 적용
		// private 필드는 해당 클래스의 메서드로 사용해서 접근
		System.out.println(pangsu.getEng());
		//수정
		pangsu.setEng(99);
		
		// 사용자가 만든 class도 객체 재네릭에는 클래스 객체가 들어감
		ArrayList<Student> myClass = new ArrayList<Student>();
		myClass.add(pangsu);
		myClass.add(pangsu);
		myClass.add(new Student("주디",80,80,70));
		myClass.add(new Student("닉",100,100,100));
		for(int i = 0; i < myClass.size();i++) {
			System.out.println(myClass.get(i));
		}
		
		Collections.sort(myClass, new Comparator<Student>() {

			// -1 반환: 두 객체의 순서를 바꾸지 않음
			// 1 반환 : 두 객체의 순서를 바꿈
			// 0 반환 : 유지
			@Override
			public int compare(Student stu1, Student stu2) {
				// TODO Auto-generated method stub
				double diff = stu2.getAvg() - stu1.getAvg();
				if(diff < 0) {
					return -1;
				}
				
				return 1;  // 차이가 0보다 크면 stu2가 더 크기때문에 순서를 바꿈
			}
		});
		System.out.println(myClass);
		
		// 람다 표현식 Java 8 이상 부터 사용가능
		Collections.sort(myClass,(stuA, stuB) ->
			(stuB.getAvg() - stuA.getAvg() > 0) ? (1) : (-1));
			// (매개변수) -> 식
		System.out.println(myClass);
		
		// 버블정렬
		for(int k = 0; k < myClass.size(); k++) {
			for(int i = 0; i < myClass.size()-1; i++) {
				//i < i+1 내림
				//i > i+1 오름
				if(myClass.get(i).getAvg() < myClass.get(i+1).getAvg()) {
					Student temp = myClass.get(i);
					myClass.set(i, myClass.get(i+1));
					myClass.set(i+1, temp); //  비교해서 위치변경
				}
			}
		}
		System.out.println("내림차순");
		System.out.println(myClass);

	}

}
