package ch07.sec06.package1;

public class B {
	// 메소드 선언
	public void method() {
		/*
		 * A 객체와 같은 패키지 내에 있기 때문에 protected 접근 제한자라도 사용할 수 있음
		 */
		A a = new A();			//O
		a.field = "value";		//O
		a.method();				//O
		
	}

}
