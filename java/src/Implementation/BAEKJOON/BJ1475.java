package Implementation.BAEKJOON;

import java.util.Arrays;
import java.util.Scanner;

public class BJ1475 {
    public static void main(String[] args) {

        int[] checked = new int[10];

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i) - '0';
            if(num == 9) num = 6;
            checked[num]++;
        }

        if(checked[6] != 0) {
            checked[6] = Math.round(checked[6]/2.0f);
        }

        Arrays.sort(checked);
        System.out.print(checked[checked.length-1]);


    }
}
