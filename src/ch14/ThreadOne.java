package ch14;

/*
public class ThreadOne {
	public static void main(String[] args) {
		Thread tc = Thread.currentThread();		// 객체 생성없이 Class이름인 Thread로 접근하고 있음. 즉 static 멤버라는 것을 알 수 있음
		System.out.println(tc.getName());
		
	}

}
*/

public class ThreadOne extends Thread {
	@Override
	public void run() {
		System.out.println("[ThreadOne] run()");
		
	}
	
	public static void main(String[] args) {
		ThreadOne thread = new ThreadOne();
		thread.start();
		
	}

}