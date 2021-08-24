package ShortestPath;

import java.util.Arrays;
import java.util.Scanner;

public class FloydWarshall {
    public static int INF = (int) 1e9;
    public static int n;
    public static int m;
    public static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); m = sc.nextInt();
        graph = new int[n+1][n+1];
        for(int i=1; i<n+1; i++) {
            Arrays.fill(graph[i], INF);
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                if(i==j) graph[i][j] = 0;
            }
        }

        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph[a][b] = c;
        }

        for(int k=1; k<n+1; k++) {
            for(int a=1; a<n+1; a++) {
                for(int b=1; b<n+1; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        for(int a=1; a<n+1; a++) {
            for(int b=1; b<n+1; b++) {
                if(graph[a][b] == INF) {
                    System.out.print("INFINITY ");
                } else {
                    System.out.print(graph[a][b] + " ");
                }
            }
            System.out.println();
        }


    }

}
