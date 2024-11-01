package ch13_thread.issac;

public class Customer extends Thread{
	private Issac issac = Issac.getntance();
	private String name;
	private int count;
	
	public Customer(String name, int count){
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		issac.buyToast(name, count);
	}
	
	
}
