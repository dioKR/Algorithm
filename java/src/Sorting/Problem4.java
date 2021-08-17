package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a); // 오름차순
        Arrays.sort(b, Collections.reverseOrder()); // 내림차순

        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                int tmp = a[i];
                a[i] = b[i];
                b[i] = tmp;
            } else break;
        }

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);

    }
}
