package ch05;

public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "9511254354521";
		char sex = ssn.charAt(6);
		
		System.out.println(sex);
		
		/*
		 * switch(sex) { case '1': case '3': System.out.println("남자입니다.");
		 * 
		 * break;
		 * 
		 * case '2': case '4': System.out.println("여자입니다.");
		 * 
		 * break;
		 * 
		 * }
		 */
		
		if(sex == '1' || sex == '3') {
			System.out.println("남자입니다.");
			
		} else if(sex == '2' || sex == '4') {
			System.out.println("여자입니다.");
			
		}
		
	}
}
