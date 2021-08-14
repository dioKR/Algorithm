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
        sc.nextLine(); // 버퍼 지우기

        long start = System.currentTimeMillis();

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

        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end-start) + " ms");
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        long start = System.currentTimeMillis();

        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        //         왼쪽, 오른쪽, 위, 아래
        int[] dx = {0,  0,   -1,  1};
        int[] dy = {-1, 1,    0,  0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        for(int i=0; i<plans.length; i++) {
            char plan = plans[i].charAt(0);

            int nx = -1, ny = -1;
            for(int j=0; j<4; j++) {
                if(plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if(nx < 1 || ny < 1 || nx > n || ny > n) continue;

            x = nx;
            y = ny;

        }
        System.out.println(x + " " + y);

        long end = System.currentTimeMillis();
        System.out.println("수행시간 : " + (end - start) + " ms");

    }
}
