package ch02.sec01;

public class VariableInitializationExample {
	
	// main 함수 선언
	public static void main(String[] args) {
		// value 변수 선언
		int value = 30;				
		/*
		 * value 변수에 저장된 값과 10을 더해서 result라는 변수에 초기값으로 대입 
		 * value라는 변수를 선언만 했을 때는 메모리에 할당된
		 * 것이 아니므로 값을 할당해줘야 됨. 즉 선언과 초기화가 동시에 이루어져야함
		 */ 
		int result = value + 10;	
		// 변수 result 값을 읽고 출력
		System.out.println(result);	
		
	}
	

}
