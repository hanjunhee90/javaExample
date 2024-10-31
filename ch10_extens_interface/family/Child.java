package ch10_extens_interface.family;

// Child는 Parent를  상속받음 (extend)
public class Child extends Parent{

	public Child() {
		super();
		
	}

	public Child(String name, int age) {
		super(name, age); // 부모 생성자
		
	}

	
	
	@Override // 부모의 sayHello
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("자식입니다.>!!!!");
	}

	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
