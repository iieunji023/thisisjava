package ch02.sec12;

import java.util.Scanner;

public class PrintTest {
	
	public static void main(String[] args) {
		String name = "이은지";
		int age = 27;
		
		System.out.println("나의 이름은 " + name + ", 나이는 " + age + "입니다.");
//		System.out.printf\ln("나의 이름은 %s이고 나이는 %d입니다. ", name, age);
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("이름을 입력해주세요.");
		String inputData = scanner.nextLine();
		System.out.println(inputData);
		
	}

}
