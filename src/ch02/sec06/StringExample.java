package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";			// name은 "홍길동"이라는 문자열을 가리키는 것. 
										// String 변수는 문자열이 저장되어 있는 시작 주소를 담고 있음.
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는");
		System.out.print("자바를");	
		System.out.print("배웁니다.");
		
	}
	
}
