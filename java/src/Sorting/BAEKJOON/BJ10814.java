package Sorting.BAEKJOON;


import java.util.*;

class Member implements Comparable<Member> {

    private int index;
    private int age;
    private String name;

    public Member(int index, int age, String name) {
        this.index = index;
        this.age = age;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Member o) {
        if(this.age < o.age) {
            return -1;
        } else if(this.age == o.age) {
            return this.index < o.index ? -1 : 1;
        } else {
            return 1;
        }
    }

}

public class BJ10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> arr = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int age = sc.nextInt();
            String str = sc.next();

            arr.add(new Member(i, age, str));

        }

        Collections.sort(arr);

        for(Member m : arr) {
            System.out.println(m.getAge() + " " + m.getName());
        }


    }
}
