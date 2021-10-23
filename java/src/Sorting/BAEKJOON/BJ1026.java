package Sorting.BAEKJOON;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 보물
public class BJ1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        Integer[] b = new Integer[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        int sum =0;
        for(int i=0; i<n; i++) {
            sum += (a[i] * b[i]);
        }

        System.out.println(sum);


    }
}
