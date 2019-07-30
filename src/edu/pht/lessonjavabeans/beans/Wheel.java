package edu.pht.lessonjavabeans.beans;

import java.io.Serializable;

import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;

public class Wheel extends Detail implements Serializable {

    private static String wheelProducer;

    static {
        wheelProducer = "Borbet";
    } //for example "Enkei", "CM Wheels"

    public Wheel() {
    }

    public Wheel(Long id, String model, double price) {
        super(id, model, price);
    }

    public static String getWheelProducer() {
        return wheelProducer;
    }

    public static void setWheelProducer(String wheelProducer) {
        Wheel.wheelProducer = wheelProducer;
    }

    @Override
    public void handle() {
        System.out.println("Tire inflation");
    }

    @Override
    public void failTest() {
        System.out.println("It is quality-checked part: tire blowout free");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_LINE);
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(Wheel.getWheelProducer());
        sb.append(super.toString());
        return sb.toString();
    }
}
