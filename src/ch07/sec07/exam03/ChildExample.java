package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		// 객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		// Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";		// Parent 타입이므로 자식 타입의 멤버를 사용하지 못함
//		parent.method3();				// Parent 타입이므로 자식 타입의 멤버를 사용하지 못함
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		// Child 타입으로 필드와 메소드 사용
		child.field2 = "data2";
		child.method3();
		child.method1();
		child.method2();
		
	}

}
