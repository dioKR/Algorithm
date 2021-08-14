package Implementation;

import java.util.*;

public class Problem3_Solution {
    public static int n, m, x, y, dir;
    public static int[][] visited = new int[50][50];
    public static int[][] map = new int[50][50];

    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, 1, 0, -1};

    public static void turn_left() {
        dir -= 1;
        if(dir == -1) dir = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        x = sc.nextInt();
        y = sc.nextInt();
        dir = sc.nextInt();
        visited[x][y] = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int cnt = 1;
        int turn_time = 0;
        while(true) {
            turn_left();
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(visited[nx][ny] == 0 && map[nx][ny] == 0) {
                visited[nx][ny] = 1;
                x = nx;
                y = ny;
                cnt += 1;
                turn_time = 0;
                continue;
            }
            else turn_time += 1;

            if(turn_time == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];
                if(map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }
                else break;
                turn_time = 0;
            }
        }
        System.out.println(cnt);
    }

}
