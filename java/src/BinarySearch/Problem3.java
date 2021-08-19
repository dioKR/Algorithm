package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// 떡볶이 떡 만들기
public class Problem3 {

    static int n;
    static int m;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] dducks = new int[n];

        for (int i = 0; i < n; i++) {
            dducks[i] = sc.nextInt();
        }

        System.out.println(binary_search(dducks, m, 0, dducks[n - 1]));

    }

    public static int binary_search(int[] arr, int target, int start, int end) {
        int result = 0;
        while(start <= end) {
            int total = 0;
            int mid = (start + end) / 2;
            for (int j : arr) {
                if (j > mid) {
                    total += (j - mid);
                }
            }

            if(total < target) end = mid-1;
            else {
                result = mid;
                start = mid+1;
            }

        }
        return result;
    }


}
