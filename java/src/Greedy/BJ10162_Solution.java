package Greedy;

import java.util.Scanner;

public class BJ10162_Solution {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int a = 0; int b = 0; int c = 0;

        int t = sc.nextInt();

        long start = System.currentTimeMillis();
        while(t >= 10) {
            if(t >= 300) {
                t -= 300;
                a++;
            } else if(t >= 60) {
                t -= 60;
                b++;
            } else {
                t -= 10;
                c++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("수행시간 :" + (end - start) + " ms");

        System.out.println(t == 0 ? a + " " + b + " " + c : -1);



    }
}
