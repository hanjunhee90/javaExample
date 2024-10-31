package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		int[] arr = {1, 2, 3};
		String str = null;
		try {
			// 오류가 발생 가능한 로직을 (try 쪽에 위치) 예외처리
			//System.out.println(arr[3]);
			str.length();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 문제!");
		} catch (NullPointerException e) {
			System.out.println("널 문제!!");
		} catch (Exception e) {
			//e.printStackTrace(); // 예외 발생 코드에 대해 추적한 내용을 콘솔에 출력
			System.out.println(e.toString()); //문자열 출력
		}
		System.out.println("메인 종료!");
		
		
		System.out.println(ExMethod.dateMillSec2("2024/01/01"));
		try {
			System.out.println(ExMethod.dateMillSec("2024/01/01"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("종료");
		
		
		try {
			ExMethod.printName("");
			
		} catch (BixException e) {
			System.out.println(e.getErrCode()); // bizexception 메서드
			System.out.println(e.getMessage()); // 부모 메서드
		}
	}

}
