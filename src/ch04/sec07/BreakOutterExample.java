package ch04.sec07;

public class BreakOutterExample {
	public static void main(String[] args) {
		Outter : for(char upper = 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') 
					break Outter;			// break를 쓴 for문 뿐만 아니라 Outter for인 전체 for문을 빠져나옴
				
			}
			
		}
		System.out.println("프로그램 실행 종료");
		
	}

}
