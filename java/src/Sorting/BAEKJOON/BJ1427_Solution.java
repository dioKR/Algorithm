package Sorting.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1427_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }

    }
}
