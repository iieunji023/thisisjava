package prj01;

import java.util.Scanner;

/*
 * q = 종료, 반복 시 그 외 아무 키
 */
public class Calc04Class1 {
	//덧셈 method
	public static void sum(int a, int b) {
			System.out.println("a + b = " + (a+b));
	}
	
	//뺄셈 method
	public static void sub(int a, int b) {
		System.out.println("a - b = " + (a-b));
		
	}
	
	//곱셈 method
	public static void mul(int a, int b) {
		System.out.println("a * b = " + (a*b));
		
	}
	
	//나눗셈 method
	public static void div(int a, int b) {
		System.out.printf("a / b = %.2f \n", (double)a / b);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력, 계산, 종료
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int a = sc.nextInt();
			System.out.println("숫자를 입력하세요.");
			int b = sc.nextInt();
			sc.nextLine();
			
			// 계산 반복(연산자 잘못 입력시 돌아오기 위해 while문 사용)
			while(true) {
			System.out.println("연산자를 입력하세요.");
			String cal = sc.nextLine();
			
			if(cal.equals("+")) {
				sum(a, b);
				
			} else if(cal.equals("-")) {
				sub(a,b);
				
			} else if(cal.equals("*")) {
				mul(a,b);
				
			} else if(cal.equals("/")) {
				div(a,b);
				
			} else {
				System.out.println("연산자를 다시 입력해주세요.");
				continue;			// while문으로 돌아가라
				
			}
			System.out.println("계속 진행하시겠습니까?(Q입력시 종료)" );
			String quit = sc.nextLine();
			if(quit.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
				
			} 
			}
			
			
		}
		
	}
}

