package testInterface.ch08.sec12;

public class InstanceofExample {

	public static void main(String[] args) {
		// 구현 객체 생성
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		// ride() 메서드 호출 시 구현 객체를 매개값으로 전달
		ride(taxi);
		System.out.println();
		ride(bus);
			
	}

	/*
	 * 객체 타입을 확인한 후 true라면 강제 타입 변환
	 */
	public static void ride(Vehicle vehicle) {
		// 방법 1
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus) vehicle;			// 강제 타입 변환
//			bus.checkFare();
//			
//		}
		
		// 방법 2
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
			
		}
		
		vehicle.run();
		
	}
	
}
