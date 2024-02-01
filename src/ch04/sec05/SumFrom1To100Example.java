package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;			// i++; 이 없으면 계속 1씩 더해지므로 무한루프에 빠질 수 있음
			
		}
		System.out.println("1 ~ " + (i-1) + "합: " + sum);

	}
}
