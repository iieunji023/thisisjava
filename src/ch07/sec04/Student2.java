package ch07.sec04;

public class Student2 extends Person{
	
	int SId; 		// 학번
	String school;	// 학교
	int grade;		// 학년
	
	// 나는 ~(학교) ~(학년)에 재학중인 ~(학번) ~(이름)입니다.
	
	Student2(String name, String gender, int SId, String school, int grade) {
		super(name, gender);

		this.SId = SId ;
		this.school = school;
		this.grade = grade;
		
	}
	
	public static final int STU = 1;
	public static final int PER = 2;
	
	public int mode = STU;
	
	@Override
	void myInfo() {
		if(mode == STU) {
		System.out.printf("나는 %s %d학년에 재학중인 %d학번 %s %s입니다. \n", school, grade, SId, gender, name);
		} else {
			super.myInfo();
			
		}
	}
	
}
