package Implementation.BAEKJOON;

import java.util.Scanner;

class Person {
    private int weight;
    private int height;
    private int rank;

    Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}

public class BJ7568 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] p = new Person[n];

        for(int i=0; i<n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            p[i] = new Person(w,h);
        }

        for(int i=0; i<n; i++) {
            int rank = 1;
            for(int j=0; j<n; j++) {
                if(i==j) continue;
                if(p[i].getHeight() < p[j].getHeight() && p[i].getWeight() < p[j].getWeight()) rank++;
            }
            p[i].setRank(rank);
        }

        for(int i=0; i<n; i++) {
            System.out.print(p[i].getRank() + " ");
        }

    }
}
