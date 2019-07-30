package edu.pht.lessonjavabeans.beans;

import java.io.Serializable;
import java.util.Objects;

public class Car extends Vehicle implements Serializable {

    private final int doorsCount;

    private Engine engine;
    private Door door;
    private Bumper bumper;
    private Wheel wheel;
    private Windshield windshield;
    private int fuelTank;
    private int fuelConsumption;
    private boolean blocking = false;
    private Color color;

    public Car() {
        doorsCount = 4;
        color = Color.BLACK;
    }

    public Car(Long id, String producer, int modelYear, double speed, Engine engine, Door door, Bumper bumper, Wheel wheel, Windshield windshield, int fuelTank) {
        super(id, producer, modelYear, speed);
        this.doorsCount = 4;
        color = Color.BLACK;
        this.engine = engine;
        this.door = door;
        this.bumper = bumper;
        this.wheel = wheel;
        this.windshield = windshield;
        this.fuelTank = fuelTank;
    }

    public Car(Long id, String producer, int modelYear, double speed, int doorsCount, Engine engine, Door door, Bumper bumper, Wheel wheel, Windshield windshield, int fuelTank, Color color) {
        super(id, producer, modelYear, speed);
        this.doorsCount = doorsCount;
        this.engine = engine;
        this.door = door;
        this.bumper = bumper;
        this.wheel = wheel;
        this.windshield = windshield;
        this.fuelTank = fuelTank;
        this.color = color;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Bumper getBumper() {
        return bumper;
    }

    public void setBumper(Bumper bumper) {
        this.bumper = bumper;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Windshield getWindshield() {
        return windshield;
    }

    public void setWindshield(Windshield windshield) {
        this.windshield = windshield;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeDetail(Detail detail) {

        switch (detail.getClass().getSimpleName()) {
            case "Engine":
                this.setEngine((Engine)detail);
                break;
            case "Door":
                this.setDoor((Door)detail);
                break;
            case "Bumper":
                this.setBumper((Bumper)detail);
                break;
            case "Wheel":
                this.setWheel((Wheel)detail);
                break;
            case "Windshield":
                this.setWindshield((Windshield)detail);
                break;
                default:
                    System.out.println("Your car is perfect. We do not change anything!");
        }
    }

    public void fuelFill(double value) {
        fuelTank += value;
    }

    @Override
    public void block() {
        setBlocking(true);
    }

    @Override
    public void unblock() {
        setBlocking(false);
    }

    @Override
    public void drive() {
        int count = 0;
        while (fuelTank - fuelConsumption >= 0) {
            fuelTank -= fuelConsumption;
            count++;
        }
        System.out.println("Distance is " + 100 * count);
    }

    public void drive(double distance) {
        fuelTank -= distance / 100 * fuelConsumption;
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return doorsCount == car.doorsCount &&
                fuelTank == car.fuelTank &&
                fuelConsumption == car.fuelConsumption &&
                blocking == car.blocking &&
                engine.equals(car.engine) &&
                door.equals(car.door) &&
                bumper.equals(car.bumper) &&
                wheel.equals(car.wheel) &&
                windshield.equals(car.windshield) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doorsCount, engine, door, bumper, wheel, windshield, fuelTank, fuelConsumption, blocking, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nMore info: ");
        sb.append(engine);
        sb.append(door);
        sb.append(doorsCount);
        sb.append(bumper);
        sb.append(wheel);
        sb.append(windshield);
        sb.append("\nColor: " + color);
        return sb.toString();
    }
}
