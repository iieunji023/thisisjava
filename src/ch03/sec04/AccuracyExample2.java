package ch03.sec04;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		double totalpieces = apple * 10;
		int number = 7;
		
		double result = totalpieces - number;
		System.out.println("10조각에서 남은 조각:  " + result);
		System.out.printf("사과 1개에서 남은 양: %.2f\n", result);
		
	}

}
