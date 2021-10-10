package Implementation.Q;

import java.util.Scanner;

//럭키 스트레이트
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int left = 0;
        int right = 0;

        String str = String.valueOf(N);

        for(int i=0; i<str.length()/2; i++) {
            left += (str.charAt(i) - '0');
        }

        for(int i=str.length()/2; i<str.length(); i++) {
            right += (str.charAt(i) - '0');
        }

        if(left == right) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }


    }
}
