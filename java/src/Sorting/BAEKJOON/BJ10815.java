package Sorting.BAEKJOON;

import java.util.Scanner;

// 숫자 카드
public class BJ10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] arr = new int[20000001];

        for(int i=0; i<n; i++) {
            int value = sc.nextInt();
            arr[10000000 + value]++;
            if(max < value) {
                max = value;
            }
            if(min > value) {
                min = value;
            }
        }

        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int value2 = sc.nextInt();
            if(arr[10000000 + value2] > 0) {
                System.out.print("1" + " ");
            } else {
                System.out.print("0" + " ");
            }
        }

    }
}
