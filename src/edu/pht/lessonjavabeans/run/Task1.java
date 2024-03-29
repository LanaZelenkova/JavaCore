package edu.pht.lessonjavabeans.run;

import static edu.pht.lessonjavabeans.util.Constants.GENERAL_PRICE;

import edu.pht.lessonjavabeans.domain.Bumper;
import edu.pht.lessonjavabeans.domain.Car;
import edu.pht.lessonjavabeans.domain.Door;
import edu.pht.lessonjavabeans.domain.Engine;
import edu.pht.lessonjavabeans.domain.Wheel;
import edu.pht.lessonjavabeans.domain.Windshield;
import edu.pht.lessonjavabeans.util.CarUtil;

public class Task1 {

    public static void main(String[] args) {
        Bumper bumper = new Bumper(14L, "1L-50", 50);
        Door door = new Door(25L, "2L-35", 35);
        Engine engine = new Engine(35L, "3L-570", 570);
        Wheel wheel = new Wheel(44L, "4L-20", 20);
        Windshield windshield = new Windshield(54L, "5L-320", 320);
        Car car = new Car(4L, "Toyota", 2019, 300, engine, door, bumper, wheel, windshield, 100);
        System.out.println(CarUtil.printProducerAndModel(car));
        System.out.println();
        System.out.println(GENERAL_PRICE + CarUtil.carPrice(car));
        System.out.println();
        Windshield windshield4 = new Windshield(55L, "5L-920", 920);
        //We change windshield
        car.changeDetail(windshield4);
        System.out.println(GENERAL_PRICE + CarUtil.carPrice(car));
    }
}
