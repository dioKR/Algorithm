package Sorting;

import java.util.Arrays;

// 이코테
// 계수정렬
// Count Sort
public class Ex6_4 {

    static int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
    static int MAX_VALUE = 9;

    public static void main(String[] args) {
        int[] count = new int[MAX_VALUE+1];

        for (int k : arr) {
            count[k] += 1;
        }

        System.out.println(Arrays.toString(count));

        for(int i=0; i<=MAX_VALUE; i++) {
            for(int j=0; j<count[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
