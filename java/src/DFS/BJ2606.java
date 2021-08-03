package DFS;

import java.util.Scanner;

// 백준 2606 바이러스
//TODO ArrayList 학습하고 인접리스트로 풀기
public class BJ2606 {

    static int[][] graph;
    static boolean[] visited;
    static int cnt = 0;
    static int node;
    static int edge;

    public static int dfs(int nodeNum) {
        visited[nodeNum] = true;
        for(int i=1; i<=node; i++)  {
            if(graph[nodeNum][i] == 1 && !visited[i]) {
                cnt++;
                dfs(i);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        node = sc.nextInt();
        edge = sc.nextInt();

        graph = new int[node + 1][node + 1];
        visited = new boolean[node + 1];

        for (int i = 0; i < edge; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = graph[b][a] = 1;
        }

        System.out.println(dfs(1));

    }
}
