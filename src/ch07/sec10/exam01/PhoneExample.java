package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone(); --> 추상클래스는 클래스의 공통적인 필드나 메소드를 추출해서 선언한 클래스이므로 
										// new 연산자를 사용해서 객체 생성을 할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
