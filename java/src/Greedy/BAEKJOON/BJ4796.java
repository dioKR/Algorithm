package Greedy.BAEKJOON;

import java.util.Scanner;

public class BJ4796 {
    public static int L, V, P;
    public static int[] results = new int[1001];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;

        while(true) {
            L = sc.nextInt();
            V = sc.nextInt();
            P = sc.nextInt();
            if(L==0) break;


            int result = (P/V) * L + Math.min((P%V), L);

            results[index] = result;
            index++;
        }

        for(int i=0; i<index; i++) {
            System.out.println("Case " + (i+1) + ": " + results[i]);
        }
    }
}
