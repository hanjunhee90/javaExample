package ch09_class.typing;

import java.util.ArrayList;

public class Dictionary {
	// 전역적으로 사용하는 상수
	public static final int OPTION_STUDENT_NAME = 0; // 보통 상수는 대문자로
	public static final int OPTION_CODING_WORD = 1; // 보통 상수는 대문자로
	public static final int OPTION_RANDOM_ALPHABET = 2; // 보통 상수는 대문자로
	
	// 타자연습 게임을 위한 단서 생성기
	public static ArrayList<String> makeWordList(int option){
		ArrayList<String> result = new ArrayList<String>();
		// option 0 학생이름, 1 코딩영어, 2 랜덤 알파벳
		if(option == OPTION_STUDENT_NAME) {
			result.add("kang minho");
			result.add("kwon cheolgyu");
			result.add("kim yoona");
			result.add("kim jungin");
			result.add("kim hyewon");
			result.add("park jungho");
			result.add("seo wonbin");
			result.add("ahn seoryeong");
			result.add("lee sohee");
			result.add("lee seungwook");
			result.add("lee wonho");
			result.add("jeon youngbeom");
			result.add("jeon jonghwa");
			result.add("jung dohyun");
			result.add("choi daejun");
			result.add("choi jieun");
			result.add("han junhee");
			
		}else if (option == OPTION_CODING_WORD) {
			result.add("Class");
			result.add("void");
			result.add("static");
			result.add("string");
			result.add("int");
			result.add("for");
			result.add("if");
			result.add("public");
			result.add("throws");
			result.add("try");
			result.add("continue");
			result.add("while");
			result.add("default");
			result.add("boolean");
			result.add("byte");
			result.add("case");
			result.add("char");
			result.add("const");
			result.add("finally");
			result.add("float");
			result.add("native");
			result.add("goto");
			result.add("do");
			result.add("double");
			result.add("extends");
			result.add("final");
			result.add("import");
			result.add("interfase");
			result.add("long");
			result.add("package");
			result.add("private");
			result.add("protected");
		}else if(option == OPTION_RANDOM_ALPHABET) {
			// 랜덤 알파벳 6자리
			// 10개 생성
			//int rand =((int)Math.random()*26)+1;
			//char alp = (char)rand;
			
			
			String[] alphabet = "qwertyuiopasdfghjklzxcvbnm".split("");
			
			ArrayList<String> cc = new ArrayList<String>();
			int count = 0;
			
			while (true) {

				for (int j = 0; j < alphabet.length; j++) {

					int rand = (int) (Math.random() * 26);
					cc.add(alphabet[rand]);

					if (cc.size() == 6) {
						result.add(String.join("", cc));
						
					}
					/*
					 * if(result.size()==10-1) { break; }
					 */
					
				}

			}
		}
		
		return result;
	}
	
}
