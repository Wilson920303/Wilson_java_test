package tw.leonchen.interfaces;

interface Flyer{
	public void takeOff();
	public void land();
	public void fly();
}

class Airplane implements Flyer{
	
	@Override
	public void takeOff(){
		System.out.println("Airplane takes off");
	}
	
	@Override
	public void land(){
		System.out.println("Airplane lands");
	}
	
	@Override
	public void fly(){
		System.out.println("Airplane flies");
	}
}

class SuperMan implements Flyer{
	@Override
	public void takeOff(){
		System.out.println("SuperMan takes off");
	}
	
	@Override
	public void land(){
		System.out.println("SuperMan lands");
	}
	
	@Override
	public void fly(){
		System.out.println("SuperMan flies");
	}
}

public class CallTestInterfaceEx1 {

	public static void main(String[] args) {
		Flyer flyer = new Airplane();
		flyer.takeOff();
		flyer.fly();
		flyer.land();
		
	}

}
