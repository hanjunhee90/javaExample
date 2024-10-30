package ch05_conditional;

import java.util.Scanner;

/**
 * class Name   : LoopWhile
 * Author       : JunHee
 * Created Date : 2024. 8. 7.
 * Version      : 1.0
 * Purpose      : 반복문
 * Description  : while
 */
public class LoopWhile {

	public static void main(String[] args) {
		// while(조건식) 조건이 true이면 반복 (무한 루프 조심해야됨)
		int i=1;
		
		/*
		 * while(i <= 10) { System.out.println(i); i++; // i++ 없으면 계속 true 이니 무한루프에 빠짐 }
		 */
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		/*
		 * while (flag) { System.out.println("=============");
		 * System.out.println("이름을 입력하시오.(종료 하려면 q)");
		 * 
		 * String nm = scan.nextLine(); if(nm.equals("q")) { flag = false; }else {
		 * System.out.println(nm + "님 환영합니다."); } System.out.println("=============");
		 * 
		 * }
		 */
		
		// while 문으로 2 ~ 9 단을 출력하시오
		// 변수의 사용 scope 잘 생각하세요.
		
		int a=2;
		
		while(a<=9) {
			System.out.println(a+"단");
			
			int b=1;
			while(b<=9) { 
				System.out.printf("%d x %d = %d \n" , a , b , (a*b) ); 
				b++; 
			}
			a++;
		}
		

	}

}
