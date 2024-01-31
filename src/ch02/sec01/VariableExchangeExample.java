package ch02.sec01;

// class는 중괄호{}, 함수는 소괄호()
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp = x;	// 3 
		x = y;			// 5
		y = temp;		// 3
		System.out.println("x: " + x + ", y: " + y);
		
	}

}
