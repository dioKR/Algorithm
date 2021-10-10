package DynamicProgramming.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

// 정수 삼각형
public class BJ1932 {

    public static int[][] num;
    public static int[][] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        num = new int[n][n];
        dp = new int[n][n];

        for(int i = 0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = num[0][0];

        for(int i=1; i<n; i++) {

            for(int j=0; j<i+1; j++) {

                if(j==0) {
                    dp[i][j] = dp[i-1][j] + num[i][j];
                } else if(j==i) {
                    dp[i][j] = dp[i-1][j-1] + num[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j] + num[i][j], dp[i-1][j-1] + num[i][j]);
                }

            }

        }

        int result = dp[n-1][0];
        for(int i=1; i<n; i++) {
            result = Math.max(result, dp[n-1][i]);
        }


        System.out.println(result);


    }
}
