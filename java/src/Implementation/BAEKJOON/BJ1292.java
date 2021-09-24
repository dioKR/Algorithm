package Implementation.BAEKJOON;
import java.util.Scanner;

// 쉽게 푸는 문제
public class BJ1292 {

    public static int[] arr = new int[1001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        int tmp = 1 , cnt = 0;

        for(int i=1; i<1001; i++) {
            arr[i] = tmp;
            cnt++;
            if(cnt == tmp) {
                tmp++;
                cnt = 0;
            }

        }

        for(int i = a; i<=b; i++) {
            result += arr[i];
        }

        System.out.println(result);


    }
}
