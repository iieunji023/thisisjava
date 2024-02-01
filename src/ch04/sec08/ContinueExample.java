package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
				
			}
			System.out.print(i + " ");	// continue문을 쓰면 해당 명령을 실행하지 않고, 다시 for문으로 올라감
			
		}
		
	}

}
