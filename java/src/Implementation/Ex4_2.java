package Implementation;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i=0 ;i<=n; i++) {
            for(int j=0;j<=59;j++) {
                for(int k=0;k<=59;k++) {
                    String str = i + " " + j + " " + k;
                    if(str.contains("3")) count++;
                }
            }
        }

        System.out.println(count);
    }
}

class Solution4_2 {

    public static boolean check(int h, int m, int s) {
        return h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int cnt = 0;

        for(int i=0; i<= h; i++) {
            for(int j=0; j<60; j++) {
                for(int k=0; k<60; j++) {
                    if(check(i,j,k)) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}