package Implementation.BAEKJOON;

import java.util.Scanner;

// 그룹 단어 체커
public class BJ1316 {

    public static boolean checker(String str) {
        boolean[] alpha = new boolean[26];
        char prev = str.charAt(0);
        for(int i=0; i<str.length(); i++) {
            char now = str.charAt(i);
            if(!alpha[now-'a']) {
                prev = now;
                alpha[now-'a'] = true;
            } else if (alpha[now-'a'] && prev != now) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;

        for(int i=0; i<n; i++) {
            String str = sc.next();
            if(checker(str)) {
                result++;
            }
        }

        System.out.println(result);
    }

}
