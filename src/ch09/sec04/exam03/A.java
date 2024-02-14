package ch09.sec04.exam03;

public class A {
	public void method1(int arg) {
		int var = 1;
		
		//로컬 클래스
		class B{
			// 메소드
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				
			}
			
		}
		
		// 로컬 객체 생성
		B b = new B();
		b.method2();
		
	}

}
