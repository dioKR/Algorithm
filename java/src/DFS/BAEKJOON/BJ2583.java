package DFS.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

// 영역 구하기
public class BJ2583 {

    static int M,N,K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int result = 0;
    static int cnt = 0;
    static int[] v = new int[101];

    public static void DFS(int x, int y) {
        visited[x][y] = true;
        cnt++;
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= M || ny >= N || map[nx][ny] != 0 || visited[nx][ny]) continue;
            DFS(nx,ny);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        map = new int[M][N];
        visited = new boolean[M][N];
        for(int k=0; k<K; k++) {
            int start_x = sc.nextInt();
            int start_y = sc.nextInt();
            int end_x = sc.nextInt();
            int end_y = sc.nextInt();

            for(int i=start_y; i<end_y; i++) {
                for(int j=start_x; j<end_x; j++) {
                    map[i][j] = 1;
                }
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && map[i][j] == 0) {
                    DFS(i,j);
                    v[result] = cnt;
                    cnt = 0;
                    result++;
                }
            }
        }

        Arrays.sort(v, 0, result);

        System.out.println(result);
        for(int i=0; i<result; i++) {
            System.out.print(v[i] + " ");
        }

    }
}
