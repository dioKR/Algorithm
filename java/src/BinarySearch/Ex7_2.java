package BinarySearch;


import java.util.Scanner;

// 재귀 함수로 구현한 이진 탐색 소스코드
public class Ex7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = binary_search(arr, target, 0, n-1);
        if(result == -1) System.out.println("원소가 존재하지 않습니다.");
        else System.out.println(result+1);

    }

    public static int binary_search(int[] arr, int target, int start, int end) {
        if(start > end) return -1;
        int mid = (start + end) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] >target) {
            return binary_search(arr, target, start, mid-1);
        }
        else {
            return binary_search(arr, target, mid+1, end);
        }
    }

}
