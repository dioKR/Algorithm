package DFS;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {

    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visited = {false, false, false, false, false, false, false, false, false};
    static int[][] graph = {
            {},
            {2, 3, 8},
            {1, 7},
            {1, 4, 5},
            {3, 5},
            {3, 4},
            {7},
            {2, 6, 8},
            {1, 7},
    };

    public static void bfs(int[][] graph, int start, boolean[] visited) {
        q.add(start);
        visited[start] = true;

        // queue 가 빌 때 까지 무한반복
        while(!q.isEmpty()) {
            int tmp = q.poll();
            System.out.print(tmp + " ");
            for(int node : graph[tmp]) {
                if(!visited[node]) {
                    q.add(node);
                    visited[node] = true;
                }
            }

        }

    }

    public static void main(String[] args) {
        bfs(graph, 1, visited);
    }
}
