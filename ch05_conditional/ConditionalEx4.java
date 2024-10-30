package ch05_conditional;

public class ConditionalEx4 {

	public static void main(String[] args) {
		/*
		 * 거꾸로 트리를 5층 만들어 주세요.
		 * 실행결과
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		
		String star = "*****";
		//System.out.println(star.substring(0,3));
		int num = 0;
		int i =5;
		while(num<=5) {
			//System.out.println(star);
			
			if(i>=1) {
				System.out.println(star = star.substring(0,i));
				num++;
				i--;
				
			}
		}
		String star2 = "*****";
		
		// 교수님 버전
		for(int j=5; j > 0; j--) {
			String suStr = star2.substring(0, j);
			System.out.println(suStr);
			
		}
		// 2번째
		for(int j=5; j > 0; j--) {
			for(int a=0;a<j;a++) {
				System.out.println("*");
			}
			System.out.println();
			
		}
		
		
	}

}
