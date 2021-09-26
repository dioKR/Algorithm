package ShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node1 implements Comparable<Node1> {
    private int index;
    private int distance;

    Node1(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    // 거리가 짧은 것이 높은 우선 순위를 가지도록 설정
    @Override
    public int compareTo(Node1 o) {
        if(this.distance < o.distance) {
            return -1;
        }
        return 1;
    }

}

public class Problem3 {

    public static final int INF = (int) 1e9;
    public static int n;
    public static int m;
    public static int c;
    public static boolean[] visited = new boolean[30001];
    public static int[] distance = new int[30001];
    public static ArrayList<ArrayList<Node1>> graph = new ArrayList<>();


    public static void dijkstra(int start) {
        PriorityQueue<Node1> pq = new PriorityQueue<>();
        pq.offer(new Node1(start, 0));
        distance[start] = 0;

        while(!pq.isEmpty()) {
            Node1 node = pq.poll();
            int d = node.getDistance();
            int now = node.getIndex();

            if(distance[now] < d) continue;

            for(Node1 n : graph.get(now)) {
                int cost = distance[now] + n.getDistance();
                if(cost < distance[n.getIndex()]) {
                    distance[n.getIndex()] = cost;
                    pq.offer(new Node1(n.getIndex(), cost));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        c = sc.nextInt();

        for(int i=0; i<n+1; i++) {
            distance[i] = INF;
        }

        for(int i=0; i<n+1; i++) {
            graph.add(new ArrayList<Node1>());
        }

        for(int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            graph.get(x).add(new Node1(y,z));

        }
        dijkstra(c);

        int count = 0;
        int maxDistance = 0;

        for(int i=1; i<=n; i++) {
            if(distance[i] != INF) {
                count += 1;
                maxDistance = Math.max(maxDistance, distance[i]);
            }
        }

        System.out.println((count-1)+ " " + maxDistance);
    }

}
