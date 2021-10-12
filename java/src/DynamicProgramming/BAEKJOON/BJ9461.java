package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 파도반 수열
public class BJ9461 {

    public static Long[] dp = new Long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;
        dp[5] = 2L;


        while(t-- > 0) {
            int n = sc.nextInt();
            p(n);
            System.out.println(dp[n]);
        }

    }

    public static Long p(int n) {
        if(dp[n] == null) {
            dp[n] = p(n-1) + p(n-5);
        }
        return dp[n];
    }

}
