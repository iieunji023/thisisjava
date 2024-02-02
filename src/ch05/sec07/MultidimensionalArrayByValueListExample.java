package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
				
		};
		
		/* 각 반의 학생 수가 다를 경우 2차원 배열을 생성한다. 각 행의 요소 값을 다르게 써도 생성할 수 있다. */
		//배열의 길이
		System.out.println("1차원 배열의 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열의 길이(첫번째 반의 학생 수): " + scores[0].length);		//3
		System.out.println("2차원 배열의 길이(두번째 반의 학생 수): " + scores[1].length);		//2
	
		//첫번째 반의 세번째 학생의 점수 읽기
		System.out.println("1반 3번 학생 점수: " + scores[0][2]);		//96
				
		//두번째 반의 두번째 학생의 점수 읽기
		System.out.println("2반 2번 학생 점수: " + scores[1][1]);		//88
		
		//첫번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for(int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][i];
			System.out.println("1반 점수 합: " + class1Sum);
			
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.printf("1반 평균 점수: %.2f \n", class1Avg);
		
		//두번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for(int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];
			System.out.println("2반 점수 합: " + class2Sum);
			
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.printf("2반 평균 점수: %.2f \n", class2Avg);
		
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i = 0; i < scores.length; i++) {	
			//1. 전체 학생 수 구하기
			totalStudent += scores[i].length;	
			
			System.out.println("전체 학생 수: " + totalStudent);
			
			//2. 전체 학생의 점수 합 구하기
			for(int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
				
			}
		}
		
		//3. 전체 학생의 평균 값 구하기
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균: " + totalAvg);

	}

}
