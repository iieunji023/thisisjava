package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		// 1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
			
		}
		
		//  ExecuteService 생성(작업 개수가 많아지면 최대 5개까지 스레드를 생성시켜 작업을 처리한다.)
		ExecutorService executorService = Executors.newFixedThreadPool(5);		// 작업 큐가 만들어짐. 대기할 수 있는 스레드 수는 5개
		
		// 이메일을 보내는 작업 생성 및 처리 요청
		for(int i = 0; i < 1000; i++) {
			final int idx = i;					// i를 idx라는 변수에 담아준 이유 -> 
			executorService.execute(new Runnable() {		// execute 메서드 안에 익명 구현 객체를 만듦

				// 18행에 만들어 놓은 작업 큐에 대기시켜 놓을 작업내용
				// 즉 놀고 있는 스레드는 작업 큐에 대기중인 작업 내용을 들고 가는데, 그때 들고 가는 것이 run() 메서드
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];				
					String to = mails[idx][1];
					String content = mails[idx][2];
					
					System.out.printf("[%s] %s ==> %s: %s \n", thread.getName(), from, to, content);
				
				}
			});
			
		}
		
		// ExecuteService 종료
		executorService.shutdown();
		
	}

}
