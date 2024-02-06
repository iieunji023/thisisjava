package ch06.sec10.exam03;

public class Car {
	// 인스턴스 필드 선언
	int speed;
	
	// 인스턴스 메소드 선언
	void run() {
		System.out.printf("%d으로 달립니다. \n", speed);
		
	}
	
	static void simulate() {
		// 객체 생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
		
	}
	
	public static void main(String[] args) {
		// 정적 메소드 호출 
		// -> 정적메소드인 main()에서 정적메소드를 호출할 때는 별도로 객체를 생성하지 않아도 사용가능
		simulate();
		
		// 인스턴스 멤버 사용
		// -> 인스턴스 멤버를 사용하기 위해서는 객체를 생성한 후 참조변수로 접근해야 함
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		
	}

}
