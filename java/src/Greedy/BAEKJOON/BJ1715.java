package Greedy.BAEKJOON;

import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ1715 {

    public static int n;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        PriorityQueue<Long> pq = new PriorityQueue<Long>();

        for(int i=0; i<n; i++) {
            pq.offer(sc.nextLong());
        }

        long sum = 0;
        while (pq.size() > 1) {
            long tmp1 = pq.poll();
            long tmp2 = pq.poll();

            sum += (tmp1 + tmp2);
            pq.offer(tmp1 + tmp2);

        }
        System.out.println(sum);

    }
}
