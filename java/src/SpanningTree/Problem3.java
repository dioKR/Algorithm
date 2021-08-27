package SpanningTree;

// 도시분할계획

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class VillageEdge implements Comparable<VillageEdge>{

    private int a;
    private int b;
    private int cost;

    VillageEdge(int a, int b, int cost) {
        this.a = a;
        this.b = b;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

    @Override
    public int compareTo(VillageEdge o) {
        if(this.cost < o.cost) {
            return -1;
        }
        return 1;
    }

}

public class Problem3 {

    public static int n, m;
    public static ArrayList<VillageEdge> edges = new ArrayList<>();
    public static int[] parent = new int[100001];
    public static int result;
    public static int last;

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
        n = sc.nextInt(); m = sc.nextInt();

        for(int i=1; i<n+1; i++) {
            parent[i] = i;
        }

        for(int i=0; i<m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt(); int cost = sc.nextInt();
            edges.add(new VillageEdge(a,b,cost));
        }

        Collections.sort(edges);

        for(VillageEdge e : edges) {
            int a = e.getA();
            int b = e.getB();
            int cost = e.getCost();

            if(findParent(a) != findParent(b)) {
                unionParent(a,b);
                result += cost;
                last = cost;
            }
        }

        System.out.println(result - last);

    }

}
