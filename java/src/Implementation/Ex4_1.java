package Implementation;

import java.util.Scanner;

public class Ex4_1 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int x = 0;
    static int y = 0;
    static int n = 0;

    public static void move(int i) {
        int rx = x + dx[i];
        int ry = y + dy[i];

        if((0 <= rx && rx < n) && (0 <= ry && ry < n)) {
            x = rx;
            y = ry;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] map = new int[n][n];
        sc.nextLine(); // 버퍼 지우기
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++) {
            switch(str.charAt(i)) {
                case 'U':
                    move(0);
                    break;
                case 'R':
                    move(1);
                    break;
                case 'D':
                    move(2);
                    break;
                case 'L':
                    move(3);
                    break;
            }
        }
        System.out.println((x+1) + " " + (y+1));
    }
}
