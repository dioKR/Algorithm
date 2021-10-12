package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 피보나치 메모제이션(탑다운)
public class BJ10870 {

    static int[] d = new int[21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibo(n));

    }

    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(d[n] == 0) {
            d[n] = fibo(n-1) + fibo(n-2);
        }
        return d[n];
    }


}
