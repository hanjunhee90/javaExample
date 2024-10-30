package ch05_conditional;

/**
 * class Name   : ConditionalMail
 * Author       : JunHee
 * Created Date : 2024. 8. 6.
 * Version      : 1.0
 * Purpose      : 조선문
 * Description  : if & swich
 */
public class ConditionalMail {

	public static void main(String[] args) {
		int score = 85;
		String grade = "";
		if(score >= 90) { // if문 해당 조건이 true 이면 해당 영역으로 잔입({})
			grade = "A";
		}else if(score >= 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(score + " 는" + grade);
		
		int price = 3000;
		int myMoney = 1000;
		if(price > myMoney) {
			System.out.println("돈이 부족합니다..");
		}else {
			System.out.println("돈이 충분합니다.");
		}
		
		// 조건 1 : 이름은 1글자 이상
		// 조건 2 : 전화번호는 10 or 11자리
		// 조건1이 만족 하지 않으면 (가입 실패)
		
		String nm = "팽수";
		String phone = "0101111111";
		if(nm.length() >= 1) {
			if(phone.length() == 10 || phone.length() == 11) {
				System.out.println("환영합니다.");
			}else {
				System.out.println("가입실패!!");
			}
		}else {
			System.out.println("가입실패!");
		}
		
	}

}
