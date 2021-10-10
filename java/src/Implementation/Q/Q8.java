package Implementation.Q;

import java.util.PriorityQueue;
import java.util.Scanner;

// 문자열 재정렬
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        PriorityQueue<Character> alpha = new PriorityQueue<Character>();

        for(int i=0; i<str.length(); i++) {
            int num = (str.charAt(i) - '0');
            if(0 <= num && num <= 9) {
                sum += num;
            } else {
                alpha.offer(str.charAt(i));
            }
        }

        while(!alpha.isEmpty()) {
            System.out.print(alpha.poll());
        }

        System.out.print(sum);


    }
}
