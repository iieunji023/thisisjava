package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("x값 입력: ");
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
//		System.out.println("y값 입력: ");
//		String strY = scanner.nextLine();
//		int y = Integer.parseInt(strY);
//		
//		int result = x + y;
//		System.out.println("x + y: " + result);
//		System.out.println();
//		
//		System.out.println();
//		System.out.println("z값 입력: ");
//		String strZ = scanner.next();
//		System.out.printf("strZ값은 %s", strZ);
//		System.out.println();
//		System.out.println(scanner.nextLine());

		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		
		System.out.println("나이를 입력하세요.");
		String age1 = scanner.next();
		int age = Integer.parseInt(age1);
//		System.out.print(scanner.next());
//		
//		System.out.println("좋아하는 동물을 입력하세요.");
//		String pet = scanner.next();
//		
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
//		System.out.println("나의 이름은 " + name + ", 나이는 " + age);
		
		System.out.printf("나의 이름은 %s이고, 나이는 %d입니다.", name, age);
		System.out.println(scanner.nextLine());
		
//		System.out.println("좋아하는 동물: " + pet);
		System.out.println();
		
		while(true) {
			System.out.println("입력문자열: ");
			String data = scanner.nextLine();
			if(data.equals("q")) {
				break;
				
			}
			System.out.println("출력문자열: " + data);
			System.out.println();
		}
		scanner.close();
		System.out.println("종료");
		
	}

}
