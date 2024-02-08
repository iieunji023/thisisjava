package testInterface.ch08.sec10.exam01;

interface A {

}

class B implements A {
	
}

class C implements A {
	
}

// b , a 
class D extends B {
	
}

// c, a
class E extends C {
	
}

public class PromotionClass {
	public static void main(String[] args) {
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 인터페이스 변수 선언
		A a;
		
		// 변수에 구현 객체 대입
		a = b;		//자동 타입 변환
		a = c;		//자동 타입 변환
		a = d;		//자동 타입 변환
		a = e;		//자동 타입 변환
				
	}
	
	
}
