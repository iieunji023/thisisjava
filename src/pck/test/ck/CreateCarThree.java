package pck.test.ck;

/* 2. 생성자를 이용하여 초기화하기 */
class CarThree{
	// 멤버변수, 속성, 필드 생성
	String kind = "쎄단";		//공통으로 적용될 속성은 초기화를 진행한다.
	String modelName;
	String carColor;
	int carYear;
	
	/* 생성자는 클래스 이름과 동일함
	 * 생성자 오버로딩 = 생성자 이름은 동일하지만, 받는 매개변수(입력값)가 다름
	 */
	CarThree() {				// 생성자(디폴트생성자: 입력이 없는 생성자)
		System.out.printf("나는 디폴트 생성자입니다. \n");
		
	}
	
	CarThree(String modelName) {
		this.modelName = modelName;
		
		System.out.printf("나는 매개변수 1개를 갖는 생성자입니다. \n");
		
	}
	
	CarThree(String modelName, String carColor, int carYear) {
		this.modelName = modelName;
		this.carColor = carColor;
		this.carYear = carYear;
		
		System.out.printf("나는 매개변수 3개를 갖는 생성자입니다. \n");
		
	}
	
}

public class CreateCarThree {
	public static void main(String[] args) {
//		CarThree c1 = new CarThree();		//자동으로 디폴트 생성자가 호출된다.
		CarThree c2 = new CarThree("마티즈", "검정", 2023);		//초기화해주는 값을 넣어주는 것
		System.out.printf("나의 차 종류는 %s %s이고, 색은 %s이며 연식은 %d 입니다.", c2.kind, c2.modelName, c2.carColor, c2.carYear);
		
	}

}
