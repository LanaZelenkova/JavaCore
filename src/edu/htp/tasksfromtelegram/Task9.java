package edu.htp.tasksfromtelegram;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int position;
        int value;
        String answer;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a position: ");
            position = sc.nextInt();
            System.out.println("Enter a value: ");
            value = sc.nextInt();
            System.out.println(Arrays.toString(insert(array, position, value)));
            System.out.println("Do you want to continue? y/n");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        } while (!answer.trim().toLowerCase().equals("n"));
    }
    private static int[] insert(int[] array, int position, int value) {
        int n = array.length + 1;
        int[] result = new int[n];
        for (int i = 0; i < position - 1; i++) {
            result[i] = array[i];
        }
        result[position - 1] = value;
        for (int i = position; i < n; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }
}
