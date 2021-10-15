package Sorting.BAEKJOON;

import java.util.*;

// 단어 정렬
public class BJ1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        sc.nextLine();

        for(int i=0; i<n; i++) {
            str[i] = sc.nextLine();
        }

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(str[0]);
        for(int i=1; i< n; i++) {
            if(!str[i].equals(str[i-1])) {
                System.out.println(str[i]);
            }
        }

    }
}
