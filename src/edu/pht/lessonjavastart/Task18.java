package edu.pht.lessonjavastart;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        System.out.println("Enter your money to exchange: ");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double rate = 2.22;
        System.out.println("Rate is " + rate);
        System.out.printf("Result is %.2f", exchangeCurrency(money, rate));
    }
    private static double exchangeCurrency(double rub, double rate) {
        double result = rub / rate;
        return  result;
    }
}
