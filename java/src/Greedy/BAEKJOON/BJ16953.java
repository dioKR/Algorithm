package Greedy.BAEKJOON;

import java.util.Scanner;

// A->B
public class BJ16953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = -1;
        int cnt = 0;

        while(true) {
            if((b-1)%10 == 0) {
                b = (b-1)/10;
                cnt++;
            } else if(b%2 == 0) {
                b = b/2;
                cnt++;
            } else {
                break;
            }

            if(a == b) {
                result = (cnt+1);
                break;
            } else if(a > b) {
                result = -1;
                break;
            }
        }

        System.out.println(result);
    }
}
