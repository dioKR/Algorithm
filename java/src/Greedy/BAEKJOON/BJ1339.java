package Greedy.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1339 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];
        int[] alpha = new int[26];


        for(int i=0; i<n; i++) {
            words[i] = sc.next();
        }

        for(int i=0; i<n; i++) {
            int tmp = (int)Math.pow(10,words[i].length()-1);
            for(int j=0; j<words[i].length(); j++) {
                alpha[(int)words[i].charAt(j)-65] += tmp;
                tmp /= 10;
            }
        }

        Arrays.sort(alpha);
        for(int i=0; i<26; i++) {
            System.out.println(alpha[i]);
        }

        int index = 9;
        int sum = 0;
        for(int i=alpha.length-1; i>=0; i--) {
            if(alpha[i] == 0) break;

            sum += alpha[i] * index;
            index--;
        }
        System.out.println(sum);
    }
}
