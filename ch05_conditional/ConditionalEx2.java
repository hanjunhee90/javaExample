package ch05_conditional;

public class ConditionalEx2 {

	public static void main(String[] args) {
		// 각자리의 수를 더한 값을 출력하시오
		// 출력결과 : 2 + 9 + 8 = 19
		// ex) 문자열로 한자리씩 or 각 자리를 나눠서
		// ex) 문자열로 형변환은 String.valueOf(숫자) or 숫자 + ""
		int num = 298;
		
		String str = String.valueOf(num);
		
		//System.out.println("str = "+str.length());
		
		int sum1;
		int sum2;
		int sum3;
		
		int a = num / 100;
		int b = num % 100;
		int c = b /10;
		int d = num % 10;
		/*
		 * System.out.println("a= "+a); System.out.println("b="+b);
		 * System.out.println("c="+c); System.out.println("d="+d);
		 */
		
		if (str.length() == 3) {
			sum1= num / 100; 
		
			if(str.length()-1 == 2) {
				sum2 = (num%100) /10;
	
				if(str.length()-2 == 1) {
					sum3 = num %10;
					
					System.out.println(sum1+sum2+sum3);
				}
			}
		}
		
		//System.out.println(b);
		
		

	}

}
