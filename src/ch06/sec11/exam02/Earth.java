package ch06.sec11.exam02;

public class Earth {
	// 상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	// 상수 선언
	static final double EARTH_SURFACE_AREA;
	
	// 정적 블록에서 상수 초기화 -> 상수 선언 시 초기화를 하지 않았기 때문에 정적 블록에서 초기화해줌!
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	}

}
