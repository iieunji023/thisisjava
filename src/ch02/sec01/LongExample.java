package ch02.sec01;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 = 1000000000000l;
//		long var4 = 1000000000000;    default가 int로 인식되어서 생기는 오류. int 범위에서 벗어나므로 뒤에 L을 붙여주어야 함.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
	}
	
}
