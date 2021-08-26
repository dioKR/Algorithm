package SpanningTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    private int a;
    private int b;
    private int cost;

    Edge(int a, int b, int cost) {
        this.a = a;
        this.b = b;
        this.cost = cost;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public int compareTo(Edge o) {
        if(this.cost < o.cost) {
            return -1;
        }
        return 1;
    }
}

public class Kruskal {

    public static int v, e;
    public static int[] parent = new int[100000];
    public static ArrayList<Edge> edgs = new ArrayList<>();
    public static int result;

    public static int findParent(int x) {
        if(parent[x] == x) return x;
        return parent[x] = findParent(parent[x]);
    }

    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);

        if(a > b) {
            parent[a] = b;
        } else {
            parent[b] = a;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt(); e = sc.nextInt();


        for(int i=1; i<v+1; i++) {
            parent[i] = i;
        }

        for(int i=0; i<e; i++) {
            int a = sc.nextInt(); int b = sc.nextInt(); int cost = sc.nextInt();
            edgs.add(new Edge(a,b,cost));
        }

        Collections.sort(edgs);

        for(Edge e : edgs) {
            int a = e.getA();
            int b = e.getB();
            int cost = e.getCost();

            if(findParent(a) != findParent(b)) {
                unionParent(a,b);
                result += cost;
            }
        }

        System.out.println(result);
    }

}
