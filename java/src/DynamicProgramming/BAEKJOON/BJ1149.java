package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// RGB거리
public class BJ1149 {

    public static int[][] rgb = new int[1001][3];
    public static int[][] dp = new int[1001][3];
    public static int RED = 0, GREEN = 1, BLUE = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            rgb[i][RED] = sc.nextInt();
            rgb[i][GREEN] = sc.nextInt();
            rgb[i][BLUE] = sc.nextInt();
        }

        dp[1][RED] = rgb[1][RED];
        dp[1][BLUE] = rgb[1][BLUE];
        dp[1][GREEN] = rgb[1][GREEN];

        System.out.println(Math.min(Paint_cost(n, RED), Math.min(Paint_cost(n, BLUE), Paint_cost(n,GREEN))));


    }

    public static int Paint_cost(int n, int color) {
        if(dp[n][color] == 0) {
            if(color == RED) {
                dp[n][RED] = Math.min(Paint_cost(n-1,GREEN), Paint_cost(n-1, BLUE)) + rgb[n][RED];
            }
            else if(color == GREEN) {
                dp[n][GREEN] = Math.min(Paint_cost(n-1,BLUE), Paint_cost(n-1,RED)) + rgb[n][GREEN];
            }
            else {
                dp[n][BLUE] = Math.min(Paint_cost(n-1, RED), Paint_cost(n-1,GREEN)) + rgb[n][BLUE];
            }
        }
        return dp[n][color];
    }
}
