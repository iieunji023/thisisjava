package ch14;

class MyClass{
	private int count;
	
	public synchronized void increment() {
		count ++;		// count를 1씩 증가시킴
		
	}
	
	public synchronized void decrement() {
		count --;		// count를 1씩 감소시킴
		
	}
	
	public void getCount() {
		System.out.println("count: " + count);
		
	}
}

public class ThreadFour {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i ++) {
					 myClass.increment();
					
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 10000; i ++) {
					myClass.decrement();
					
				}
			}
		});
		myClass.getCount();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
		myClass.getCount();
		
	}
	
}
