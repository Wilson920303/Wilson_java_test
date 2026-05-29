package tw.leonchen.flowcontrol.loop;

public class TestBreakLoopEx1 {

	public static void main(String[] args) {
		
		for (int i = 3 ; i<=10 ; ++i) {
			if (i==5) {
				continue;
			}
			System.out.println("i = " + i);
			
		}
		System.out.println("finished");
	}
}