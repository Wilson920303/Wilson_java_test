package tw.leonchen.flowcontrol.loop;

public class TestThrowDiceEx1 {

	public static void main(String[] args) {
		double  number = Math.random();
		System.out.println("number = " + number );
		
		int yourLuckyNumber = 3;
		while (true) {
			int diceNum = (int)(Math.random()*6 + 1);
			System.out.println("diceNum = " + diceNum);
			
			if(diceNum == yourLuckyNumber) {
				System.out.println("You Win !");
				break;
			}
			System.out.println("Try Again");
		}
	}

}
