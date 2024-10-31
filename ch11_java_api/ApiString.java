package ch11_java_api;

public class ApiString {

	public static void main(String[] args) {
		String a = "팽수";
		System.out.println(a);
		System.out.println(a.hashCode()); // 주소
		
		a = "팽순";
		System.out.println(a);
		System.out.println(a.hashCode());
		
		//String 은 불변(immutable)으로
		// 한번 초기화 되면 그 값이 변경되지 않음
		// 변수에서 값 할당시 바뀌는건 새로운 객체를 만든것임
		// 메모리 영역에서 매번 새로운 String 객체를 만들면 카비지컬렉터(메모리관리)에서 할 일이 많아짐.
		// 그래서 변경이 많다면 StringBuffer 클래스 사용
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("hi");
		System.out.println(strBuffer);
		strBuffer.append("hello");
		System.out.println(strBuffer);
		
		// 문자열 가져오기
		String str = strBuffer.toString();
		System.out.println(str);

	}

}
