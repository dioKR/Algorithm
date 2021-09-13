package Implementation.BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

// 제로
public class BJ10773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int result = 0;

        int k = sc.nextInt();

        for(int i=0; i<k; i++) {
            int n = sc.nextInt();
            if(n == 0) {
                st.pop();
            } else {
                st.push(n);
            }
        }

        while(!st.isEmpty()) {
            result += st.pop();
        }

        System.out.println(result);

    }
}
