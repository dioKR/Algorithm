package DFS.BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

// 트리의 부모 찾기
public class BJ11725 {

    static int N;
    static ArrayList<ArrayList<Integer>> map;
    static boolean[] visited;
    static int[] result;

    public static void DFS(int start) {
        visited[start] = true;

        for(int i=0; i<map.get(start).size(); i++) {
            if(!visited[map.get(start).get(i)]) {
                result[map.get(start).get(i)] = start;
                DFS(map.get(start).get(i));
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[N+1];
        result = new int[N+1];

        for(int i=0; i<=N; i++) {
            map.add(new ArrayList<Integer>());
        }

        for(int i=0; i<N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map.get(a).add(b);
            map.get(b).add(a);
        }

        DFS(1);
        for(int i=2; i<N+1; i++) {
            System.out.println(result[i]);
        }
    }
}
