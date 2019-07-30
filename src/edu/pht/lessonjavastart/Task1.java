package edu.pht.lessonjavastart;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your mass of a body, please");
        Scanner sc = new Scanner(System.in);
        double mass = sc.nextDouble();
        System.out.printf("Your weight is %4f %s", calculateWeightOnMoon(mass), " newtons, N");

    }
    private static double calculateWeightOnMoon(double mass) {
        final double speed = 1.622;
        return mass * speed;
    }
}
