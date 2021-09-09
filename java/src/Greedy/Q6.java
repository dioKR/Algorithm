package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
    private int index;
    private int time;

    Node(int index, int time) {
        this.index = index;
        this.time = time;
    }

    public int getIndex() {
        return index;
    }

    public int getTime() {
        return time;
    }

    @Override
    public int compareTo(Node o) {
        if (this.time > o.time) {
            return 1;
        }
        return -1;
    }
}

public class Q6 {

    public static int[] food_times = {8, 6, 4};
    public static int k = 15;


    public static int solution(int[] food_times, long k) {
        long summary = 0;
        for(int i=0; i< food_times.length; i++) {
            summary += food_times[i];
        }
        if(summary <= k) return -1;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for(int i=0; i< food_times.length; i++) {
            pq.offer(new Node(i+1, food_times[i]));
        }

        summary = 0;
        long prev = 0;
        long length = food_times.length;

        while (summary + ((pq.peek().getTime() - prev) * length) <= k) {
            int now = pq.poll().getTime();
            summary += (now - prev) * length;
            length -= 1;
            prev = now;
        }

        ArrayList<Node> result = new ArrayList<>();
        while(!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.sort(result, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.getIndex(), o2.getIndex());
            }
        });
        return result.get((int)((k-summary) % length)).getIndex();

    }

    public static void main(String[] args) {
        System.out.println(solution(food_times, k));
    }

}
