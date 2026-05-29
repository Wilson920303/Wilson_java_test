package tw.leonchen.flowcontrol;

public class TestNestedEx1 {

	public static void main(String[] args) {
		int num = 14;
		
		if(num>=2) {
			System.out.println("step 1");
			if(num<=10) {
				System.out.println("num = " + num);
				
			}
			System.out.println("step2");
		}
		System.out.println("finished");
	}

}
