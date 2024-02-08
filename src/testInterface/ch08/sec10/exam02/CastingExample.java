package testInterface.ch08.sec10.exam02;

public class CastingExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();		// 구현 클래스인 Bus의 구현 객체가 Vehicle 인터페이스로 자동 타입 변환
		
		// 인터페이스를 통해서 호출
		vehicle.run();
		
		/*
		 * 구현 클래스인 Bus에 정의된 checkFare() 메서드를 호출하기 위해서는
		 * Bus 구현 객체를 대입한 Vechicle타입의 참조변수를
		 * Bus 타입의 참조변수에 대입하여 강제 타입 변환 시켜주어야 사용할 수 있다.
		 */
		//강제타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}

}
