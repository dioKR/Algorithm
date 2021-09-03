package Greedy.BAEKJOON;

import java.util.Scanner;

public class BJ1080 {

    public static int[][] a, b;
    public static int n, m, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        a = new int[n][m];
        b = new int[n][m];

        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<m; j++) {
                a[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i=0; i<n; i++) {
            String str = sc.next();
            for(int j=0; j<m; j++) {
                b[i][j] = str.charAt(j) - '0';
            }
        }

        // 답안
        if(n < 3 || m < 3) {
            if(IsSame(a,b)) {
                result = 0;
            } else {
                result = -1;
            }
        } else {
            Solution();
        }

        if( !IsSame(a,b)) {
            result = -1;
        }

        System.out.println(result);

    }

    private static void Solution() {
        for(int i=0; i<n-2; i++) {
            for(int j=0; j<m-2; j++) {
                if(a[i][j] != b[i][j]) {
                    toggle(i,j);
                    result++;
                }
            }
        }
    }

    private static void toggle(int row, int col) {
        for(int i=row; i<row+3; i++) {
            for(int j=col; j<col+3; j++) {
                // xor 연산자
                // 1이 짝수개이면 0
                // 1이 홀수개이면 1
                a[i][j] = a[i][j] ^ 1;
            }
        }
    }

    private static boolean IsSame(int[][] a, int[][] b) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}
