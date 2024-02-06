package ch07.sec04;

public class StudentMain2 {

	public static void main(String[] args) {
		Person2 person = new Person2("이은지", "여");
		
		Student2 student = new Student2("이은지", "여", 1547521, "동아대학교", 4);
		student.myInfo();
		student.mode = Student2.PER;
		student.myInfo();
		
		
	}

}
