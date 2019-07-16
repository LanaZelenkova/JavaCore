package edu.htp.tasksfromtelegram;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter array size as positive integer: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a number!");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        String[] array = new String[n];
        fill(array);
        print(array);
        getDuplicates(array);
    }
    private static void fill(String[] array) {
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ++max) + " this is a string";
        }
    }
    private static void print(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("\n");
    }
    private static void getDuplicates(String[] array) {
        boolean isDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].equalsIgnoreCase(array[j])) {
                    System.out.println("Duplicate is \"" + array[j] + "\" with index " + j);
                    isDuplicates = true;
                }
            }
        }
        if (!isDuplicates) {
            System.out.println("Not found!");
        }
    }
}
