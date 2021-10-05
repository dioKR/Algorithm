package DFS.BAEKJOON;

import java.util.HashSet;
import java.util.Scanner;

// 숫자판 점프
public class BJ2210 {

    public static int[][] map = new int[5][5];
    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static String str = "";
    public static HashSet<String> set = new HashSet<>();

    public static void DFS(int x, int y, int depth, String str) {

        if(depth == 6) {
            set.add(str);
            return;
        }

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= 5 || ny >=5) continue;
            DFS(nx,ny, depth+1, str+map[x][y]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                DFS(i,j,0,str);
            }
        }

        System.out.println(set.size());

    }
}
