package ch10_extens_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {

	public static void main(String[] args) {
		
		Marine marine01 = new Marine();
		Marine marine02 = new Marine("영웅마린", 8, 100, 0);
		System.out.println(marine01);
		System.out.println(marine02);
		
		marine01.move(100, 200);
		marine02.stimpack();
		System.out.println(marine02);
		
		Zealot zealot01 = new Zealot();
		zealot01.attack(marine01);
		System.out.println(marine01);
		
		// 다향성(Polymorphism)
		// 오버라이딩, 오버로딩, 업캐스팅, 다운캐스팅
		// 하나의 객체가 여러 타입을 가질 수 었음
		// 자식 객체에서 부모 객체로 형변환이 가능
		
		StarUnit highTemplar01 = new HighTemplar();
		HighTemplar highTemplar02 = new HighTemplar();
		StarUnit highTemplar03 = highTemplar02;  // 자식에서 부모 객체로 형변환은 자동으로 됨.
		System.out.println(highTemplar01);
		System.out.println(highTemplar02);
		System.out.println(highTemplar03);

		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		starList.add(marine01);
		starList.add(zealot01);
		starList.add(highTemplar01);
		System.out.println(starList);
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(100, 150);
		}
		
		//highTemplar01.tthunderStorm();  // 타입이 부모타입이기 때문에 부모가 가지고 있지 않은 메소드는 사용분가
		highTemplar02.tthunderStorm();
		((HighTemplar) highTemplar01).tthunderStorm();  // 부모 -> 자식 형변환 후 사용가능
		
		StarUnit scv = new StarUnit("scv", 5, 60, 0);
		// 형변환 가능 체크(true/false) 부모객체는 자식객체로 형변환 할 수 없음
		System.out.println(scv instanceof Zealot);
		// 부모 객체로 혈변환 되었던 자식 객체는 다시 자식 타입으로 형변환 가능
		StarUnit m = marine01;
		System.out.println(m instanceof Marine);
	}

}
