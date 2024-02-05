package ch06.sec08;

public class MyClass {
	/*
	 * 클래스 구성 멤버: 멤버변수 + 멤버함수 + 생성자
	 */
	//=================================================== 멤버변수
	String name;
	int age;
	
	
	
	MyClass(String name, int age) {		//2개의 입력 값을 갖는 생성자 만들어줌
		this.name = name;				//매개변수로 받은 name(지역변수)을 멤버변수 name(전역변수)에 저장하겠다.		
		this.age = age;
		
	}



	//=================================================== 멤버함수
	void printMyClass() {
		System.out.printf("나의 이름: %s, 나의 나이: %d \n", name, age);		//myClass라는 class에 소속된 함수이므로 printMyClass() 메서드에서 
																				//매개변수를 받지 않아도 name, age를 사용할 수 있다.
		
	}
	
}
