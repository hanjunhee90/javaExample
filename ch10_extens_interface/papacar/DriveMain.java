package ch10_extens_interface.papacar;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class DriveMain {

	public static void main(String[] args) {
		Vehicle car1 = new ElectricCar();
		Vehicle car2 = new GasCar();
		
		car1.start();
		car2.start();
		
		// 동일한 인터페이스를 구현한 클래스이기 떄문에 동일한 메서드가 있음
		ArrayList<Vehicle> cars = new ArrayList<>();
		// 동일한 인터페이스로 구현되어 제너릭이 같은 타입으로 사용가능
		cars.add(car1);
		cars.add(car2);
		
		cars.get(0).stop();
		cars.get(1).stop();
		
		// 동일한 List 라는 인터페이스를 구현
		
		List list = new ArrayList<>();
		List list2 = new LinkedList<>();
		
		list.add("hi");
		list2.add("hi");
	}

}
