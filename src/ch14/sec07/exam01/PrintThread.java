package ch14.sec07.exam01;

public class PrintThread extends Thread{
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
		
	}
	
	@Override
	public void run() {
		while(!stop) {				// stop이 true가 되면 while문을 빠져나감
			System.out.println("실행중");
			
		}
		System.out.println("리소스 정리");
		System.out.println("실행종료");
		
	}

}
