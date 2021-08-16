package Sorting;

import java.util.Arrays;

// 이코테
// 삽입 정렬 소스코드
// Insertion Sort
public class Ex6_2 {
    static int[] arr = {7,5,9,0,3,1,6,2,4,8};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
