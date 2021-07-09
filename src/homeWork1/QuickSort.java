package homeWork1;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] array = new int[]{12, 13, 24, 10, 3, 6, 90, 70};

        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] arr, int start, int end) {

        if (arr == null || arr.length == 0) {
            return;
        }

        if (start >= end) {
            return;
        }

        int middle = start + (end - start) / 2;
        int pivot = arr[middle];

        int i = start, j = end;
        while (i <= j) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if (start < j) {
            quickSort(arr, start, j);
        }
        if (end > i) {
            quickSort(arr, i, end);
        }
    }

    public static void swap(int[] array, int a, int b) {

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;

    }
}