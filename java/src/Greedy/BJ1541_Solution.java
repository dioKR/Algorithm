package Greedy;

import java.util.Scanner;

public class BJ1541_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = Integer.MAX_VALUE;
        String[] subtraction = sc.nextLine().split("-");

        for (String value : subtraction) {
            int tmp = 0;
            String[] addition = value.split("\\+");

            for (String s : addition) {
                tmp += Integer.parseInt(s);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);
    }
}
