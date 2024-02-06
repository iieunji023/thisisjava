package ch07.sec04.exam02;

public class SupersonicAirPlaneExample {
	public static void main(String[] args) {
		SupersonicAirPlane sa = new SupersonicAirPlane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirPlane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirPlane.NORMAL;
		sa.fly();
		sa.land();
		
	}

}
