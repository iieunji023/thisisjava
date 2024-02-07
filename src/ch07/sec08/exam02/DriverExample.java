package ch07.sec08.exam02;

public class DriverExample {
	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();
		
		Vehicle vehicle =  new Vehicle();
		driver.drive(vehicle);
		
		// 매개값으로 Bus 객체를 제공하고, driver() 메소드 호출
		Bus bus = new Bus();
		driver.drive(bus);			// 자동 타입 변환(Vehicle vehicle = bus)이 이루어짐
		
		// 매개값으로 Taxi 객체를 제공하고, driver() 메소드 호출
		Taxi taxi = new Taxi();
		driver.drive(taxi);			// 자동 타입 변환(Vehicle vehicle = taxi)이 이루어짐
		
	}

}
