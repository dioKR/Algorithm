package Implementation.BAEKJOON;

import java.util.Scanner;
import java.util.Stack;

// 괄호의 값
public class BJ2504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        int result = 0;
        int mul = 1;
        String str = sc.next();
        for(int i=0; i<str.length(); i++) {
          switch (str.charAt(i)) {
              case '(':
                  st.push('(');
                  mul *= 2;
                  break;
              case '[':
                  st.push('[');
                  mul *= 3;
                  break;
              case ')':
                  if(st.isEmpty() || st.peek() != '(') {
                      result = 0;
                      break;
                  }
                  if(str.charAt(i-1) == '(') result += mul;
                  st.pop();
                  mul /= 2;
                  break;
              case ']':
                  if(st.isEmpty() || st.peek() != '[') {
                      result = 0;
                      break;
                  }
                  if(str.charAt(i-1) == '[') result += mul;
                  st.pop();
                  mul /= 3;
                  break;
          }
        }
        System.out.println(!st.isEmpty() ? 0 : result);
    }
}
