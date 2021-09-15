package Implementation.BAEKJOON;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 요세푸스 문제 0
public class BJ11866 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<Integer>();

        int n = sc.nextInt();
        int k = sc.nextInt();


        for(int i=1; i<=n; i++) {
            q.offer(i);
        }

        int cnt = 1;
        System.out.print("<");
        while(!q.isEmpty()) {
            int num = q.poll();
            if(cnt == k) {
                System.out.print(num);
                if(!q.isEmpty()) System.out.print(", ");
                cnt = 1;
                continue;
            } else {
                q.offer(num);
            }
            cnt++;
        }
        System.out.print(">");


    }
}
