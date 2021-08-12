package Greedy;

import java.util.Scanner;

// 백준 그리디-11047 동전
public class coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int k = sc.nextInt();
        int[] money = new int[n];
        int cnt = 0;


        for(int i=0 ;i<n; i++) {
            money[i] = sc.nextInt();
        }

        for(int i=n-1; i>=0; i--) {
            if(money[i] > k) continue;

            cnt += k/money[i];
            k %= money[i];
        }

        System.out.println(cnt);
    }
}
