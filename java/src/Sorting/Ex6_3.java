package Sorting;
import java.util.Arrays;
// 이코테
// 퀵정렬 소스코드
// 퀵정렬 : 기준을 설정하고 기준으로부터 큰 값과 작은 값의 위치를 바꾸자.
// Quick Sort
public class Ex6_3 {
    static int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void QuickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[left] <= arr[pivot]) left++;
            while (right > start && arr[right] >= arr[pivot]) right--;
            if (left > right) {
                int tmp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = tmp;
            } else {
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
        QuickSort(arr, start, right - 1);
        QuickSort(arr, right + 1, end);
    }

}
