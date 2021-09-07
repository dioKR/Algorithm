package Greedy;

import java.util.Scanner;

// 만들 수 없는 금액
public class Q4 {
    public static boolean[] check = new boolean[987654321];
    public static int n;
    public static int[] nums;
    public static boolean[] visited = new boolean[987654321];

    public static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if(r == 0) {
            check(arr, visited, n);
            return;
        }

        for(int i=start; i<n; i++) {
            visited[i] = true;
            combination(arr, visited, i+1, n, r-1);
            visited[i] = false;
        }
    }

    public static void check(int[] arr, boolean[] visited, int n) {
        int sum = 0;
        for(int i=0 ;i<n; i++) {
            if(visited[i]) {
                sum += arr[i];
            }
        }
        check[sum] = true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums = new int[n];
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i=1; i<=n; i++) {
            combination(nums, visited, 0, n, i);
        }

        for(int i=1; i<=987654321; i++) {
            if(!check[i]) {
                System.out.println(i);
                break;
            }
        }


    }
}
