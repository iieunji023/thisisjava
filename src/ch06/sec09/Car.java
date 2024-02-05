package ch06.sec09;

public class Car {
	// 필드, 멤버변수 선언
	String model;
	int speed;
	
	// 생성자 선언
	Car(String model) {
		this.model = model;				// 매개변수 필드에 대입(this 생략 불가)
		
	}
	
	// 메소드 선언
	void setSpeed(int speed) {
		this.speed = speed;				// 매개변수 필드에 대입(this 생략 불가)
		
	}
	
	void run() {
		this.setSpeed(100);
		System.out.printf("%s가 달립니다. (시속: %d km/h) \n", this.model, this.speed);
		
	}
	
}
