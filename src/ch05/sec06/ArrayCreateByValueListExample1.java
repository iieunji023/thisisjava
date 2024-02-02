package ch05.sec06;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		String[] season = {"spring", "summer", "fall", "winter"};
		
		//배열 항목 값 읽기
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		//인덱스 1번 항목의 값 변경
		season[1] = "여름";
		System.out.println(season[1]);
		
		//배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};
		
		//총합과 평균 구하기
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {		// i <= scores.length;라고 하니까 오류 발생
														// 이유 : 배열은 인덱스 [2]까지 있는데 length는 3이므로 인덱스 초과로 인한 오류
														// 해결 : i <= scores.length;를 i < scores.length;로 바꿔 줌
			sum += scores[i];
			
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / scores.length;
		System.out.printf("평균: %.2f", avg);
		
	}
	
	
}
