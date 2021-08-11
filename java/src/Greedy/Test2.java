package Greedy;

import java.util.Scanner;
import java.util.Arrays;

public class Test2 {

    static int result = 0;
    static int n, m, k;
    static int[] numbs;

    /// MySolution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째줄에 n, m, k 입력 받기
        n = sc.nextInt(); m = sc.nextInt(); k = sc.nextInt();

        // n 개의 자연수 입력 받기
        numbs = new int[n];
        for(int i=0; i<n; i++) {
            numbs[i] = sc.nextInt();
        }

        // 입력받은 n개의 자연수 오름차순 정렬
        Arrays.sort(numbs);

        // m 번 더하기
        for(int i=0; i<m; i++) {
            // 가장 큰 수 더하기
            // k번째 마다 두번째로 큰수 더하기
            if(i!=0 && i%k==0) {
                result += numbs[n-2];
            } else {
                result += numbs[n-1];
            }
        }
        System.out.println(result);
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int m = sc.nextInt(); int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int firtst = arr[n-1];
        int second = arr[n-2];

        int cnt = (m/(k+1)) * k;
        cnt += m % (k+1);

        int result = 0;
        result += cnt * firtst;
        result += (m-cnt) * second;

        System.out.println(result);

    }
}
