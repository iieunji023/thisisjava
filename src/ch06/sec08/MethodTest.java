package ch06.sec08;

public class MethodTest {
	int num;
	String name;
	
	/*
	 * method1 START(입력x, 출력x)
	 * method1 선언, 정의
	 */
	public static void method1() {				
		System.out.println("[MethodTest] method1()");
		
	}
	
	/*
	 * method2 START(입력 O)
	 */
	public static void method2(int num) {
		System.out.println("나는 입력 하나 갖는 메서드: " + num);
		
	}
	
	/*
	 * method3 START(입력 o, 출력 o)
	 */
	public static int method3(int num) {
		int n;		// 지역변수
		System.out.printf("나는 입력과 출력이 있는 메서드: 입력 %d, 출력 %d \n", num, num);
		n = num;
		
		return n;			// 메서드의 출력
		
	}
	
	public static void main(String[] args) {
		method1();		//method1() 메서드 호출 -> 실행
		method2(5);
		int res = method3(10);			// method3()에는 int 타입의 출력이 있으므로 담아줄 변수가 필요
		System.out.println("리턴 값: " + res);
		
	}

}
