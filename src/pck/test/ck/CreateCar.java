package pck.test.ck;

// 클래스에는 필드, 메소드가 존재
class Car{	
	String modelName;		//멤버변수 == 필드 == 속성
	String carColor;
	int carYear;
	
}

public class CreateCar {
	public static void main(String[] args) {
		/* car 타입의 변수 c에 car 클래스의 객체를 집어넣어라 */ 
		// 객체 생성(디폴트 생성자 호출)
		Car c1 = new Car();			// Class 자체가 하나의 자료형으로 생성자를 만들지 않아도 사용할 수 있음. 
									// 이를 디폴트 생성자라고 함(컴파일러가 자동으로 만들어줌)
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.modelName = "테슬라";
		c2.modelName = "람보르기니";
		c3.modelName = "부가티";
		
		System.out.println(c1.modelName);
		System.out.println(c2.modelName);
		System.out.println(c3.modelName);
		
	}

}
