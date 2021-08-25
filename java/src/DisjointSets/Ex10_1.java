package DisjointSets;

import java.util.Scanner;

public class Ex10_1 {

    public static int[] parent = new int[10000];
    public static int v,e;


    public static int find_parent(int x) {
        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
        if(parent[x] == x) return x;
        return find_parent(parent[x]);
    }

    public static void union_parent(int a, int b) {
        a = find_parent(a);
        b = find_parent(b);

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

        for(int i=1; i<e+1; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            union_parent(a, b);
        }

        System.out.print("각 원소가 속한 집합 : ");
        for(int i=1; i<v+1; i++) {
            System.out.print(find_parent(i) + " ");
        }
        System.out.println();

        System.out.print("부모 테이블 : ");
        for(int i=1; i<v+1; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();

    }


}
