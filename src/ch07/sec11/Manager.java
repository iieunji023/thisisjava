package ch07.sec11;

/*
 * non-sealed 키워드를 통해 봉인을 해제해줌
 * 앞에서 Person 클래스에는 sealed 키워드를 통해 자식 클래스 상속을 봉인해놨음
 * 이를 non-sealed 키워드를 통해 해제
 */
public non-sealed class Manager extends Person{
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
		
	}
	
}
