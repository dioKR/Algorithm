package DynamicProgramming.BAEKJOON;

import java.util.Scanner;


// 1,2,3 더하기 문제풀이
public class BJ9095 {

    public static int[] dp = new int[11];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<11; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.print(dp[n] + " ");
        }


    }
}

// 1,2,3 을 이용해서 1을 세는 방법의 수는 1가지 (1)
// 2를 세는 방법의 수는 2가지 (1+1, 2)
// 3을 세는 방법의 수는 4가지 (1+1+1, 2+1, 1+2, 3)

// 4의 경우
// 크게 보았을 때 1+3, 2+2, 3+1
// 1을 썻을 때 dp[3] 사용
// 2를 썻을 때 dp[2] 사용
// 3을 썻을 때 dp[1] 사용

// 5의 경우
// 크게 보았을 때 1+4, 2+3, 3+2
// 1을 사용 했을 때 dp[4] 사용
// 2를 사용 했을 때 dp[3] 사용
// 3을 사용 했을 때 dp[2] 사용