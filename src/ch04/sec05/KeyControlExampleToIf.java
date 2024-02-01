package ch04.sec05;

import java.util.Scanner;

public class KeyControlExampleToIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.증감 | 2.감속 | 3.중지");
			System.out.println("---------------------");
			System.out.println("선택: ");

			String str = sc.nextLine();
			
			if(str.equals("1")){
				speed ++;
				System.out.printf("현재 속도= %d \n\n", speed);
				
			} else if(str.equals("2")) {
				speed --;
				System.out.println("현재 속도= " + speed);
				
			} else if(str.equals("3")) {
				run = false;
//				break;
				
			} else {
				System.out.println("다시 선택하세요.");
				
			}
		}
		System.out.println("종료");
		
	}
}
