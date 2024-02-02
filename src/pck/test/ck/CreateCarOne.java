package pck.test.ck;

class CarOne{
	String kind = "쎄단";
	String modelName;
	String carColor;
	int carYear;

}

public class CreateCarOne {

	public static void main(String[] args) {
		CarOne c1 = new CarOne();
		CarOne c2 = new CarOne();
		CarOne c3 = new CarOne();
		
		System.out.println(c1.modelName);
		
		System.out.println(c2.modelName);		//class CarOne{}에 String modelName = "테슬라"; 멤버필드 초기화를 한번에 하면 
												//어떤 객체를 줘도 값이 동일하므로 이런 경우 공통된 속성을 가진 경우에만 
												//사용하는 것이 좋음
		
	}

}
