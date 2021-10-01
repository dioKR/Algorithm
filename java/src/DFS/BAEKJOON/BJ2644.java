package DFS.BAEKJOON;

import java.util.ArrayList;
import java.util.Scanner;

// 촌수 계산
public class BJ2644 {

    static int n, a, b, m;
    static ArrayList<ArrayList<Integer>> map;
    static boolean[] visited;
    static int result;


    public static void DFS(int start, int end, int cnt) {
        visited[start] = true;

        if(start == end) result = cnt;
        for(int i=0; i < map.get(start).size(); i++) {
            if(!visited[map.get(start).get(i)]) {
                cnt++;
                DFS(map.get(start).get(i), end, cnt);
                cnt--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        map = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n+1; i++) {
            map.add(new ArrayList<Integer>());
        }
        visited = new boolean[n+1];

        a = sc.nextInt(); b = sc.nextInt();
        m = sc.nextInt();

        for(int i=0; i<m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            map.get(x).add(y);
            map.get(y).add(x);
        }

        DFS(a,b,0);

        if(result == 0) System.out.println(-1);
        else System.out.println(result);



    }
}
