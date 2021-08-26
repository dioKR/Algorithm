package SpanningTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 위상 정렬 알고리즘
// 방향 그래프의 모든 노드를 방향성에 거스르지 않도록 순서대로 나열하는 것
public class TopologySort {

    public static int v,e;
    public static int[] indegree = new int[10001];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void topologySort() {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=v; i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }

        while(!q.isEmpty()) {
            int now = q.poll();
            result.add(now);

            for(Integer i : graph.get(now)) {
                indegree[i] -= 1;
                if(indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        v = sc.nextInt();
        e = sc.nextInt();

        for(int i=0; i<=v; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            indegree[b] += 1;

        }

        topologySort();
    }

}
