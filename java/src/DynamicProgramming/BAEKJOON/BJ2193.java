package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 이친수
public class BJ2193 {

    public static int n;
    public static Long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        dp = new Long[n + 1];

        dp[0] = 0L;
        dp[1] = 1L;

        if (n > 1) {
            fibo(n);
        }
        System.out.println(dp[n]);

    }

    public static long fibo(int n) {
        if (dp[n] == null) {
            dp[n] = fibo(n - 1) + fibo(n - 2);
        }
        return dp[n];
    }

}
