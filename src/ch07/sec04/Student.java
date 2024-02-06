package ch07.sec04;

public class Student extends Person{
	
	int SId; 		// 학번
	String school;	// 학교
	int grade;		// 학년
	
	// 나는 ~(학교) ~(학년)에 재학중인 ~(학번) ~(이름)입니다.
	
	Student(String name, String gender, int SId, String school, int grade) {
		super(name, gender);

		this.SId = SId ;
		this.school = school;
		this.grade = grade;
		
	}
	
	@Override
	void myInfo() {
		System.out.printf("나는 %s %d학년에 재학중인 %d학번 %s %s입니다.", school, grade, SId, gender, name);
		
	}
	
}
