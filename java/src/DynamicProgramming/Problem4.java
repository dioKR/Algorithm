package DynamicProgramming;

import java.util.Scanner;

// 이코테
// 1로 만들기
// 바텀업 방식 - 상향식
public class Problem4 {

    static int[] d = new int[30001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i < n + 1; i++) {
            d[i] = d[i - 1] + 1;
            if(i%2 == 0) {
                d[i] = Math.min(d[i], d[i/2] + 1);
            }
            if(i%3 == 0) {
                d[i] = Math.min(d[i], d[i/3] + 1);
            }
            if(i%5 == 0) {
                d[i] = Math.min(d[i], d[i/5] + 1);
            }
        }

        System.out.println(d[n]);


    }


}
