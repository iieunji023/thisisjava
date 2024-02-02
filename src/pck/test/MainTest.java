package pck.test;

public class MainTest {		// class를 사용하기 위해서는 객체가 있어야 함
	public static void main(String[] args) {
		System.out.printf("args.length: %d \n ", args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		}
		
	}

}
