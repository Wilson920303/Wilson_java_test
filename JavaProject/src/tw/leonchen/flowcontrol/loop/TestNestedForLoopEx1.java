package tw.leonchen.flowcontrol.loop;

public class TestNestedForLoopEx1 {

	public static void main(String[] args) {
		
		for (int i = 1; i<= 10; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i<=10; i++) {
			for (int n =1; n <=10-i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
