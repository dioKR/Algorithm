package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 1로 만들기
public class BJ1463 {

    public static int[] dp = new int[1000000];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + 1;

            if(i%3==0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
            if(i%2==0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

        }
        System.out.println(dp[n]);
    }
}
