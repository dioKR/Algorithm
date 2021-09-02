package Greedy.BAEKJOON;

import java.util.Scanner;

// 뒤집기
public class BJ1439 {

    static String str;
    static int zero;
    static int one;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        if(str.charAt(0) == '0') {
            zero++;
        } else {
            one++;
        }

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) {
                if(str.charAt(i) == '0') zero++;
                else one++;
            }
        }


        System.out.println(Math.min(zero,one));

    }
}
