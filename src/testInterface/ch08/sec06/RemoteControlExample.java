package testInterface.ch08.sec06;

import testInterface.ch08.sec04.Audio;
import testInterface.ch08.sec04.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Televison 객체를 생성하고 인터페이스 변수에 대입
		rc = (RemoteControl) new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		// Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = (RemoteControl) new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();

		// 정적 메소드 호출
		RemoteControl.changeBattery();			// 정적 메소드이므로 rc.changeBattery()처럼 객체 생성 없이 사용하지 않아도 된다.
		
		
	}

}
