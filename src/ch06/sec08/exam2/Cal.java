package ch06.sec08.exam2;

public class Cal{
	int x;
	int y;				
	
	// 생성자
	Cal(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	// 사칙연산 METHOD START
	public int plus() {					// 처음 public int plus(int x, int y)를 입력했음. 
										// 그러나 plus는 멤버함수이므로
										// 멤버변수 x, y를 사용하기 때문에 굳이 매개변수를 받지 않아도 사용가능
										// ※ 매개변수를 쓰게 되면 캡슐화에 위배됨. 외부에서 접근하면 안되는데,  
		int result = x + y;
		System.out.println(result);

		return result;
		
	}
	
	public int minus() {
		int result = x - y;
		System.out.println("x - y = " + (x-y));

		return result;
		
	}
	
	public void mul() {
		int result = x * y;
		System.out.println("x * y = " + (x*y));

		//return result;
		
	}
	
	public double div() {
		double result = (double) x / (double) y;
		System.out.println("x / y = " + (x/y));

		return result;
		
	}
	// 사칙연산 METHOD END

}
