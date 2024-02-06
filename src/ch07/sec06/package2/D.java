package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A{
	// 생성자 선언
	public D() {
		// A() 생성자 호출
		super();					//O
	}
	
	/*
	 * 다른 패키지이지만, A Class를 상속받고 있기 때문에 사용이 가능하다.
	 */
	// 메소드 선언
	public void method1() {
		// A 필드값 변경
		this.field = "value";		//O
		// A 메소드 호출
		this.method();				//O
		
	}
	
	/*
	 * 직접 객체를 생성해서 사용하는 것은 불가, 상속을 통해서만 사용가능!
	 */
	// 메소드 선언
	public void method2() {
		A a = new A();				//X
		a.field = "value";			//X
		a.method();					//X
			
	}
	

}
