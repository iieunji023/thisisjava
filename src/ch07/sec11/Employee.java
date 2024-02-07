package ch07.sec11;

/*
 * final 키워드는 더이상 상속이 되지 않음
 * 따라서, Employee 클래스는 더이상 상속이 되지 않는다.
 */
public final class Employee extends Person{
	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
		
	}
	
}
