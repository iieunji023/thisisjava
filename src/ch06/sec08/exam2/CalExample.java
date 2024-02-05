package ch06.sec08.exam2;

import java.util.Scanner;

public class CalExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int x = sc.nextInt();
		System.out.println("숫자를 입력해주세요.");
		int y = sc.nextInt();
		sc.nextLine();
		
		Cal c = new Cal(x, y);
		
		int result = c.plus();
		System.out.println(result);
		c.minus();
		c.mul();
		c.div();
		
		
	}

}
