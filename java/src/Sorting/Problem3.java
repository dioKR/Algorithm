package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student>{

    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Student other) {
        if(this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] tmp = str.split(" ");
            students.add(new Student(tmp[0], Integer.parseInt(tmp[1])));
        }

        Collections.sort(students);

        for(Student student : students) {
            System.out.print(student.getName() + " ");
        }

    }
}
