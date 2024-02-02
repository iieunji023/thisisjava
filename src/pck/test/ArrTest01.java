package pck.test;

public class ArrTest01 {
	/*
	 * arrPrint START
	 */
	public static void arrPrint(int[] a) {
		// int[] a 값 출력
		for(int i = 0; i < a.length; i++) {
			System.out.println("[arrPrint] a[" + i + "]: " + a[i]);
			
		}
	}
	/*
	 * arrPrint END
	 */
	
	public static void main(String[] args) {
		int[] ary = {10, 20, 30, 40, 50};		//배열 선언과 동시에 초기화
		for(int i = 0; i < ary.length; i++) {
//			System.out.println("ary[" + i + "]: " + ary[i]);
			System.out.printf("ary[%d]: %d \n", i, ary[i]);
			
		}

		/* 배열선언과 초기화가 분리되면 명시적으로 객체생성(new 연산자를 통해서 배열객체 생성) */
		int[] ary1; 	//배열 선언
		ary1 = new int[] {50, 60, 70, 80, 90, 100};		//초기화
		
		for(int i = 0; i < ary1.length; i++) {
			System.out.printf("ary1[%d]: %d \n", i, ary1[i]);
			
		}
		
		/* 
		 * [함수호출] 프로그램이 실행되면 제일 먼저 main을 찾으므로 메서드를 main에 호출해줘야 함 
		 */
		arrPrint(new int[] {1, 2, 3, 4, 5});	//배열 생성이 안되어 있는 상황에서 (int[] a; 배열 선언 X)
												//매개변수 입력 값으로 주기 위해서는 새로운 객체를 생성해야 함
		arrPrint(ary);							//ary라는 변수를 arrPrint 메서드에 전달해주고 있음.
												//이미 객체 생성이 돼있기 때문에 변수만 적어주면 됨
		
	}
}