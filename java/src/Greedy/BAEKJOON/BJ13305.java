package Greedy.BAEKJOON;

import java.util.Scanner;

// 주유소
public class BJ13305 {

    public static long total_price;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        long[] d = new long[n-1];
        long[] price = new long[n];

        for(int i=0; i<n-1; i++) {
            d[i] = sc.nextLong();
        }

        for(int i=0; i<n; i++) {
            price[i] = sc.nextLong();
        }

        total_price = d[0] * price[0];
        for(int i=1; i<n-1; i++) {
           long tmp = Math.min((d[i] * price[i-1]), d[i] * price[i]);
           total_price += tmp;
        }

        System.out.println(total_price);
    }
}
