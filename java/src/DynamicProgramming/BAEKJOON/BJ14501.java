package DynamicProgramming.BAEKJOON;

import java.util.Scanner;
// 퇴사
public class BJ14501 {

    public static int n;
    public static int[] t;
    public static int[] p;
    public static int[] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        t = new int[n+6];
        p = new int[n+6];
        dp = new int[n+6];

        int max = 0;

        for(int i=1; i<n+1; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }


        for(int i=1; i<=n+1; i++) {
            dp[i] = Math.max(dp[i], max);
            dp[t[i]+i] = Math.max(dp[t[i]+i], p[i]+dp[i]);
            max = Math.max(max, dp[i]);
        }


        System.out.println(dp[n+1]);

    }


}
