package Implementation.BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    private int value;
    private int index;

    Node (int value , int index) {
        this.value = value;
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public int getIndex() {
        return index;
    }
}

// 프린터 큐
public class BJ1966 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = 1;
            boolean flag = false;
            Queue<Node> q = new LinkedList<Node>();


            for (int j = 0; j < n; j++) {
                q.offer(new Node(sc.nextInt(), j));
            }

            // 로직 시작
            while (!q.isEmpty()) {
                Node cur = q.poll();

                if(q.isEmpty()) flag = true;
                for(Node j: q) {
                    if(cur.getValue() < j.getValue()) {
                        q.offer(cur);
                        flag = false;
                        break;
                    };
                    flag = true;
                }

                if(flag && cur.getIndex() == m) {
                    System.out.println(result);
                    break;
                } else if(flag && cur.getIndex() != m) {
                    result++;
                }




            }

        }

    }
}
