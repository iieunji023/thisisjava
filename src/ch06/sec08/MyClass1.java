package ch06.sec08;

public class MyClass1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		double x = 1.2;
		double y = 2.4;
		
		plus(a, b);
		plus(x, y);
		plus(a);
		plus(a, x);			// 자동 형변환됨
		
	}
	
	/*
	 * 메서드 오버로딩
	 */
	public static void plus(int a, int b) {
		System.out.println("[MyClass1] plus()");

		int res = a + b;
		System.out.printf("res: %d \n", res);
		
	}
	
	public static void plus(double x, double y) {
		System.out.println("[MyClass1] plus1()");

		double res = x + y;
		System.out.printf("res: %.2f \n", res);
		
	}
	
	public static void plus(int a) {
		System.out.println("[MyClass1] plus2()");

		int res = a;
		System.out.printf("res: %d \n", res);
		
	}
	
	
}
