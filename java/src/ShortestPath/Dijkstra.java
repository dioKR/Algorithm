package ShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class N {
    private int index;
    private int distance;

    N(int index, int distance) {
        this.index = index;
        this.distance =  distance;
    }

    public int getDistance() {
        return distance;
    }

    public int getIndex() {
        return index;
    }
}

public class Dijkstra {
    public static final int INF = (int) 1e9;
    public static int n;
    public static int m;
    public static int start;
    public static ArrayList<ArrayList<N>> graph = new ArrayList<ArrayList<N>>();
    public static boolean[] visited;
    public static int[] distance;

    public static int get_smallest_node() {
        int min_value = INF;
        int index = 0;
        for(int i=1; i<n+1; i++) {
            if(distance[i] < min_value && !visited[i]) {
                min_value = distance[i];
                index = i;
            }
        }
        return index;
    }

    public static void dijkstra(int start) {
        distance[start] = 0;
        visited[start] = true;

        for(N n : graph.get(start)) {
            distance[n.getIndex()] = n.getDistance();
        }

        for(int i=0; i<n-1; i++) {
            int now = get_smallest_node();
            visited[now] = true;
            for(N j : graph.get(now)) {
                int cost = distance[now] + j.getDistance();
                if( cost < distance[j.getIndex()]) {
                    distance[j.getIndex()] = cost;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();
        visited = new boolean[n+1];
        distance = new int[n+1];
        Arrays.fill(distance, INF);

        for(int i=0; i<n+1; i++) {
            graph.add(new ArrayList<N>());
        }

        for(int i=0; i<m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
            graph.get(a).add(new N(b,c));
        }

        dijkstra(start);

        for(int i=1; i<n+1; i++) {
            if(distance[i]==INF) {
                System.out.println("INFINITY");
            } else {
                System.out.println(distance[i]);
            }
        }


    }
}
