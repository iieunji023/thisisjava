package ch05.sec05;

import java.util.Scanner;

public class LengthExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요");
		String ssn = sc.nextLine();
		
//		String ssn = "9905012145418";
		int len = ssn.length();
		if(len == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
			
		} else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
			
		}
		
	}

}
