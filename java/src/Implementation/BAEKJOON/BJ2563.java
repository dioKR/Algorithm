package Implementation.BAEKJOON;

import java.util.Scanner;

// 색종이
public class BJ2563 {
    public static boolean[][] map = new boolean[100][100];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            solution(start, end);
        }

        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(map[i][j]) result++;
            }
        }

        System.out.println(result);


    }

    public static void solution(int x, int y) {
        for (int i = y - 1; i < y + 9; i++) {
            for (int j = x - 1; j < x + 9; j++) {
                if (!map[i][j]) map[i][j] = true;
            }
        }
    }
}
