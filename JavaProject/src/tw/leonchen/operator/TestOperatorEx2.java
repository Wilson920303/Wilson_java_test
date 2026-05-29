package tw.leonchen.operator;

public class TestOperatorEx2 {

	public static void main(String[] args) {
		int i = 1, j;
		// j= i++ ; ==> i = 2 , j = 1
		// j= ++i ; ==> i = 2 , j = 2
		j=++i;
		System.out.println("i = " + i);
		System.out.println("j = " + j);

	}

}
