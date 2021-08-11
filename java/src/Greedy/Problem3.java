package Greedy;

import java.util.Arrays;
import java.util.Scanner;

// 숫자카드게임
public class Problem3 {
    // mySolution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int num;
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr[i]);
            num = arr[i][0];
            if (num > max) max = num;
        }

        System.out.println(max);
    }
}

class P3_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for(int i=0; i<n; i++) {
            int min_value = 10001;
            for(int j=0; j<m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            result = Math.max(result, min_value);
        }
        System.out.println(result);
    }
}