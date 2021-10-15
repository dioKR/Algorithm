package Sorting.BAEKJOON;

import java.util.Scanner;

// 소트인사이드
public class BJ1427 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] num = new int[str.length()];

        for(int i=0; i<str.length(); i++) {
            num[i] = str.charAt(i) - '0';
        }

        for(int i=0; i<str.length()-1; i++) {
            int index= i;
            for(int j=i+1; j<str.length(); j++) {
                if(num[j] > num[index]) {
                    index = j;
                }
            }

            int tmp = num[i];
            num[i] = num[index];
            num[index] = tmp;

        }

        for (int j : num) {
            System.out.print(j);
        }

    }
}
