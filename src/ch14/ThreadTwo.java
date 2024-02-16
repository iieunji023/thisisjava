package ch14;

public class ThreadTwo extends Thread{

	@Override
	public void run() {
		System.out.printf("[ThreadTwo] %s START \n", getName());
		
		try {
			Thread.sleep(1000);			// 1초동안 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("[ThreadTwo] %s STOP \n", getName());
		
	}

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			ThreadTwo thread = new ThreadTwo();
			thread.start();
			
			try {
				thread.join();		//  thread가 10개 실행될 때까지 자식 스레드 정지 시켜놓음	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
