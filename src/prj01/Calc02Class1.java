package prj01;

import java.util.Scanner;

public class Calc02Class1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int str1 = sc.nextInt();
		sc.nextLine();
		System.out.println("str1: " + str1);
		
		System.out.println("숫자를 입력하세요.");
		int str2 = sc.nextInt();
		sc.nextLine();
		System.out.println("str2: " + str2);
		
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.종료");
		int result = sc.nextInt();
		sc.nextLine();
		
		/*
		 * IF문
		 */
//		if(result == 1) {
//			System.out.println(str1 + str2);
//			
//		} else if(result == 2) {
//			System.out.println(str1 - str2);
//			
//		} else if(result == 3) {
//			System.out.println(str1 * str2);
//			
//		} else if(result == 4) {
//			System.out.println(str1 / str2);
//			
//		}
		
		/*
		 * Switch문
		 */
		switch(result) {
			case 1:
				System.out.println("결과: " + (str1 + str2));
				
			break;
			
			case 2:
				System.out.println("결과: " + (str1 - str2));
				
			break;
			
			case 3:
				System.out.println("결과: " + (str1 * str2));
				
			break;
			
			case 4:
				System.out.println("결과: " + (str1 / str2));
				
			break;
			
			case 5:
				sc.close();
				
				break;
				
		}
//		sc.close();

		}
		
	}

