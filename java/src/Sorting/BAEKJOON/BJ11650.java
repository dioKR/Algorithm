package Sorting.BAEKJOON;

import java.util.*;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

// 좌표 정렬하기
public class BJ11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Node> arr = new ArrayList<Node>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new Node(x,y));
        }

        Collections.sort(arr, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.getX() == o2.getX()) {
                    return o1.getY() - o2.getY();
                }
                else {
                    return o1.getX() - o2.getX();
                }
            }
        });

        for(Node a : arr) {

            System.out.println(a.getX() + " " + a.getY());

        }


    }
}
