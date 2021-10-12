package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 포도주 시식
public class BJ2156 {

    public static int n;
    public static int[] cup;
    public static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        cup = new int[n+1];
        dp = new Integer[n+1];


        for(int i=1; i<n+1; i++) {
            cup[i] = sc.nextInt();
        }

        dp[0] = 0;
        dp[1] = cup[1];

        if(n >= 2) {
            dp[2] = cup[1] + cup[2];
        }

        System.out.println(sol(n));

    }


    public static int sol(int n) {
        if(dp[n] == null) {
            dp[n] = Math.max(Math.max(sol(n-3) + cup[n-1], sol(n-2)) + cup[n], sol(n-1));
        }
        return dp[n];
    }

}
