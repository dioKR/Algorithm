package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 가장 긴 증가하는 부분 수열
public class BJ11053 {

    public static int[] seq;
    public static Integer[] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        seq = new int[a];
        dp = new Integer[a];

        for(int i=0; i<a; i++) {
            seq[i] = sc.nextInt();
        }

        for(int i=0; i<a; i++) {
            LIS(i);
        }

        int max = dp[0];
        for(int i=1; i<a; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }

    public static int LIS(int N) {
        if(dp[N] == null) {
            dp[N] = 1;

            for(int i= N-1; i>=0; i--) {
                if(seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }

        }
        return dp[N];
    }



}
