package testInterface.ch08.sec12;

public class Taxi implements Vehicle{
	// 인터페이스 Vehicle의 메서드 오버라이딩
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
		
	}

}
