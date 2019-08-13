package edu.pht.lessonjavabeans.domain;

import java.io.Serializable;

import static edu.pht.lessonjavabeans.util.Constants.COLON;
import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;

public class Windshield extends Detail implements Serializable {

    private static String windshieldProducer;

    static {
        windshieldProducer = "Apex Auto Glass";
    }

    public Windshield() {
    }

    public Windshield(Long id, String model, double price) {
        super(id, model, price);
    }

    public static String getWindshieldProducer() {
        return windshieldProducer;
    }

    public static void setWindshieldProducer(String windshieldProducer) {
        Windshield.windshieldProducer = windshieldProducer;
    }

    @Override
    public void handle() {
        System.out.println("Windshield cleaning");
    }

    @Override
    public void failTest() {
        System.out.println("It is quality-checked part: windshield without scratches");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_LINE);
        sb.append(getClass().getSimpleName());
        sb.append(COLON);
        sb.append(Windshield.getWindshieldProducer());
        sb.append(super.toString());
        return sb.toString();
    }
}
