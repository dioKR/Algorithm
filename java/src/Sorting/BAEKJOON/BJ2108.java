package Sorting.BAEKJOON;

import java.util.Scanner;

// 산술 평균
public class BJ2108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 10000;
        int mode = 10000;

        // 산술평균과 범위를 구하기 위한 로직
        // 입력을 받으면서 구한다.
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

        int count = 0;
        int mode_max = 0;

        // 두번째 값을 찾기위해서 flag 필요
        boolean flag = false;

        // 중앙값과 최빈값을 구하는 로직
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                if (count < (n + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                if (mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (mode_max == arr[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }


        System.out.println((int) Math.round((double) sum / n));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);

    }

}
