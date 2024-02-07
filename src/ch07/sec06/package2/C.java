package ch07.sec06.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	// 메소드 선언
	public void method() {
		/*
		 * 다른 패키지고, 자식 객체도 아니므로 사용이 불가능하다.
		 */
		A a = new A();			//X
//		a.field = "value";		//X
//		a.method();				//X
		
	}

}
