package ch02.sec01;

public class VariableUseExample {
	
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		System.out.println(hour);	// hour 변수 안에 저장된 3이 출력
		System.out.println(3);		// 3이라는 숫자가 출력
		System.out.println("3");	// 3이라는 문자가 출력
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
	}

}
