package ch10_extens_interface.family;

/**
 * class Name   : Parent
 * Author       : JunHee
 * Created Date : 2024. 8. 16.
 * Version      : 1.0
 * Purpose      : 상속
 * Description  : 기본 상속방법
 */
public class Parent {

	private String name;
	private int age;
	
	public Parent(String name, int age) {
		// super() 부모 생성자 호출
		// java는 Object를 기본으로 상속받음
		super();  // object 상속  호출
		this.name = name;
		this.age = age;
	}
	

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}



	// 오버라이딩 부모의 메서드를 재정의(override)해서 사용
	// 즉 부모에게는 toString()이라는 동일한 이름의 메서드가 있음. 하지만 재정의해서 다르게 사용할 수 있음.
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	public void sayHello() {
		System.out.println("부모 입니다. 소리 질러~!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
