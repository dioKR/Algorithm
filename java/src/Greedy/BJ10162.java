package Greedy;

// 그리디
// 전자레인지
// 브론즈4

import java.util.Scanner;

public class BJ10162 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int a = 0; int b = 0; int c = 0;

        if(t%10 != 0) {
            System.out.println(-1);
            System.exit(0);
        }

        while (t != 0) {
            if (t >= 300) {
                a = t/300;
                t %= 300;
            } else if (t >= 60) {
                b = t/60;
                t %= 60;
            } else if (t >= 10) {
                c = t/10;
                t %= 10;
            }
        }

        System.out.println(a + " " + b + " " + c);

        long end = System.currentTimeMillis();

        System.out.println("수행시간 : " + (end - start) + " ms");

    }
}
