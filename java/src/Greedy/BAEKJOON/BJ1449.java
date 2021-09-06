package Greedy.BAEKJOON;

import java.util.Scanner;

// 수리공
public class BJ1449 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int l = sc.nextInt();
        boolean[] pipe = new boolean[2001];
        int result = 0;

        for(int i=0; i<n; i++) {
            pipe[sc.nextInt()] = true;
        }

        for(int i=0; i<2001; i++) {
            int tmp = 0;
            if(pipe[i]) {
                for(int j=0; j<l; j++) {
                    pipe[i+j] = false;
                    tmp = j;
                }
                i = i + tmp;
                result++;
            }
        }
        System.out.println(result);

    }
}
