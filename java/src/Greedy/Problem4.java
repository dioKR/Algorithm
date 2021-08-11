package Greedy;

import java.util.Scanner;

// 1이 될 때까지
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        while (n != 1) {
            if (n % m == 0) {
                n /= m;
                result += 1;
            } else {
                n -= 1;
                result += 1;
            }
        }

        System.out.println(result);

    }
}

class P4_Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while(true) {
            int target = (n / k) * k;
            result += (n-target);
            n = target;

            if(n < k) break;

            result += 1;
            n /= k;
        }

        result += (n-1);
        System.out.println(result);

    }
}
