package prj01;

import java.util.Scanner;

public class Calc01Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("1>> ");
//		String str = sc.nextLine();
//		System.out.println(str);
//		
//		System.out.print("2>> ");
////		int inputData = sc.nextInt();
//		int inputData = Integer.parseInt(sc.nextLine());		// sc.nextInt();는 마지막 개행문자(엔터)를 제거하지 않음.
//																// 이런 경우 다음 sc.nextLine();에 엔터가 먹혀서 값을 넣지 못하는 문제 발생
//		System.out.println(inputData);
//
////		sc.nextLine();			
//
//		System.out.println("3>> ");
//		String str1 = sc.nextLine();
//		System.out.println(str + inputData + str1);
		
		while(true) {
		System.out.println("숫자를 입력하세요.");
		int str1 = sc.nextInt();
		sc.nextLine();
		System.out.println(str1);
		
		System.out.println("숫자를 입력하세요.");
		int str2 = sc.nextInt();
		sc.nextLine();
		System.out.println(str2);
		
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기");
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
				System.out.println(str1 + str2);
				
			break;
			
			case 2:
				System.out.println(str1 - str2);
				
			break;
			
			case 3:
				System.out.println(str1 * str2);
				
			break;
			
			case 4:
				System.out.println(str1 / str2);
				
			break;
			
			case 5:
				break;
		
		}
//		sc.close();

		}
		
	}

}
