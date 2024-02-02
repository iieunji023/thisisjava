package pck.test.ck;

/* 1. Setter 이용하여 초기화하기 */
class CarTwo{
	// 멤버변수, 속성, 필드 생성
	String kind = "쎄단";		//공통으로 적용될 속성은 초기화를 진행한다.
	String modelName;
	String carColor;
	int carYear;
	
	/* setModelName이라는 메서드(멤버함수, 기능, 행위) 생성 -> modelName를 입력 값으로 받음
	 * 매개변수 String modelName는 setModelName이라는 메서드에서만 사용할 수 있는 지역변수.
	 * class CarTwo{}에 생성된 String modelName은 전역변수로 두개는 다름
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}
	
	public void setCarColor(String carColor) {
		this.carColor = carColor;
		
	}
	
	public void setCarYear(int carYear) {
		this.carYear = carYear;
		
	}
}

public class CreateCarTwo {

	public static void main(String[] args) {
		CarTwo c1 = new CarTwo();
		
		c1.setModelName("람보르기니");
//		System.out.println(c1.modelName);
		
		c1.setCarColor("흰색");
		c1.setCarYear(2024);
		
		System.out.println("나의 차는 " + c1.modelName + "이고, 색은 " + c1.carColor + "이며 연식은 " + c1.carYear + " 최신형입니다.");
		System.out.printf("나의 차는 %s이고, 색은 %s이며 연식은 %d 최신형입니다.", c1.modelName, c1.carColor, c1.carYear);
		
	}

}
