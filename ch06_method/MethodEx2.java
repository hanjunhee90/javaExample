package ch06_method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		

	}
	// input : 고객수
	// output : 없음
	// 고객수만큼 커피 주문을 받아 금액을 출력하는 메소드 생성.
	
	public static void shop(int num) {
		System.out.println(num + " 고객 출현");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (num > i) {
			// 주문 받기
			System.out.println((i+1)+ "번째 고객님 어떤걸 드릴까요?");
		}
		scan.close();
		System.out.println(num+"고객 주문완료.");
	}

}
