package DFS.BAEKJOON;

import java.util.Scanner;

// 빙산
public class BJ2573 {

    static int N, M;
    static int[][] map;
    static int[][] afterMap;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int result = 0;
    static int piece = 0;

    public static boolean DFS(int x, int y) {
        if(x < 0 || y < 0 || x >= N || y >= M) return false;
        if(map[x][y] != 0 && !visited[x][y]) {
            visited[x][y] = true;
            DFS(x-1, y);
            DFS(x, y-1);
            DFS(x+1, y);
            DFS(x, y+1);
            return true;
        }
        return false;
    }

    public static boolean check() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] != 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        afterMap = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        while (!check()) {

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] != 0) {
                        int cnt = 0;
                        for (int k = 0; k < 4; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];

                            if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                            if (map[nx][ny] == 0) cnt++;

                        }
                        afterMap[i][j] = Math.max(map[i][j] - cnt, 0);
                    }
                }
            }

            for (int i = 0; i < N; i++) if (M >= 0) System.arraycopy(afterMap[i], 0, map[i], 0, M);
            result++;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (DFS(i, j)) piece++;
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    visited[i][j] = false;
                }
            }

            if (piece >= 2) break;
            piece = 0;

        }

        if (piece == 0) System.out.println(0);
        else System.out.println(result);

    }
}
