package ch06.sec08.exam4;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성
		Calculator c = new Calculator();
		
		// 정사각형 넓이 구하기
		double result1 = c.areaRectangle(10);
		
		// 직사각형 넓이 구하기
		double result2 = c.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이: " + result1);
		System.out.println("직사각형 넓이: " + result2);
		
	}

}
