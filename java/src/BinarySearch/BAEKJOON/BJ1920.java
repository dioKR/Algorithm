package BinarySearch.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

// 수 찾기
public class BJ1920 {

    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int value = sc.nextInt();
            if(binarySearch(value)) System.out.println("1");
            else System.out.println("0");
        }

    }

    public static boolean binarySearch(int value) {
        int start = 0;
        int end = n-1;
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] > value) {
                end = mid-1;
            } else if(arr[mid] < value) {
                start = mid+1;
            } else {
                return true;
            }
        }
        return false;
    }

}
