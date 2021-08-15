package Greedy;


import java.util.Scanner;
import java.util.Arrays;

// 그리디
// 로프
// 실버4
public class BJ2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }

        Arrays.sort(weight);

        for (int i = 0; i < n; i++) {
            int tmp = weight[i] * (n-i);
            if(tmp > max) max = tmp;
        }

        System.out.println(max);

    }
}
