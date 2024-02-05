//package ch06.sec08.exam4;
//
///*
// * 메서드 오버로딩을 사용한 계산기 사용
// */
//public class Cal {
//	int x;
//	int y;
//	double z;
//	double k;
//	
//	// 생성자 오버로딩
//	Cal(int x, int y) {
//		this.x = x;
//		this.y = y;
//		
//	}
//	
//	Cal(double z, double k) {
//		this.z = z;
//		this.k = k;
//		
//	}
// 	
//	// INT METHOD START(정수를 매개변수로 받는 메서드)
//	public int intPlus() {
//		
//		
//		if(x % y == 0) {
//		int result = x + y;
//		
//		} else if(z % k != 0) {
//			
//		}
//		
//		return result;
//		
//	}
//	
//	public int intMinus() {
//		int result = x - y;
//		
//		return result;
//		
//	}
//	
//	public int intMul() {
//		int result = x * y;
//		
//		return result;
//
//	}
//	
//	public int intDiv() {
//		int result = x / y;
//		
//		return result;
//
//		
//	}
//	// INT METHOD END(정수를 매개변수로 받는 메서드)
//	
//	// DOUBLE METHOD START(정수를 매개변수로 받는 메서드)
//	public double doublePlus() {
//		double result =  z + k;
//		
//		return result;
//		
//	}
//	
//	public double doubleMinus() {
//		double result = z - k;
//		
//		return result;
//		
//	}
//	
//	public double doubleMul() {
//		double result = z * k;
//		
//		return result;
//		
//	}
//	
//	public double doubleDiv() {
//		double result = z / k;
//		
//		return result;
//		
//	}
//	// DOUBLE METHOD END(정수를 매개변수로 받는 메서드)
//	
//}
