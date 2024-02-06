package ch06.sec11.exam01;

public class Korean {
	// 인스턴스 final 필드 선언
	final String nation = "대한민국";			// 필드에서 초기화
	final String ssn;							// 외부에서 값을 받아 생성자를 통해 초기화
	
	// 인스턴스 필드 선언
	String name;
	
	// 생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}

}
