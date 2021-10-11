package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 2 x n 타일링 2
public class BJ11727 {

    public static int n;
    public static int[] dp = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        dp[1] = 1;
        dp[2] = 3;

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
        }

        System.out.println(dp[n]);


    }


}
