package ShortestPath.BAEKJOON;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 특정 거리의 도시 찾기
// 답안을 보고 작성했음 -> 다시 풀어봐야함
public class BJ18352 {

    static int N, M, K, X;
    static Vector<Integer>[] arr;
    static int[] distance;
    static final int INF = (int)1e9;

    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        K = Integer.parseInt(str[2]);
        X = Integer.parseInt(str[3]);

        arr = new Vector[N+1];
        for(int i=0; i<=N; i++) {
            arr[i] = new Vector<>();
        }

        distance = new int[N+1];
        Arrays.fill(distance, INF);


        for(int i=0; i<M; i++) {
            str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            arr[A].add(B);
        }

        dijkstra();

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            if(distance[i] == K) {
                list.add(i);
            }
        }

        if(list.size() == 0) {
            bw.write(-1 + "\n");
        }
        else {
            for(int n: list) {
                bw.write(n + "\n");
            }
        }
        bw.flush();

    }

    public static void dijkstra() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        distance[X] = 0;
        pq.offer(X);

        while(!pq.isEmpty()) {
            int n = pq.poll();
            for(int m: arr[n]) {
                if(distance[m] > distance[n]+1) {
                    distance[m] = distance[n] + 1;
                    pq.offer(m);
                }
            }
        }
    }


}
