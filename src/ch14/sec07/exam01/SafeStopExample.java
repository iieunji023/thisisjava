package ch14.sec07.exam01;

/*
 * 3초 후에 stop 필드 값을 true로 설정해서 PrintThread을 종료한다.
 */
public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
			
		} catch(InterruptedException e) {
			
		}
		printThread.setStop(true);
		
	}

}
