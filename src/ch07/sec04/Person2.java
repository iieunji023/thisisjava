package ch07.sec04;

public class Person2 {
	String name;
	String gender;
	
	Person2(String name, String gender) {
		this.name = name;
		this.gender = gender;
		
	}
	
	void myInfo() {
		 System.out.printf("나의 이름은 %s이고, %s입니다. \n", name, gender);
	 }

}
