package edu.pht.lessonjavabeans.run;

import edu.pht.lessonjavabeans.domain.Bumper;
import edu.pht.lessonjavabeans.domain.Car;
import edu.pht.lessonjavabeans.domain.Door;
import edu.pht.lessonjavabeans.domain.Engine;
import edu.pht.lessonjavabeans.domain.Wheel;
import edu.pht.lessonjavabeans.domain.Windshield;
import edu.pht.lessonjavabeans.util.CarUtil;
import edu.pht.lessonjavabeans.domain.Color;

import java.util.Scanner;

public class DemoCar {
    public static void main(String[] args) {
        Bumper bumper = new Bumper(11L, "1L-50", 50);
        Door door = new Door(21L, "2L-35", 35);
        Engine engine = new Engine(31L, "3L-570", 570);
        Wheel wheel = new Wheel(41L, "4L-20", 20);
        Windshield windshield = new Windshield(51L, "5L-320", 320);
        Car car = new Car(1L, "Toyota", 2019, 300, engine, door, bumper, wheel, windshield, 100);
        System.out.println(car.toString());
        System.out.println("General price = " + CarUtil.carPrice(car));
        System.out.println("\n");

        //We can change door1 or engine1
        Door door1 = new Door(22L, "2L-45", 45);
        Engine engine1 = new Engine(32L, "3L-999", 999);
        //We change engine1
        car.changeDetail(engine1);
        //We change color
        car.setColor(Color.RED);
        //car and general price after changing
        System.out.println(car.toString());
        System.out.println("General price = " + CarUtil.carPrice(car));
        System.out.println("\n");

        //We create array of cars
        Car[] cars = new Car[4];
        cars[0] = car;
        Bumper bumper2 = new Bumper(12L, "1L-60", 60);
        Door door2 = new Door(23L, "2L-45", 45);
        Engine engine2 = new Engine(33L, "3L-670", 670);
        Wheel wheel2 = new Wheel(42L, "4L-50", 50);
        Windshield windshield2 = new Windshield(52L, "5L-420", 420);
        Car car2 = new Car(77L, "BMW", 2020, 400, engine2, door2, bumper2, wheel2, windshield2, 200);
        cars[1] = car2;
        Bumper bumper3 = new Bumper(13L, "1L-160", 160);
        Door door3 = new Door(24L, "2L-55", 55);
        Engine engine3 = new Engine(34L, "3L-1070", 1070);
        Wheel wheel3 = new Wheel(43L, "4L-150", 150);
        Windshield windshield3 = new Windshield(53L, "5L-920", 920);
        Car car3 = new Car(70L, "BMW", 2020, 500, engine3, door3, bumper3, wheel3, windshield3, 200);
        car3.setColor(Color.WHITE);
        cars[2] = car3;
        cars[3] = car3;
        String answer = "y";
        do {
            //params: "id", "price", "color", "speed"
            System.out.println("\nEnter parameter for sorting: \nid or price or color or speed");
            Scanner sc = new Scanner(System.in);
            String param = sc.nextLine();
            CarUtil.carSort(param, cars);
            System.out.println("\nAfter sorting: ");
            System.out.println(CarUtil.carPrint(cars));
            System.out.println("\nTry again? y/n");
            answer = sc.nextLine().trim().replaceAll("\\s", "").toLowerCase();
        } while(!answer.equals("n"));
    }
}
