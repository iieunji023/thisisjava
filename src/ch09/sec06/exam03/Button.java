package ch09.sec06.exam03;

public class Button {
	// 정적 멤버 인터페이스
	public static interface ClickListener{
		// 추상 메소드
		void onClick();
		
	}
	
	// 필드
	private ClickListener clickListener;
	
	// 메소드
	public void setClickListener(ClickListener clickListener ) {		// clickListener 인터페이스에서 구현된 모든 객체가 올 수 있음 
		this.clickListener = clickListener;
		
	}
	
	public void click() {
		this.clickListener.onClick();		// 여기서는 clickListener.onClick();를 사용해도 필드라는 것을 알 수 있음
		
	}

}
