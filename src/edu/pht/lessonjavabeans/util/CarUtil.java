package edu.pht.lessonjavabeans.util;

import edu.pht.lessonjavabeans.domain.Bumper;
import edu.pht.lessonjavabeans.domain.Car;
import edu.pht.lessonjavabeans.domain.Door;
import edu.pht.lessonjavabeans.domain.Engine;
import edu.pht.lessonjavabeans.domain.Wheel;
import edu.pht.lessonjavabeans.domain.Windshield;

import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;
import static edu.pht.lessonjavabeans.util.Constants.ID;
import static edu.pht.lessonjavabeans.util.Constants.PRODUCER;


public class CarUtil {
    public static double carPrice(Car car) {
        final int n = car.getWheels().length;
        return car.getEngine().getPrice() +
                car.getDoorsCount() * car.getDoor().getPrice() +
                car.getWheels()[n - 1].getPrice() * n +
                car.getBumper().getPrice() +
                car.getWindshield().getPrice();
    }

    public static String printProducerAndModel(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append("Producer: " + car.getProducer());
        sb.append(NEW_LINE);
        sb.append("Engine: ");
        sb.append(Engine.getEngineProducer());
        sb.append(NEW_LINE);
        sb.append("Door: ");
        sb.append(Door.getDoorProducer());
        sb.append(NEW_LINE);
        sb.append("Bumper: ");
        sb.append(Bumper.getBumperProducer());
        sb.append(NEW_LINE);
        sb.append("Wheel: ");
        sb.append(Wheel.getWheelProducer());
        sb.append(NEW_LINE);
        sb.append("Windshield: ");
        sb.append(Windshield.getWindshieldProducer());
        return sb.toString();
    }

    public static void carSort(String param, Car... cars) {
        int index;
        String attribute = "";
        switch (param.trim().toLowerCase().replaceAll("[\\s]", "")) {
            case "id":
                for (int i = 0; i < cars.length; i++) {
                    index = i;
                    for (int j = i; j < cars.length; j++) {
                        if (cars[index].getId() > cars[j].getId()) {
                            index = j;
                        }
                    }
                    Car temp = cars[index];
                    cars[index] = cars[i];
                    cars[i] = temp;
                }
                break;
            case "price":
                for (int i = 0; i < cars.length; i++) {
                    index = i;
                    for (int j = i; j < cars.length; j++) {
                        if (CarUtil.carPrice(cars[index]) > CarUtil.carPrice(cars[j])) {
                            index = j;
                        }
                    }
                    Car dest = cars[index];
                    cars[index] = cars[i];
                    cars[i] = dest;
                }
                break;
            case "color":
                for (int i = 0; i < cars.length; i++) {
                    index = i;
                    for (int j = 0; j < cars.length; j++) {
                        if (cars[index].getColor().compareTo(cars[j].getColor()) < 0) {
                            index = j;
                        }
                    }
                    Car temp = cars[index];
                    cars[index] = cars[i];
                    cars[i] = temp;
                }
                break;
            case "speed":
                for (int i = 0; i < cars.length; i++) {
                    index = i;
                    for (int j = i; j < cars.length; j++) {
                        if (cars[index].getSpeed() < (cars[j].getSpeed())) {
                            index = j;
                        }
                    }
                    Car temp = cars[index];
                    cars[index] = cars[i];
                    cars[i] = temp;
                }
                break;
            default:
                System.out.println(carPrint(cars));
        }
    }
    public static String carPrint(Car... cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(NEW_LINE);
            sb.append(ID + car.getId());
            sb.append(PRODUCER + car.getProducer());
            sb.append(", Speed: " + car.getSpeed());
            sb.append(", Color: " + car.getColor());
            sb.append(", General Price: " + carPrice(car));
        }
        return sb.toString();
    }
}

