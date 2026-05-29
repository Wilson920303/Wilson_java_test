package tw.leonchen.operator;

public class TestShiftOperatorEx1 {

	public static void main(String[] args) {
		int number1 = 12345;
		int number2 = -12345;
		
		System.out.println("(number1<<2)=" + (number1<<2));
		System.out.println("(number2<<2)=" + (number2<<2));
		
		System.out.println("(number1>>2)=" + (number1>>2));
		System.out.println("(number2>>2)=" + (number2>>2));
		
		System.out.println("(number1>>>2)=" + (number1>>>2));
		System.out.println("(number2>>>2)=" + (number2>>>2));

	}

}
