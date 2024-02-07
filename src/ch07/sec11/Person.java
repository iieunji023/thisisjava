package ch07.sec11;

/*
 * sealed 키워드를 통해 자식 클래스 한정
 * permits 키워드 뒤에 상속 가능한 자식 클래스 선언
 * 즉, Person 클래스는 Employee, Manager에게만 상속이 가능
 */
public sealed class Person permits Employee, Manager{				
	// 필드 선언
	public String name;
	
	// 메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
		
	}

}
