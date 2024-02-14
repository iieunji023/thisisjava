package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) {
		try {
			findClass();
			
		} catch(ClassNotFoundException e) {
			System.out.println("예외처리:" + e.getMessage());
			
		}
			
	}
	
	public static void findClass() throws ClassNotFoundException {
		System.out.println("findClass()");
		Class.forName("java.lang.String2");
		
	}

}
