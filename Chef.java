package ch13_thread.issac;

public class Chef extends Thread{
	private Issac issac = Issac.getntance();
	private int count;
	public EndCook endCook;
	
	public Chef(int count) {
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 0; i < count; i++) {
			try {
				Thread.sleep(1000); //1초에 1개의 토스트 생산
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			issac.makeToast();
		}
		endCook.endOfCook();
	}
	
	
}
