package prj01;

import java.util.Scanner;

/*
 * q = 종료, 반복 시 그 외 아무 키
 */
public class Calc03Class2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산기를 실행하시겠습니까? ");
		System.out.println("종료를 원하실 경우 Q를 눌러주세요. ");
		String run = sc.nextLine();
		
		while(! run.equals("q")) {
//			System.out.println("------------------------------------------");
//			System.out.println("수행하실 연산을 선택하세요.");
//			System.out.println("1. 더하기 2.빼기 3.곱하기 4.나누기");
//			System.out.println("-------------------------------------------");

//			String cal = sc.nextLine();

			System.out.println("첫번째 숫자를 입력하세요");
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.println("두번째 숫자를 입력하세요");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			System.out.println("------------------------------------------");
			System.out.println("수행하실 연산을 선택하세요.");
			System.out.println("1. 더하기 2.빼기 3.곱하기 4.나누기");
			System.out.println("-------------------------------------------");

			String cal = sc.nextLine();
			
			int result;
			
			if(cal.equals("1")) {
				result = num1 + num2;
				System.out.printf("num1: %d \t num2: %d \n", num1, num2);
				System.out.printf("값: %d \n\n ", result);
				
			} else if(cal.equals("2")) {
				result = num1 - num2;
				System.out.printf("num1: %d \t num2: %d \n", num1, num2);
				System.out.printf("값: %d \n\n ", result);
				
			} else if(cal.equals("3")) {
				result = num1 * num2;
				System.out.printf("num1: %d \t num2: %d \n", num1, num2);
				System.out.printf("값: %d \n\n ", result);
				
			} else if(cal.equals("4")) {
				result = num1 / num2;
				System.out.printf("num1: %d \t num2: %d \n", num1, num2);
				System.out.printf("값: %d \n\n ", result);
				
			} else if(run.equals("q")) {
				break;
				
			} else {
				System.out.println("다시 선택해주세요.");
				
			}
			
		}
		System.out.println("종료");

		}
		
	}

