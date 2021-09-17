package Implementation.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

// 통계확
public class BJ2108 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 100000;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sum += value;
            arr[value + 4000]++;

            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }

        int cnt = 0;
        int mode_max = 0;

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                if (cnt < (n + 1) / 2) {
                    cnt += arr[i];
                    median = i - 4000;
                }

                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }
                else if(mode_max == arr[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double)sum/n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);


    }
}
