package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dp = new int[m+1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            for (int j = 1; j <= m; j++) {
                if (j - k >= 0) {
                    dp[j] = Math.min(dp[j], dp[j - k] + 1);
                }
            }
        }

        if (dp[m] == 10001) System.out.println(-1);
        else {
            System.out.println(dp[m]);
        }
    }

    public static void Solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] d = new int[m+1];
        Arrays.fill(d, 10001);

        d[0] = 0;
        for(int i=0; i<n; i++) {
            for(int j = arr[i]; j<=m; j++) {
                if(d[j - arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j-arr[i]] + 1);
                }
            }
        }
        if(d[m] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(d[m]);
        }

    }
}
