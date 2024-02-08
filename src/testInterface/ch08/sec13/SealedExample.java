package testInterface.ch08.sec13;

public class SealedExample {
	public static void main(String[] args) {
		ImplClass impl = new ImplClass();
		
		InterfaceA a = impl;
		a.methodA();
		System.out.println();
		
		InterfaceB b = impl;
		b.methodA();
		b.methodB();
		System.out.println();
		
		InterfaceC c = impl;
		c.methodA();
		c.methodB();
		c.methodC();
		System.out.println();

	}

}
