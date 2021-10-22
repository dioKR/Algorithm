package BinarySearch.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

// 나무 자르기
public class BJ2805 {

    static int n;
    static long m;
    static long[] tree;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextLong();

        tree = new long[n];


        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextLong();
        }

        Arrays.sort(tree);

        System.out.println(binary_search(tree, m, 0, tree[n - 1]));

    }

    public static long binary_search(long[] arr, long target, long start, long end) {
        long result = 0;
        while (start <= end) {
            long total = 0;
            long mid = (start + end) / 2;
            for (long j : arr) {
                if (j > mid) total += (j - mid);
            }

            if (total < target) end = mid - 1;
            else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }


}
