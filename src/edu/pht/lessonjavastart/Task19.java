package edu.pht.lessonjavastart;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        String answer = "y";
        do {
            int days = input();
            System.out.println(days + " days equal ");
            System.out.println(calculateHoursMinutesAndSeconds(days));
            System.out.println("\nTry again? y/n");
            Scanner sc = new Scanner(System.in);
            answer = sc.nextLine().trim().replaceAll("\\s", "").toLowerCase();
        } while(!answer.equals("n"));
    }
    private static int input() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("\nEnter the number of days (as positive integer) to count hours, minutes and seconds: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a number!");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    private static String calculateHoursMinutesAndSeconds(int days) {
        final int numberOfHours = 24;
        final int numberOfMinutes = 60;
        int hours = days * numberOfHours;
        int minutes = hours * numberOfMinutes;
        int seconds = minutes * numberOfMinutes;
        String result = "";
        result += hours + " hours or ";
        result += minutes + " minutes or ";
        result += seconds + " seconds";
        return result;
    }
}
