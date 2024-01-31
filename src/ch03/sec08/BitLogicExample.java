package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));
		System.out.println("45 || 25 = " + (45 | 25));
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		System.out.println("~45 = " + (~45));
		System.out.println("----------------------------------");
		
		byte receieveData = -120;
		
		//방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
		int unSignedInt1 = receieveData & 255;
		System.out.println("unSignedInt1 = " + unSignedInt1);
		
		//방법2 : 자바 API를 이용해서 Unsigned 점수 얻기
		int unSignedInt2 = Byte.toUnsignedInt(receieveData);		//byte를 int 타입으로 변환하는 함수
		System.out.println("unSignedInt2 = " + unSignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);

	}
}
