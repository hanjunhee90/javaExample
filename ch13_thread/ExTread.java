package ch13_thread;

/**
 * class Name   : ExTread
 * Author       : JunHee
 * Created Date : 2024. 8. 21.
 * Version      : 1.0
 * Purpose      : java thread
 * Description  : Thread 클래스를 상속받는 방법
 */
public class ExTread extends Thread{
	int num;
	
	public ExTread(int num, String name) {
		super(name);
		this.num = num;
	}

	@Override
	public void run() {
		
		for(int i = num; i <= num +5; i++) {
			// 현재 실행중인 Thread 이름 출력
			System.out.println(super.getName()+" "+ i);
			// 시간차를 두기 위해
			try {
				Thread.sleep(500); // 0.5초 딜레이
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
