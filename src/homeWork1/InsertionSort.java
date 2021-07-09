package homeWork1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{12, 13, 24, 10, 3, 6, 90, 70};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

    }
}
