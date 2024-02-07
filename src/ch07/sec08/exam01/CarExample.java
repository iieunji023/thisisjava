package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		/*
		 * mycar의 tire 멤버변수에 Tire 객체 장착
		 * myCar의 tire필드는 Tire 타입을 가지고 있음
		 * 따라서, Tire타입 또는 Tire를 상속받은 클래스의 객체를 대입할 수 있다.
		 */
		myCar.tire = new Tire();
		myCar.run();
		
		// HangookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		// KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
	}

}
