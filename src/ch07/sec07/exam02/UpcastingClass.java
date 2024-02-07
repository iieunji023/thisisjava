package ch07.sec07.exam02;

/*
 * 부모 클래스(상위 클래스)
 */
class Super {							
	// 필드 선언
	String superField;

	// GETTER & SETTER 선언
	public String getSuperField() {
		System.out.println("[Super] " + superField);
		
		return superField;

	}

	public void setSuperField(String superField) {
		this.superField = superField;
		
	}
	
	public void overrideMethod() {
		System.out.println("[Super] overrideMethod()");
		
	}
	
}

/*
 * 자식 클래스
 */
class Sub extends Super {				
	// 필드 선언
	String subField;
	
	// GETTER & SETTER 선언
	public String getSubField() {
		System.out.println(subField);
		
		return subField;
		
	}
	
	public void setSubField(String subField) {
		this.subField = subField;
		
	}
	
	@Override
	public void overrideMethod() {
		System.out.println("[Sub] overrideMethod()");

	}
	
}

public class UpcastingClass {
	public static void main(String[] args) {
		Super s = new Sub();				// 부모타입 참조변수가 자식 객체를 가리킨다.
											// 자식 타입 객체가 부모타입 객체로 자동 형변환 이루어짐
		
		s.setSuperField("Parent");			// 부모 타입 객체로 변경되었기 때문에 부모 타입 객체가 가지고 있는 멤버만 사용 가능
		s.getSuperField();
//		s.setSubField("[Child]");			// 부모 타입 객체로 변경되었기 때문에 자식 객체가 가지고 있는 멤버에는 접근 불가
		s.overrideMethod();					// 자식 객체에서 오버라이드한 메서드는 사용 가능, 부모의 메서드가 아닌 오버라이딩한 자식 객체의 메서드를 사용!
		
	}

}
