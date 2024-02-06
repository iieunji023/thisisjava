package ch07.sec04;

public class StudentMain {

	public static void main(String[] args) {
		Person person = new Person("이은지", "여");
		person.myInfo();
		
		Student student = new Student("이은지", "여", 1547521, "동아대학교", 4);
		student.myInfo();
		
	}

}
