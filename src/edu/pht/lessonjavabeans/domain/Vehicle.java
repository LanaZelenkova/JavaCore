package edu.pht.lessonjavabeans.domain;

import java.io.Serializable;
import java.util.Objects;

public abstract class Vehicle extends Mechanism implements Serializable {

    private int modelYear;
    private double speed;

    public Vehicle() {}

    public Vehicle(Long id, String producer, int modelYear, double speed) {
        super(id, producer);
        this.modelYear = modelYear;
        this.speed = speed;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public abstract void block();

    public abstract void unblock();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vehicle vehicle = (Vehicle) o;
        return modelYear == vehicle.modelYear &&
                Double.compare(vehicle.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), modelYear, speed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nModelYear: " + modelYear);
        sb.append(", Speed: " + speed);
        return sb.toString();
    }


}
