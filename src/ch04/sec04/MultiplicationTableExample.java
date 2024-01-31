package ch04.sec04;

import java.util.Scanner;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력할 단을 입력하세요.");
		int mul = sc.nextInt();
		System.out.println("[" + mul + "단" + "]");

//		for(int i = mul; i <= mul; i++) {
//			System.out.println("[" + i + "단" + "]");
			
			for(int n = 1; n <= 9; n++) {
				System.out.println(mul + "*" + n + "= " +  (mul * n));
				
			}
			
		}
		
	}

//}
