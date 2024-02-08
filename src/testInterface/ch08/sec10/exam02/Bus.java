package testInterface.ch08.sec10.exam02;

public class Bus implements Vehicle{
	// 오버라이딩
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}
	
	// 추가 메소드
	public void checkFare() {
		System.out.println("추가 요금을 체크합니다.");
		
	}

}
