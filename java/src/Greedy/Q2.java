package Greedy;

import java.util.PriorityQueue;
import java.util.Scanner;

// 곱하기 혹은 더하기
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i) - '0';
            pq.offer(num);
        }

        int result = 0;
        while (!pq.isEmpty()) {
            int tmp = pq.poll();
            if(result == 0 || tmp == 0 || tmp == 1) {
                result += tmp;
            } else {
                result *= tmp;
            }
        }

        System.out.println(result);

    }
}
