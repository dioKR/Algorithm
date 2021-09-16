package Implementation.BAEKJOON;

import java.util.Scanner;

// 더하기 사이클
public class BJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp = n;
        int cnt = 0;

        while (true) {

            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;
            

            if(tmp == n) {
                break;
            }


        }
        System.out.println(cnt);
    }
}
