package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 피보나치 수 2
public class BJ2748 {

    public static long[] dp = new long[91];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<n+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);

    }

    public static long fibo(int n) {
        if(dp[n] == 0) {
            dp[n] = fibo(n-1) + fibo(n-2);
        }
        return dp[n];
    }

}
