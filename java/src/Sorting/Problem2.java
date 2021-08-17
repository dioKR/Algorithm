package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
//        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
//        SelectionSort(arr);
        InsertionSort(arr);
//        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max_index = i;
            for(int j= i+1; j<arr.length; j++) {
                if(arr[j] > arr[max_index]) max_index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = tmp;
        }
    }

    public static void InsertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] > arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}
