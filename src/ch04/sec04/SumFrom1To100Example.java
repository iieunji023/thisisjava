package ch04.sec04;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			 sum += i;			// 누적 시키는 변수는 반드시 0으로 초기화를 시켜줘야 함
			
		}
		System.out.printf("1 ~ " + (i-1) + " 합: %d\n", sum);
		
	}

}
