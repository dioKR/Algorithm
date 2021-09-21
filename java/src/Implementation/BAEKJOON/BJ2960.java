package Implementation.BAEKJOON;

import java.util.Scanner;

public class BJ2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        boolean[] checked = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (!checked[i]) {
                int j = 1;
                while (true) {
                    int tmp = i * j;
                    if (tmp > n) {
                        break;
                    }
                    if (!checked[tmp]) {
                        cnt++;
                        checked[tmp] = true;
                    }
                    if (cnt == k) {
                        System.out.println(tmp);
                        break;
                    }
                    j++;
                }
            }
        }
    }
}
