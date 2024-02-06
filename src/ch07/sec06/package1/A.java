package ch07.sec06.package1;

/*
 * protected 접근 제한자
 * - 같은 패키지 내에서 또는 자식 객체만 사용 가능
 * - 다른 패키지라도 자식 객체라면 사용 가능
 */
public class A {
	// 필드 선언
	protected String field;
	
	// 생성자 선언
	protected A() {
		
	}
	
	// 메소드 선언
	protected void method() {
		
	}

}
