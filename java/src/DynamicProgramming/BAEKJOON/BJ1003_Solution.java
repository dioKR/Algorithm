package DynamicProgramming.BAEKJOON;

import java.util.Scanner;

// 피보나치 함수 솔루션
public class BJ1003_Solution {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();

            fibo(N);
            System.out.println(dp[N][0] + " " + dp[N][1]);

        }
    }

    static Integer[] fibo(int N) {
        if(dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibo(N-1)[0] + fibo(N-2)[0];
            dp[N][1] = fibo(N-1)[1] + fibo(N-2)[1];
        }
        return dp[N];
    }
}
