package Sorting;

import java.util.Arrays;

// 이코테
// 선택정렬 소스코드
// Selection sort
public class Ex6_1 {
    static int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        Selection_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void Selection_Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min_index] > arr[j]) min_index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index]= tmp;
        }
    }
}
