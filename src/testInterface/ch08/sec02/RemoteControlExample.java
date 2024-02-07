package testInterface.ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;			
		rc = new Television();		// 구현 객체 -> RemoteControl 타입의 참조변수 rc에 Television 객체를 생성
		
		rc.turnOn();				// Television에서 오버라이딩한 turnOn() 메소드 호출
		
	}

}
