package DynamicProgramming.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

// 피보나치 함수
public class BJ1003 {

    public static int[] zero = new int[41];
    public static int[] one = new int[41];

    public static int[] fibonacci(int n) {
        if(zero[n] == -1 || one[n] == -1) {
            zero[n] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
            one[n] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
        }
        return new int[]{zero[n], one[n]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Arrays.fill(zero,-1);
        Arrays.fill(one, -1);

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        fibonacci(40);

        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.println(zero[n] + " " + one[n]);
        }

    }
}
