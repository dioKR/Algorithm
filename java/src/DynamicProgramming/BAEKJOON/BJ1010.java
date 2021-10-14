package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 다리 놓기
public class BJ1010 {

    public static int[][] dp = new int[30][30];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(combi(m,n));
        }
    }

    public static int combi(int n, int r) {
        if(dp[n][r] > 0) {
            return dp[n][r];
        }

        if(n == r || r == 0) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = combi(n-1, r) + combi(n-1, r-1);
    }



}
