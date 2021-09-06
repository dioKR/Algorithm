package Greedy.BAEKJOON;

import java.util.Scanner;

// 문서검색
public class BJ1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String target = sc.nextLine();
        int result = 0;
        boolean flag;


        for (int i = 0; i <= doc.length() - target.length(); i++) {
            if (doc.charAt(i) == target.charAt(0)) {
                flag = true;
                for (int j = 1; j < target.length(); j++) {
                    if (doc.charAt(i + j) != target.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    flag = false;
                    i = i + (target.length() - 1);
                    result++;
                }
            }
        }

        System.out.println(result);


    }
}
