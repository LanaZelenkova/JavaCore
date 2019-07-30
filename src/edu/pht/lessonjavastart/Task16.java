package edu.pht.lessonjavastart;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Min: ");
        int min = input(sc);
        System.out.println("Max: ");
        int max = input(sc);
        System.out.println("Step: ");
        int step = input(sc);
        StringBuilder sb = new StringBuilder();
        for (int i = min; i <= max; i += step) {
            sb.append(i + " ");
        }
        System.out.println(sb.toString());
    }
    private static int input(Scanner sc) {
        int number;
        while (!sc.hasNextInt()) {
            System.out.println("This is not a number!");
            sc.next();
        }
        number = sc.nextInt();
        return number;
    }
}
