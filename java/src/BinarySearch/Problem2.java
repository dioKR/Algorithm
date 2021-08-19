package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// 이코테
// 부품찾기
public class Problem2 {

    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] items = new int[n];
        for(int i=0; i<n; i++) {
            items[i] = sc.nextInt();
        }

        Arrays.sort(items);

        m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            System.out.print(binary_search(items, j, 0, n - 1) + " ");
        }

    }

    public static String binary_search(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == target) return "yes";
            else if(arr[mid] > target) end = mid-1;
            else start = mid+1;
        }
        return "no";
    }

}
