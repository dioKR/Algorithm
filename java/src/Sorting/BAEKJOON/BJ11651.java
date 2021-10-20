package Sorting.BAEKJOON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Coordi implements Comparable<Coordi> {

    private int x;
    private int y;

    public Coordi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int compareTo(Coordi o) {
        if(this.y < o.y) {
            return -1;
        } else if(this.y == o.y) {
            if(this.x < o.x) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}

// 좌표 정렬하기2
public class BJ11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Coordi> arr = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new Coordi(x,y));
        }

        Collections.sort(arr);

        for(Coordi c : arr) {
            System.out.println(c.getX() + " " + c.getY());
        }



    }
}
