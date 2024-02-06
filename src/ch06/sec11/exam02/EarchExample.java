package ch06.sec11.exam02;

public class EarchExample {
	public static void main(String[] args) {
		// 상수 읽기 -> 상수는 static final이므로 정적 멤버와 동일하게 별도의 객체를 생성하지 않고 클래스로 접근하여 읽을 수 있다.
		System.out.printf("지구의 반지름: %.1f km \n", Earth.EARTH_RADIUS);
		System.out.printf("지구의 표면적: %.10f km^2", Earth.EARTH_SURFACE_AREA);
		
	}
	
}
