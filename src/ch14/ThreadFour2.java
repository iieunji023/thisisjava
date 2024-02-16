package ch14;

class MyClass{
	private int count;
	
	public void increment() {
		count ++;		// count를 1씩 증가시킴
		
	}
	
	public void decrement() {
		count --;		// count를 1씩 감소시킴
		
	}
	
	public void getCount() {
		System.out.println("count: " + count);
		
	}
}
	
	class Thread1 implements Runnable {
		private MyClass myClass1;
		
		Thread1(MyClass myclass1) {
			this.myClass1 = myclass1;
			
		}
		
		@Override
		public void run() {
			myClass1.increment();
			
		}
		
	}
	
	class Thread2 implements Runnable {
		private MyClass myClass2;
		
		Thread2(MyClass myClass2) {
			this.myClass2 = myClass2;
			
		}
		
		@Override
		public void run() {
			myClass2.decrement();
			
		}
		
	}

public class ThreadFour2 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		Runnable mc1 = new Thread1(mc);
		Runnable mc2 = new Thread2(mc);
		
		for(int i = 0; i < 10000; i ++) {
			Thread thread1 = new Thread(mc1);
			Thread thread2 = new Thread(mc2);
			
			thread1.start();
			thread2.start();
			
			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		mc.getCount();
		
	}
	
}
