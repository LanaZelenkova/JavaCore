package edu.pht.lessonjavabeans.beans;

import java.io.Serializable;

import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;

public class Engine extends Detail implements Serializable {

    private static String engineProducer;

    static {
        engineProducer = "General Motors Company";
    } //for example "Volkswagen Group", "Honda Motor Company"

    public Engine() {
    }

    public Engine(Long id, String model, double price) {
        super(id, model, price);
    }

    public static String getEngineProducer() {
        return engineProducer;
    }

    public static void setEngineProducer(String engineProducer) {
        Engine.engineProducer = engineProducer;
    }

    @Override
    public void handle() {
        System.out.println("Check cooling system");
    }

    @Override
    public void failTest() {
        System.out.println("It is quality-checked part: high-performance engine");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_LINE);
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(Engine.getEngineProducer());
        sb.append(super.toString());
        return sb.toString();
    }
}
