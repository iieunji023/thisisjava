package testInterface.ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
	// Driver 객체 생성
	Driver driver = new Driver();
	
	// Vehicle 구현 객체 생성
	Bus bus = new Bus();
	Taxi taxi = new Taxi();
	
	driver.Drive(bus);
	driver.Drive(taxi);
	
	}
}
