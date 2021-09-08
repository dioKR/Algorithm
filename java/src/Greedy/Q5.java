package Greedy;

import java.util.Scanner;

// 볼링공 고르기
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt();
        int[] arr = new int[1001];
        int cnt = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] != arr[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
