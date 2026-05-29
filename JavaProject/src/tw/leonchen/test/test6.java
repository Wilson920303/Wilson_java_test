package tw.leonchen.test;

public class test6 {

	public static void main(String[] args) {
		int yourluckynumber = 1;
		while(true) {
			int Dicenum = (int)(Math.random()*6+1);
			System.out.println("Dicenum = " + Dicenum);
			
			if (yourluckynumber == Dicenum) {
				System.out.println("You Win!");
				break;
			}
			System.out.println("Try Again");
		}
	}
}
