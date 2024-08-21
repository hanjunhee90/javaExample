package ch13_thread.issac;

import java.util.LinkedList;
import java.util.Queue;

public class Issac {

	private int toast = 0;
	// Queue first in first out
	private final Queue<String> orderList = new LinkedList<String>();
	private Issac() {
		
	}
	// 싱글톤 적용  
	private static Issac Instance = new Issac();
	
	// chef 와 customer 에서도 싱글톤인 이삭 클래스 사용하기위해
	public static Issac getntance() {
		return Instance;
	}
	// 토스트 만들기 (chef 클래스가 사용)
	// 멀티 스레딩 환경에서 여러 스레드가 동시에 같은 객체나 메서드 블록에 접근하는
	// 것을 방지하기 위해 synchronized (동기화 유지 시켜줘야함)
	public synchronized void makeToast() {
		toast += 1;
		System.out.println("토스트를 1개 만들었습니다. 재고:"+ toast);
		notifyAll(); // 대기중(wait)인 모든 스레드를 깨운다.
	}
	// 토스트 구매(customer 클래스가 사용)
	public synchronized void buyToast(String name, int count) {
		orderList.add(name);
		//peek은 처음께 뭔지
		while(orderList.peek() != name || toast < count) {
			try {
				wait(); // 현재 주문이 맨 앞이 아니거나, 토스트가 충분하지 않으면 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		toast -= count;
		System.out.println(name + "에게 토스트를 " + count + "개 팔았습니다.");
		orderList.remove();  // 처리된 주문제거(큐 구조여서 처음꼐 삭제됨)
		notifyAll(); // 다음 대기중인 주문 처리를 위해 모든 스레드 깨움.
	}
}
