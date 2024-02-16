package ch14.sec07.exam03;

public class PrintThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("실행중");
			
			if(Thread.interrupted()) {
				break;				// `break`는 반복을 종료시키는 구문으르
									// 가장 가까운 반복문인 while문을 빠져 나가게 된다.
				
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
		
	}

}
