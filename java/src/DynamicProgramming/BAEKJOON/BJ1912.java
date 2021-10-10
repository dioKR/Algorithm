package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 연속합
public class BJ1912 {

    public static int n;
    public static int[] num;
    public static Integer[] dp;
    public static int max;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        num = new int[n];
        dp = new Integer[n];

        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        dp[0] = num[0];
        max = num[0];

        recursive(n-1);
        System.out.println(max);

    }

    public static int recursive(int n) {
        if(dp[n] == null) {
            dp[n] = Math.max(recursive(n-1) + num[n], num[n]);

            max =  Math.max(dp[n], max);
        }
        return dp[n];
    }



}
