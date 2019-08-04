package edu.pht.tasksfromtelegram;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 10, 11, 12, 12};
        print(array);
        print(removeDuplicates(array));
    }
    private static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    private static int[] removeDuplicates(int[] array) {
        int count = 0;
        int len = array.length;
        int n = len;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && array[i] == array[j]) {
                    count++;
                    for (int k = j; k < n - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    n--;
                }
            }
        }
        return Arrays.copyOfRange(array, 0, len-count);
    }
}
