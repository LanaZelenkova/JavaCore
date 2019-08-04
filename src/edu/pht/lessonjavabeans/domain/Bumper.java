package edu.pht.lessonjavabeans.domain;

import java.io.Serializable;

import static edu.pht.lessonjavabeans.util.Constants.COLON;
import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;

public class Bumper extends Detail implements Serializable {

    private static String bumperProducer;

    static {
        bumperProducer = "Safeway";
    }

    public Bumper() {
    }

    public Bumper(Long id, String model, double price) {
        super(id, model, price);
    }

    public static String getBumperProducer() {
        return bumperProducer;
    }

    public static void setBumperProducer(String bumperProducer) {
        Bumper.bumperProducer = bumperProducer;
    }

    @Override
    public void handle() {
        System.out.println("Bumper fixation");
    }

    @Override
    public void failTest() {
        System.out.println("It is quality-checked stationary part");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_LINE);
        sb.append(getClass().getSimpleName());
        sb.append(COLON);
        sb.append(Bumper.getBumperProducer());
        sb.append(super.toString());
        return sb.toString();
    }
}
