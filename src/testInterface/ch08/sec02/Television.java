package testInterface.ch08.sec02;

/*
 * Television => RemoteControl이라는 인터페이스의 추상 메서드를 구현하기 위한 구현 클래스
 */
public class Television implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

}
