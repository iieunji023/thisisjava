package prj01;

import java.util.Scanner;

public class Calc02Class2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("숫자를 입력하세요.");
		int str1 = sc.nextInt();
		sc.nextLine();
		System.out.println("str1: " + str1);
		
		System.out.println("연산자를 입력하세요.");
		String result = sc.next();
		sc.nextLine();
		
		System.out.println("숫자를 입력하세요.");
		int str2 = sc.nextInt();
		sc.nextLine();
		System.out.println("str2: " + str2);
		
		/*
		 * IF문
		 */
//		if(result.equals("+")) {
//			System.out.println("결과: " + (str1 + str2));
//			
//		} else if(result.equals("-")) {
//			System.out.println("결과: " + (str1 - str2));
//			
//		} else if(result.equals("*")) {
//			System.out.println("결과: " + (str1 * str2));
//			
//		} else if(result.equals("/")) {
//			System.out.printf("결과: %.1f \n", ((double) str1 / str2)
//					);
//		}
//			else if(String.valueOf(str1).equals("q")) {
//				break;
//				
//			}
//			
//		}
		
		/*
		 * Switch문
		 */
		switch(result) {
			case "+":
				System.out.println("결과: " + (str1 + str2));
				
			break;
			
			case "-":
				System.out.println("결과: " + (str1 - str2));
				
			break;
			
			case "*":
				System.out.println("결과: " + (str1 * str2));
				
			break;
			
			case "/":
				System.out.printf("결과: %.1f \n", ((double)str1 / str2));
				
			break;
			
			case "q":
//				sc.close();
				break;
				
		}
//		sc.close();

		}
		
	}

}
