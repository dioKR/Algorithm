package DynamicProgramming;

import java.util.Scanner;

// 이코테
// 바닥공사
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 3;

        for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + (2 * dp[i-2]))%796796;
        }

        System.out.println(dp[n]);



    }
}
