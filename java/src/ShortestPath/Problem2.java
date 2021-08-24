package ShortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static int N,M,X,K;
    public static final int INF = (int) 1e9;
    public static int[][] graph = new int[101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();

        for(int i=0; i<101; i++) {
            Arrays.fill(graph[i], INF);
        }

        for(int i=1; i<N+1; i++) {
            for(int j=1; j<N+1; j++) {
                if(i==j) graph[i][j] = 0;
            }
        }

        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        X = sc.nextInt(); K = sc.nextInt();

        for(int k=1; k<=N; k++) {
            for(int a=1; a<=N; a++) {
                for(int b=1; b<=N; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        int distance = graph[1][K] + graph[K][X];

        if(distance>=INF) {
            System.out.println(-1);
        } else {
            System.out.println(distance);
        }



    }
}
