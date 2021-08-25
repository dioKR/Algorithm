package DisjointSets;

import java.util.Scanner;

// 경로 압축 기법 소스코드를 이용한
// 서로소 집합 알고리즘 소스코드
public class Ex10_2 {

    public static int v, e;
    public static int[] parent = new int[10001];

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
            int a = sc.nextInt(); int b = sc.nextInt();
            unionParent(a, b);
        }

        System.out.print("각 원소가 속한 집합 : ");
        for(int i=1; i<v+1; i++) {
            System.out.print(findParent(i) + " ");
        }
        System.out.println();

        System.out.print("부모 테이블 : ");
        for(int i=1; i<v+1; i++) {
            System.out.print(parent[i] + " ");
        }
        System.out.println();


    }

}
