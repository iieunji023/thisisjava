package testInterface.ch08.sec05;

import testInterface.ch08.sec04.Television;

public class RemoteControlExample{

	public static void main(String[] args) {
		// 인터페이스 변수 선언
//		RemoteControl rc;
		
		// Televison 객체를 생성하고 인터페이스 변수에 대입
		RemoteControl rc = (RemoteControl) new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
	}

}
