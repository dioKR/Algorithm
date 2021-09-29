package DFS.BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

// 이분 그래프
// DFS이용한 풀이
// BFS로도 풀어봐야 할 것
public class BJ1707 {

    static int K, V, E;
    static final int BLACK = 1;
    static final int RED = -1;
    static ArrayList<ArrayList<Integer>> map;
    static int[] colors;
    static boolean check;

    public static void DFS(int start, int color) {
        colors[start] = color;

        for (int i = 0; i < map.get(start).size(); i++) {
            if (colors[map.get(start).get(i)] == color) {
                check = false;
                return;
            }
            if (colors[map.get(start).get(i)] == 0) {
                DFS(map.get(start).get(i), -color);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        K = sc.nextInt();

        for (int k = 0; k < K; k++) {
            V = sc.nextInt();
            E = sc.nextInt();

            map = new ArrayList<ArrayList<Integer>>();
            colors = new int[V + 1];
            check = true;

            for (int i = 0; i < V + 1; i++) {
                map.add(new ArrayList<Integer>());
            }

            for (int i = 0; i < E; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                map.get(a).add(b);
                map.get(b).add(a);
            }

            for (int i = 1; i < V + 1; i++) {
                if (!check) break;
                if (colors[i] == 0) DFS(i, BLACK);
            }

            System.out.println(check ? "YES" : "NO");
        }
    }
}
