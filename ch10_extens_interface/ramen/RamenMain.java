package ch10_extens_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
		//Ramen ramen = new Ramen("진라면", 1000);  // 추상클래스는 객체로 만들 수 없음
		JinRamen jin = new JinRamen("진라면 기본", 1000);
		jin.printRecipe();
		
		JjaPpagheit jja = new JjaPpagheit("짜파게티", 1200);
		jja.printRecipe();
	}

}
