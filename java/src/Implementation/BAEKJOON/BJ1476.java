package Implementation.BAEKJOON;

import java.util.Scanner;
public class BJ1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E=1, S=1, M=1;

        int e = sc.nextInt(); // 1~15
        int s = sc.nextInt(); // 1~28
        int m = sc.nextInt(); // 1~19

        int result = 1;

        while(true) {

            if(e==E && s==S && m==M) {
                System.out.println(result);
                break;
            }

            E+=1;
            S+=1;
            M+=1;
            if(E==16) {
                E=1;
            }
            if(S==29) {
                S=1;
            }
            if(M==20) {
                M=1;
            }

            result++;
        }

    }
}
