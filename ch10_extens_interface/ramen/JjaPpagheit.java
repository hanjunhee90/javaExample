package ch10_extens_interface.ramen;

public class JjaPpagheit extends Ramen{

	public JjaPpagheit(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 비벼드세요.");
		System.out.println("스프를 비빌때는 불을 끄고 하시는게 맛있음.");
		
	}

	
}
