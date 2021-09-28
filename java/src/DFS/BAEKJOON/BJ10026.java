package DFS.BAEKJOON;

import java.util.Scanner;

// 적록색약
public class BJ10026 {

    public static int N;
    public static String[] str;
    public static char[][] map;
    public static boolean[][][] visited;
    public static int[] result = {0, 0};
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};


    public static void DFS(int x, int y, boolean[][] visited, char ch) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny] || map[nx][ny] != ch) continue;
            DFS(nx, ny, visited, ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        str = new String[N];
        map = new char[N][N];
        visited = new boolean[2][N][N];

        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = str[i].charAt(j);
            }
        }

        for(int k=0; k<2; k++) {
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(!visited[k][i][j]) {
                        DFS(i,j, visited[k], map[i][j]);
                        result[k]++;
                    }
                    if(map[i][j] == 'G') map[i][j] = 'R';
                }
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }
}
