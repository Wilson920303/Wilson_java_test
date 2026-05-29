package tw.leonchen.common;

import java.util.*;

public class LotteryStatistics_410170196 {

    public static void main(String[] args) {

        int total = 100000;
        int maxNumber = 42;

        
        int[] count = new int[maxNumber + 1];

        for (int i = 0; i < total; i++) {
            int num = (int)(Math.random() * maxNumber) + 1;
            count[num]++;
        }

        
        System.out.println("original data:");
        System.out.println("number\t\tcount");
        System.out.println("-------------------------------------");
        for (int i = 1; i <= maxNumber; i++) {
            System.out.printf("%-10d\t%d%n", i, count[i]);
        }
        System.out.println("-------------------------------------");

       
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i <= maxNumber; i++) {
            list.add(new int[]{i, count[i]});
        }
        
        list.sort((a, b) -> b[1] - a[1]);

        
        System.out.println("sorted data:");
        System.out.println("-------------------------------------");
        for (int[] data : list) {
            System.out.printf("%-10d\t%d%n", data[0], data[1]);
        }
        System.out.println("-------------------------------------");
    }
}
