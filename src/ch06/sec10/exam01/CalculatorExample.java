package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;			// 따로 객체를 생성하지 않고 미리 만들어 둔 Calculator class를 통해 정적멤버를 사용
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.printf("pi: %.3f \n", result1);
		System.out.printf("result2: %d \n", result2);
		System.out.printf("result3: %d", result3);
		
	}

}
