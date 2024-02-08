package testInterface.ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		// 구현 객체 선언 후 구현 클래스 타입의 참조 변수에 넣고 있음
		InterfaceImpl impl =  new InterfaceImpl();
		
		/*
		 * 부모 인터페이스인 InterfaceA, InterfaceB에 대해 구현 객체를 생성했을 때는 
		 * 부모 인터페이스의 추상 메서드만 사용 가능
		 * 그러나 부모 인터페이스들을 상속받은 InterfaceC 대한 구현 객체를 생성했을 때는
		 * 부모 인터페이스의 추상메서드와 자식 인터페이스 추상메서드
		 * 즉 부모 자식 추상메서드를 모두 사용할 수 있음
		 */
		InterfaceA a = impl;			
		a.methodA();
		
		InterfaceB b = impl;
		b.methodB();
		
		InterfaceC c = impl;
		c.methodA();
		c.methodB();
		c.methodC();
		
	}

}
