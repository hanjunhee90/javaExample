package ch06_method;

/**
 * class Name   : MethodMain
 * Author       : JunHee
 * Created Date : 2024. 8. 8.
 * Version      : 1.0
 * Purpose      : method
 * Description  : java의 함수 클래스에 종속되어 있는 method
 */
public class MethodMain {
	 
	//main 메소드 public이며 static 하여 어디서든 사용가능하고 void 리턴이 없는
	//매개변수는 한개 (String[] 배열타입)
	public static void main(String[] args) {
		printSum(1, 100); // 메소드 실행
		int resultSum = returnSum(5, 100);
		System.out.println(resultSum);
		print("프린트"); 
		// ctrl + 메소드 클릭(메소드 선언 내용으로 이동)
		// alt + <   방향키 왼쪽(이전 코드로 이동)
		print(returnSum(20,40));
		System.out.println(fac(10));
		System.out.println(fac(15));

	}

	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i=from;i <= to; i++) {
			sum += i;
		}
		System.out.printf("from : %d 부터 to: %d 까지 합은 : %d \n", from, to, sum);
	}
	
	public static int returnSum(int from, int to) {
		int sum = 0;
		for(int i=from;i <= to; i++) {
			sum += i;
		}
		return sum;  // 리턴 타입에 맞아야함.
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	//메소드 오버로딩 동일한 이름의 메소드를 다른 입력과 다른 리턴으로 정의할 수 있음.
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	// 팩토리얼 메소드를 만드시오
	// intput : int
	// output : long
	
	public static long fac(int from) {
		long result = 1;
		for(int i=1; i <= from; i++) {
			result *=i;
		}
		return result;
	}
	
	
		
}
