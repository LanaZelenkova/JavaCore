package edu.pht.lessonjavastart;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int first = input(sc);
        int second = input(sc);
        if (first > second) {
            first += 3;
        } else {
            second += 8;
        }
        System.out.println(first + " " + second);
    }
    private static int input(Scanner sc) {
        int number;
        System.out.println("Enter a number: ");
        while (!sc.hasNextInt()) {
            System.out.println("This is not a number!");
            sc.next();
        }
        number = sc.nextInt();
        return number;
    }
}
