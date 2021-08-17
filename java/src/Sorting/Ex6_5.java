package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Fruit implements Comparable<Fruit> {
    private String name;
    private int score;

    public Fruit(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public int compareTo(Fruit other) {
        if(this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class Ex6_5 {
    static int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("<------------------->");
        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit("바나나", 2));
        fruits.add(new Fruit("사과", 5));
        fruits.add(new Fruit("당근", 3));

        Collections.sort(fruits);

        for (Fruit fruit : fruits) {
            System.out.print("(" + fruit.getName() + "," + fruit.getScore() + ")");
        }

    }
}
