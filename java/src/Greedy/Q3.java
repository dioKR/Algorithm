package Greedy;

import java.util.Scanner;

// 문자열 뒤집기
public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int result = 0;
        int zero = 0;
        int one = 0;


        if(str.charAt(0) == '0') {
            zero++;
        } else if(str.charAt(0) == '1') {
            one++;
        }

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == '0' && str.charAt(i-1) == '1') zero++;
            else if(str.charAt(i) == '1' && str.charAt(i-1) == '0') one++;
        }

        result = Math.min(zero, one);
        System.out.println(result);
    }
}
