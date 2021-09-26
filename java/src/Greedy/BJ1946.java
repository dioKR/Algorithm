package Greedy;

import java.util.Scanner;

public class BJ1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] ranking = new int[n+1];

            for(int i=0; i<n; i++) {
                ranking[sc.nextInt()] =sc.nextInt();
            }

            int tmp = ranking[1];
            int result = 1;

            for(int i=2; i<=n; i++) {
                if(tmp >= ranking[i]) {
                    tmp = ranking[i];
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
