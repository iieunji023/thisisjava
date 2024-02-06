package ch07.sec04;

public class Person {
	String name;
	String gender;
	
	Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
		
	}
	
	void  myInfo() {
		 System.out.printf("나의 이름은 %s이고, %s입니다. \n", name, gender);
	 }

}
