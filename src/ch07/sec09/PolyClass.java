package ch07.sec09;

/*
 * java는 다중상속이 불가
 */
class  Car {
	// 필드 선언
	Model model;		
	
	// 메소드 선언
	void drive() {
		model.run();
		
	}
}

class Model {
	// 메소드 선언
	void run() {
		System.out.println("[Model] 차가 달린다.");
		
	}
}

class Avante extends Model {
	// Model 클래스의 run() 메소드 오버라이딩(재정의)
	void run() {
		System.out.println("[Avante] 아반떼가 달립니다.");
		
	}
}

class Ramborghini extends Model {
	// Model 클래스의 run() 메소드 오버라이딩(재정의)
		void run() {
			System.out.println("[Ramborghini] 람보르기니가 달립니다.");
			
		}
}

class Bentley extends Model {
	// Model 클래스의 run() 메소드 오버라이딩(재정의)
	void run() {
		System.out.println("[Bentley] 벤틀리가 달립니다.");
		
	}
}

public class PolyClass{
	public static void main(String[] args) {
		/*
		 * Bentley b = new Bentley(); // 인스턴스 멤버이므로 객체를 생성해야 한다. b.run();
		 * 
		 * Ramborghini r = new Ramborghini(); r.run();
		 * 
		 * Avante a = new Avante(); a.run();
		 */
		
		Car car = new Car();
		
//		Avante a = new Avante();
//		car.drive(a);
//		
//		Ramborghini r = new Ramborghini();
//		car.drive(r);
//		
//		Bentley b = new Bentley();
//		car.drive(b);
		
		car.model = new Model();				// model이라는 참조변수에 Model 클래스 객체를 넣어줌
		car.drive();
		
		car.model = new Avante();
		car.drive();
		
		car.model = new Bentley();
		car.drive();
		
		car.model = new Ramborghini();
		car.drive();
		
	}
}