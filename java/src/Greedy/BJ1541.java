package Greedy;

// 그리디
// 잃어버린 괄호
// 실버2

import java.util.*;

public class BJ1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split("-");
        int result = 0;

        for(int i=0; i<strs.length; i++) {
            String[] tmp = strs[i].split("\\+");
            int num = 0;
            for (String s : tmp) {
                num += Integer.parseInt(s);
            }
            strs[i] = num + "";
        }

        for(int i=0; i<strs.length; i++) {
            if(i==0) {
                result += Integer.parseInt(strs[i]);
            } else {
                result -= Integer.parseInt(strs[i]);
            }
        }
        System.out.println(result);
    }
}
