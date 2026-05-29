package tw.leonchen.nestedclass;

class A{
	
	class B{
		public void sayHello() {
			System.out.println("hehe");
		}
	}
	
	public void processAction() {
		B b = new B();
		b.sayHello();
	}
	
}

public class CallTestNestedClassEx1 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.processAction();
		
		A.B b2 = a1.new B();
		b2.sayHello();
	}

}


//此程式示範成員內部類別（Inner Class）的使用，內部類別可存取外部類別，並需透過外部類別物件建立實例。