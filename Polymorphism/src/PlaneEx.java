class Plane{
	public void takeOff() {
		System.out.println("Plane is taking off");
		}
	public void land() {
		System.out.println("Plane is landing");
	}
	public void fly() {
		System.out.println("Plane is flying");
	}
}

class CargoPlane extends Plane{
	public void fly() {
		System.out.println("Cargo Plane is flying");
	}
}

class PassengerPlane extends Plane{
	public void fly() {
		System.out.println("Passenger Plane is flying");
	}
}

class Airport{
	public void permit(Plane pl) { // using Parent class reference Plane
		pl.takeOff();
		pl.land();
		pl.fly();
		
	}
}
public class PlaneEx {

	public static void main(String[] args) {
		CargoPlane c = new CargoPlane();
		PassengerPlane p = new PassengerPlane();
		Airport a = new Airport();
		a.permit(c);
		a.permit(p);
		
	}

}
