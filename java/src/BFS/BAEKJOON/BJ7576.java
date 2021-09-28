package BFS.BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int i;
    private int j;

    public Node(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}

// 토마토
public class BJ7576 {

    public static int M, N;
    public static int[][] map;
    public static int[][] visited;
    public static int result;

    public static int[] dx = {1, 0, -1, 0};
    public static int[] dy = {0, 1, 0, -1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> q = new LinkedList<Node>();

        M = sc.nextInt();
        N = sc.nextInt();

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 1)  q.offer(new Node(i,j));
            }
        }

        while(!q.isEmpty()) {
            Node n = q.poll();
            for(int i=0; i<4; i++) {
                int nx = n.getI() + dx[i];
                int ny = n.getJ() + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M ) {
                    continue;
                }
                if(map[nx][ny] != 0) {
                    continue;
                }
                map[nx][ny] = map[n.getI()][n.getJ()] + 1;
                q.add(new Node(nx, ny));

            }
        }
        int max = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }
        System.out.println(max-1);

    }
}
