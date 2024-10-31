package ch10_extens_interface.starcraft;

public class Zealot extends StarUnit{
	
	private int shield;  // 질럿은 보호막이 있음

	public Zealot() {
		this("질럿", 16, 100, 1, 60);
		// TODO Auto-generated constructor stub
	}

	public Zealot(String name, int damage, int hp, int armor, int shield) {
		//이럴 경우는 부모 생성자가 무조건 와야함 ( super 메소드가 this처럼 밑에쓴것 보다 위에 와야한다는것)
		super(name, damage, hp, armor); 
		this.shield = shield;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	@Override
	public String toString() {
		return "Zealot [shield=" + shield + ", getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()="
				+ getHp() + ", getArmor()=" + getArmor() + "]";
	}
	
	
	

}
