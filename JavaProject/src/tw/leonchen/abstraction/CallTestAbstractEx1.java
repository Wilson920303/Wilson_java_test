package tw.leonchen.abstraction;

abstract class Vehicle{
	public abstract void calculateFuel();
	public abstract void calculateDistance();
	
	public void showInfo(Vehicle v) {
		v.calculateFuel();
		v.calculateDistance();
	}
}

class Truck extends Vehicle{

	@Override
	public void calculateFuel() {
		System.out.println("Truck calculates Fuel");
	}

	@Override
	public void calculateDistance() {
		System.out.println("Truck calculates Distances");
	}
	
}

class CargoShip extends Vehicle{

	@Override
	public void calculateFuel() {
		System.out.println("CargoShip claculates Fuel");
	}

	@Override
	public void calculateDistance() {
		System.out.println("CargoShip claculates Distances");
	}
	
}


public class CallTestAbstractEx1 {

	public static void main(String[] args) {
//		Truck toyota = new Truck();
//		toyota.calculateFuel();
//		toyota.calculateDistance();
//		
//		CargoShip cargo1 = new CargoShip();
//		cargo1.calculateFuel();
//		cargo1.calculateDistance();
		
		Vehicle vehicle1 = new Truck();
		vehicle1.showInfo(vehicle1);
		
		Vehicle vehicle2 = new CargoShip();
		vehicle2.showInfo(vehicle2);
	}

}



//用抽象類別 Vehicle 統一規範交通工具的行為，並利用「多型（Polymorphism）」在執行時決定真正執行哪一種計算方式。
