package tw.leonchen.common;

public class Fibonacci_410170196 {

    public static long f(int n) {
        if (n == 1) {
            return 0;   
        } else if (n == 2) {
            return 1;   
        } else {
            return f(n - 1) + f(n - 2); 
        }
    }

    public static void main(String[] args) {
        System.out.println("數列：");

        for (int i = 1; i <= 48; i++) {
            System.out.print(f(i));

            if (i < 48) {
                System.out.print(" ");
            }
        }
    }
}
