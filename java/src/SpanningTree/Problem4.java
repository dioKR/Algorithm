package SpanningTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 커리큘럼
// 위상정렬
public class Problem4 {

    public static int n;
    public static int[] indegree = new int[10001];
    public static int[] costs = new int[10001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0; i<n+1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=1; i<n+1; i++) {
            int cost = sc.nextInt();
            while(true) {
                int in = sc.nextInt();
                if(in == -1) break;
                graph.get(in).add(i);
                indegree[i] += 1;
            }
            costs[i] = cost;
        }
        topologySort();
    }

    public static void topologySort() {
        int[] result =  new int[n+1];
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<n+1; i++) {
            if(indegree[i] == 0) {
                result[i] = costs[i];
                q.offer(i);
            }
        }

        while(!q.isEmpty()) {
            int now = q.poll();

            for(Integer i : graph.get(now)) {
                indegree[i] -= 1;
                if(indegree[i] == 0) {
                    result[i] = Math.max(result[now],result[now] + costs[i]);
                    q.offer(i);
                }
            }
        }

        for(int i=1; i<n+1; i++) {
            System.out.println(result[i]);
        }

    }
}
