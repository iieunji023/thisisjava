package ch06.sec07.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		// Korean 객체 생성
		Korean k1 = new Korean("박자바", "011111-1854247");
		
		// Korean 객체 데이터 읽기
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		// Korean 객체 생성
		Korean k2 = new Korean("김자바", "951120-2475512");
		
		// Korean 객체 데이터 읽기
		System.out.printf("nation: %s \n", k2.nation);
		System.out.printf("name: %s \n", k2.name);
		System.out.printf("ssn: %s \n", k2.ssn);
		
		Korean k3 = new Korean();		//디폴트 생성자를 생성하지 않았기 때문에 오류 발생

	}

}
