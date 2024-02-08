package testInterface.ch08.sec11.exam01;

public class Car {
	// 필드
	Tire tire1 = new HankookTire();			// 자동 타입 변환(구현 클래스 -> 인터페이스)
	Tire tire2 = new HankookTire();			// 자동 타입 변환(구현 클래스 -> 인터페이스)
	
	// 메소드
	void run() {
		tire1.roll();
		tire2.roll();
		
	}

}
