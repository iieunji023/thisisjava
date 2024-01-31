package ch03.sec06;

public class CompareOperatorExample {
	public static void main(String[] args) {
		
		/*
		 * 예제 1
		 */
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);		//true
		boolean result2 = (num1 != num2);		//false
		boolean result3 = (num1 <= num2);		//true
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		/*
		 * 예제 2
		 */
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);		//true
		
		System.out.println("char1: " + (int)char1);
		System.out.println("char2: " + (int)char2);
		System.out.println("result4: " + result4);
		
		/*
		 * 예제 3
		 */
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);		//true, 실수와 정수를 비교하면 정수가 실수로 바뀜
		
		System.out.println("result5: "+ result5);
		
		/*
		 * 예제 4
		 */
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);			//false, 정밀도에 따라 다름(float = 7, double = 15)
		boolean result7 = (num5 == (float)num6);	//true
		boolean result111 = (num5 > num6);			//true
		
		System.out.println("num5: " + num5);
		System.out.println("num6: " + num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		System.out.println("result111: " + result111);
		
		/*
		 * 예제 5
		 */
		String str1 = "자바";
		String str2 = "java";
		boolean result8 = (str1.equals(str2));		//false, 참조변수는 주소값을 저장함. 
													//equals()를 사용하게 되면 주소값이 아닌 문자열을 비교할 수 있음
		boolean result9 = (! str1.equals(str2));	//true
		
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
		
	}

}
