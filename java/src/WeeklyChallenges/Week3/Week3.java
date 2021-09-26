package WeeklyChallenges.Week3;

import java.util.*;

public class Week3 {

    public class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public ArrayList<String> emptyList = new ArrayList<>();
    public int N;
    public int[] dx = {0, 0, -1, 1};
    public int[] dy = {-1, 1, 0, 0};

    public int solution(int[][] game_board, int[][] table) {
        N = game_board.length;
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (game_board[i][j] == 0) {
                    emptyList.add(bfs(game_board, i, j, 0));
                }
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(table[i][j] == 1) {
                    answer += find(bfs(table, i,j,1));
                }
            }
        }
        return answer;
    }

    public int find(String s) {
        int point = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') point++;
        }

        for(int i=0; i< emptyList.size(); i++) {
            String str = emptyList.get(i);

            for(int j=0; j<4; j++) {
                str = rotate(str);
                if(s.equals(str)) {
                    emptyList.remove(i);
                    return point;
                }
            }
        }

        return 0;
    }

    public String rotate(String s) {
        String str = "";
        int x = 0; int y = 0;
        for(int i=0; i<s.length(); i++) {
            if(x==0) {
                if(s.charAt(i) != ' ') {
                    y++;
                }
            }
            if(s.charAt(i) == ' ') {
                x++;
            }
        }
        char[][] arr = new char[x][y];
        StringTokenizer st = new StringTokenizer(s);

        for(int i=0; i<x; i++) {
            arr[i] = st.nextToken().toCharArray();
        }

        for(int j=0; j<y; j++) {
            for(int i=x-1; i>=0; i--) {
                str += arr[i][j];
            }
            str += " ";
        }
        return str;
    }

    public String bfs(int[][] arr, int i, int j, int mode) {
        String s = "";
        ArrayDeque<Node> q = new ArrayDeque<>();
        boolean[][] tmp = new boolean[N][N];

        int x_min = i;
        int x_max = i;
        int y_min = j;
        int y_max = j;

        tmp[i][j] = true;
        arr[i][j] = (mode + 1) % 2;
        q.add(new Node(i, j));

        while (!q.isEmpty()) {
            Node cur = q.poll();
            int x = cur.x;
            int y = cur.y;

            x_min = Math.min(x_min, x);
            x_max = Math.max(x_max, x);
            y_min = Math.min(y_min, y);
            y_max = Math.max(y_max, y);

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (!isBoundary(nx, ny)) continue;
                if (arr[nx][ny] == mode) {
                    tmp[nx][ny] = true;
                    arr[nx][ny] = (mode + 1) % 2;
                    q.add(new Node(nx, ny));
                }
            }
        }

        for (int x = x_min; x <= x_max; x++) {
            for (int y = y_min; y <= y_max; y++) {
                s += tmp[x][y] ? "1" : "0";
            }
            s += " ";
        }
        return s;
    }

    public boolean isBoundary(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

}
