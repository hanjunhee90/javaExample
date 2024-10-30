package ch05_conditional;

import java.util.Scanner;

public class ConditionalEx1 {

	public static void main(String[] args) {
		/*
		 * 사용자로 부터 숫자를 입력 받아 짝수인지 홀수인지 판별하시오.
		 * 조건1 : 정수만 입력받음.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		// if문을 사용하여 짝수이면 "짝수" 출력 (짝수 판별은 산술 연산자 사용)
		//                     or "홀수"
		
		
		//int inputNum = scan.nextInt();
		int inputNum = Integer.parseInt(scan.nextLine());
		//System.out.println(inputNum);
		
		
		if(inputNum % 2 == 0) {
			System.err.printf("%d 는 %s 입니다.", inputNum, "짝수");
		}else {
			System.out.printf("%d 는 %s 입니다.", inputNum, "홀수");
		}
		
		
		
	}

}
