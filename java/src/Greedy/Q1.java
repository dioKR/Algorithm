package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int result = 0;
        int count = 0;
        for(int i : arr) {
            count++;
            if(count >= i) {
                result++;
                count = 0;
            }
        }

        System.out.println(result);


    }
}
