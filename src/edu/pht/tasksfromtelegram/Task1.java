package edu.pht.tasksfromtelegram;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        Integer[] numbers = {44, 88, 9, -6, 0, -1, -101, -101, 44};
        String[] strings = {"qwerty", "abc", "pqr", "sqr", "sqr ", "", " ", "a", "ab", "abc", "abcd"};
        System.out.println("Before:");
        printArray(numbers);
        printArray(strings);
        sortArray(numbers);
        sortArray(strings);
        System.out.println("After:");
        printArray(numbers);
        printArray(strings);
    }

    private static void sortArray(String... array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1].compareToIgnoreCase(array[j]) > 0) {
                    String tempString = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tempString;
                }
            }
        }
    }
    private static void sortArray(Integer... array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    Integer tempInt = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tempInt;
                }
            }
        }
    }
    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}


