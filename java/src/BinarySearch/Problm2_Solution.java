package BinarySearch;

import java.util.Scanner;

// 부품찾기
// 계수정렬로 문제풀기
public class Problm2_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] items = new int[1000001];

        for (int i = 0; i < n; i++) {
            items[sc.nextInt()] = 1;
        }

        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j : arr) {
            if(items[j] == 1) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }

    }
}
