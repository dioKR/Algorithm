package DFS.BAEKJOON;

import java.io.*;
import java.util.*;

// 효율적인 해킹
// 인풋아웃풋 스트림 공부해야할듯
public class BJ1325 {

    static int N, M;
    static int[] computer;

    public static void DFS(int start, boolean[] visited, ArrayList<Integer>[] list) {
        visited[start] = true;
        for(int node: list[start]) {
            if(!visited[node]) {
                computer[node]++;
                DFS(node, visited, list);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] list = new ArrayList[N+1];
        for(int i=0; i<N+1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
        }

        computer = new int[N+1];
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < N + 1; i++) {
            boolean[] visited = new boolean[N+1];
            DFS(i, visited, list);
        }


        for(int i=1; i<N+1; i++) {
            max = Math.max(max, computer[i]);
        }

        for(int i=1; i<N+1; i++) {
            if(computer[i] == max) bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }

}
