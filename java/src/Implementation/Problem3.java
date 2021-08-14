package Implementation;

import java.util.Scanner;

// 게임개발
public class Problem3 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int dir;
    static int turn_time;
    static int cnt;

    public static void turn_left() {
        dir -= 1;
        if (dir == -1) dir = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        int x = sc.nextInt(); int y = sc.nextInt(); dir = sc.nextInt();
        int[][] visited = new int[n][m];
        int[][] map = new int[n][m];
        visited[x][y] = 1;
        cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        while (true) {
            turn_left();
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(visited[nx][ny] == 0 && map[nx][ny] == 0) {
                visited[nx][ny] = 1;
                x = nx; y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            } else {
                turn_time++;
            }

            if(turn_time == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];

                if(map[nx][ny] == 0) {
                    x = nx; y = ny;
                } else {
                    break;
                }
                turn_time = 0;
            }
        }
        System.out.println(cnt);
    }
}
