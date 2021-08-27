package Greedy.BAEKJOON;

import java.util.Scanner;

// 수들의 합
public class BJ1789 {

    // 총 합의 범위가 1 ~ 4,294,967,295 이기때문에 log 타입 사용
    public static long s;
    public static long result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        s = sc.nextLong();

        int i = 1;

        while (true) {

            result = result + i;
            if(result > s) break;
            i++;

        }

        System.out.println(i-1);
    }
}
