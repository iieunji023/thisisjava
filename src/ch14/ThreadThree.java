package ch14;

public class ThreadThree implements Runnable {

	@Override
	public void run() {
		System.out.printf("[ThreadThree] %s START \n", Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		
		System.out.printf("[ThreadThree] %s STOP \n", Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Runnable task = new ThreadThree();			// 1. 구현객체 생성
			Thread thread = new Thread(task);			// 2. 스레드 객체 생성
														// 스레드 객체를 생성하는 이유는 멀티 스레드를 위해서.. 구현 객체만 생성하면 메인 스레드만 실행되므로 멀티 스레드가 아님
//			Thread thread = new Thread(new ThreadThree());
			thread.start();
			try {
				thread.join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			} 
			
		}
		
	}
	
}
