package tw.leonchen.flowcontrol;

public class TestSwitchCaseEx1 {

	public static void main(String[] args) {
		int level = 35;
		
		switch(level) {
			case 1:
				System.out.println("two hands");
				break;
			case 5:
				System.out.println("knife");
				break;
			case 10:
				System.out.println("pistol");
				break;
			default:
				System.out.println("nothing");
				break;
		}
		  System.out.println("finished");
	}
}