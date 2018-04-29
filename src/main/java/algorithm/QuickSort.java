package algorithm;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class QuickSort {
    public static void main(String[] args) {
        sortAndPrint(new int[]{3, 1, 10, -5, 7, 2, 17, 14, -3});
        sortAndPrint(new int[]{4, 1, 6, 2, 5, 2});
        sortAndPrint(new int[]{6, 6, 6, 6, 6, 1, 6, 6, 6, 7, 5});
        sortAndPrint(new int[]{9, -3, -7, 2, 1, 2, -2, 1, 2});
        sortAndPrint(new int[]{-10, 2, -7, 2, 1, 3, -9, 3, 2, 10});
    }

    private static void sortAndPrint(int[] arr) {
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(joining(", ")));
    }

    private static void sort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }

        int pivot = arr[startIdx];
        int left = startIdx + 1;
        int right = endIdx;
        while (left <= right) {
            if (arr[left] <= pivot) {
                left++;
            }

            if (pivot <= arr[right]) {
                right--;
            }

            if (left <= right) {
                changeValue(arr, left, right);
            }
        }

        if (pivot > arr[right]) {
            changeValue(arr, startIdx, right);
        }
        sort(arr, startIdx, right - 1);
        sort(arr, right + 1, endIdx);
    }

    private static void changeValue(int[] arr, int target1, int target2) {
        int temp = arr[target1];
        arr[target1] = arr[target2];
        arr[target2] = temp;
    }
}
