package ch06_method;

/**
 * class Name   : RecursionMain
 * Author       : JunHee
 * Created Date : 2024. 8. 8.
 * Version      : 1.0
 * Purpose      : method
 * Description  : recursion function
 */
public class RecursionMain {

	public static void main(String[] args) {
		
		System.out.println(recFactorial(10));
		
	}
	// factorial 재귀 함수 활용
	public static long recFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num* recFactorial(num-1);
		/*
		 * 3을 입력받았다면
		 * 3 * recFactorial(2)
		 * 3*2*recFactoial(1)
		 * */
	}
	
	public static void Func(int num) {

		if(num == 0) {  // 재귀함수는 멈추는게 중요함(잘못 작성하면 무한루프로)
			return;
		}else {
			System.out.println("h1");
			Func(num -1);
		}

	}
	

}
