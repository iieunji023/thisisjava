package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		Member m = new Member("winder", "눈송이", 25);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		
		System.out.println(m.toString());
		
		Member m1 = new Member("winder", "눈송이", 25);
		Member m2 = new Member("winder", "눈송이", 25);
		
		System.out.println("m1.hashCode(): " + m1.hashCode());
		System.out.println("m2.hashCode(): " + m2.hashCode());
		System.out.println("m1.equals(): " + m1.equals(m2));
		
	}

}
