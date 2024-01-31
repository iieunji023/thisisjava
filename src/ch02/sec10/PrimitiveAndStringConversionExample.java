package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");			// Integer라는 객체에서 parseInt라는 메서드를 호출한 것
		Integer value11 = Integer.valueOf("10");		// int는 기본타입이지만, Integer 타입을 사용하면 value11이라는 객체를 return시킴
		System.out.println("value11: " + value11);
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		
	}

}
