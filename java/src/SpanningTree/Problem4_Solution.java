package SpanningTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 커리큘럼
// 위상정렬
public class Problem4_Solution {

    public static int n;
    public static int[] indegree = new int[10001];
    public static int[] costs = new int[10001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i < n + 1; i++) {
            int cost = sc.nextInt();
            costs[i] = cost;
            while (true) {
                int in = sc.nextInt();
                if (in == -1) break;
                indegree[i] += 1;
                graph.get(in).add(i);
            }
        }
        topologySort();
    }

    public static void topologySort() {
        int[] result = new int[501];
        if (n + 1 - 1 >= 0) System.arraycopy(costs, 1, result, 1, n + 1 - 1);


        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();

            for (Integer i : graph.get(now)) {
                result[i] = Math.max(result[now], result[now] + costs[i]);
                indegree[i] -= 1;
                if (indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            System.out.println(result[i]);
        }

    }
}
