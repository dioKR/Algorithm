package DynamicProgramming;

import java.util.Scanner;

public class BJ11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++) {
            //  dp를 구할때마다 10007로 나눠줘야 오버플로우가 나지 않는다.
            dp[i] = (dp[i-1] + dp[i-2])%10007;
        }
        // 마지막에만 10007로 나눌시
        // 일정 n 값 이상에서 음수값 출력
        System.out.println(dp[n]);


    }
}
