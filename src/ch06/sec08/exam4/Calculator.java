package ch06.sec08.exam4;

/*
 * 메서드 오버로딩
 */
public class Calculator {
	//정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
		
	}
	
	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
		
	}
}

