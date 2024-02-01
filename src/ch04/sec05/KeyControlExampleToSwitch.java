package ch04.sec05;

import java.util.Scanner;

public class KeyControlExampleToSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.증감 | 2.감속 | 3.중지");
			System.out.println("---------------------");
			System.out.println("선택: ");

			int button = sc.nextInt();
			sc.nextLine();
		
			switch(button) {
			case 1:
				speed ++;
				System.out.printf("현재 속도 = %d \n\n", speed);
				
				break;
				
			case 2:
				speed --;
				System.out.printf("현재 속도 = %d \n\n", speed);
				
				break;
				
			case 3:
				run = false;
				break;
				
				default:
					System.out.println("다시 선택하세요.");
			
			}
			
		}
		
		System.out.println("종료");
		
	}
}
