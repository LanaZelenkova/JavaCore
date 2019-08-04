package edu.pht.lessonjavabeans.domain;

import java.io.Serializable;

import static edu.pht.lessonjavabeans.util.Constants.COLON;
import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;

public class Door extends Detail implements Serializable {

    private static String doorProducer;

    static {
        doorProducer = "Supreme Motors";
    }

    public Door() {
    }

    public Door(Long id, String model, double price) {
        super(id, model, price);
    }

    public static String getDoorProducer() {
        return doorProducer;
    }

    public static void setDoorProducer(String doorProducer) {
        Door.doorProducer = doorProducer;
    }

    @Override
    public void handle() {
        System.out.println("Oil lubrication");
    }

    @Override
    public void failTest() {
        System.out.println("It is quality-checked part: door mechanism is working");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_LINE);
        sb.append(getClass().getSimpleName());
        sb.append(COLON);
        sb.append(Door.getDoorProducer());
        sb.append(super.toString());
        return sb.toString();
    }
}
