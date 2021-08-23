package ShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 개선된 다익스트라 알고리즘
// 우선순위 큐사용
// 힙큐

class NodeImpl implements Comparable<NodeImpl> {
    private int index;
    private int distance;

    NodeImpl(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(NodeImpl o) {
        if (this.distance < o.distance) {
            return -1;
        }
        return 1;
    }
}

public class Ex9_2 {

    public static final int INF = (int) 1e9;
    public static int n;
    public static int m;
    public static int start;
    public static boolean[] visited = new boolean[10001];
    public static int[] distance = new int[10001];
    public static ArrayList<ArrayList<NodeImpl>> graph = new ArrayList<ArrayList<NodeImpl>>();


    public static void dijkstra(int start) {
        PriorityQueue<NodeImpl> pq = new PriorityQueue<>();
        pq.offer(new NodeImpl(start, 0));
        distance[start] = 0;

        while(!pq.isEmpty()) {
            NodeImpl node = pq.poll();
            int d = node.getDistance();
            int now = node.getIndex();

            if(distance[now] < d) continue;

            for(NodeImpl n : graph.get(now)) {

                int cost = distance[now] + n.getDistance();
                if(cost < distance[n.getIndex()]) {
                    distance[n.getIndex()] = cost;
                    pq.offer(new NodeImpl(n.getIndex(), cost));

                }

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();
        Arrays.fill(distance, INF);

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<NodeImpl>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new NodeImpl(b,c));
        }

        dijkstra(start);

        for (int i = 1; i < n + 1; i++) {
            if (distance[i] == INF) {
                System.out.println("INFINITY");
            } else {
                System.out.println(distance[i]);
            }
        }


    }
}
