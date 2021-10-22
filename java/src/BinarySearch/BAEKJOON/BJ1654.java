package BinarySearch.BAEKJOON;

import java.util.Scanner;

// 랜선 자르기
public class BJ1654 {

    static int k;
    static long n;
    static long[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextLong();

        arr = new long[k];
        long max = 0;

        for(int i=0; i<k; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        long min = 1;
        long mid = 0;

        while(min <= max) {
            long count = 0;
            mid = (max + min) / 2;
            for(int i=0; i<k; i++) {
                count += (arr[i]/mid);
            }

            if(count < n) {
                max = mid-1;
            } else {
                min = mid+1;
            }
        }

        System.out.println(max);

    }



}
