package Greedy.BAEKJOON;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

// 수 묶기
// 조건을 하나 더 생각해야함
// 0 * 음수일 경우 최대임
public class BJ1744 {

    public static int n;
    public static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pqPlus = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> pqMinus = new PriorityQueue<Integer>();

        n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            if(num > 0) {
                pqPlus.offer(num);
            } else {
                pqMinus.offer(num);
            }
        }

        while(pqPlus.size() >= 2) {
            int first = pqPlus.poll();
            int second = pqPlus.poll();

            if(first > 1 && second > 1) {
                result += first * second;
            } else {
                result += (first + second);
            }
        }

        if(!pqPlus.isEmpty()) {
            result += pqPlus.poll();
        }

        while (pqMinus.size() >= 2) {
            int first = pqMinus.poll();
            int second = pqMinus.poll();
            result += first * second;
        }

        if(!pqMinus.isEmpty()) {
            result += pqMinus.poll();
        }

        System.out.println(result);
    }
}
