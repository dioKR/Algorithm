package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 계단 오르기
public class BJ2579 {

    public static int[] stairs;
    public static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        stairs = new int[n+1];
        dp = new Integer[n+1];

        for(int i=1; i<=n; i++) {
            stairs[i] = sc.nextInt();
        }

        dp[0] = stairs[0];
        dp[1] = stairs[1];

        if(n >= 2) {
            dp[2] = stairs[1] + stairs[2];
        }

        System.out.println(Point(n));

    }

    public static int Point(int n) {
        if(dp[n] == null) {
            dp[n] = Math.max(Point(n-3) + stairs[n-1], Point(n-2)) + stairs[n];
        }
        return dp[n];
    }


}
