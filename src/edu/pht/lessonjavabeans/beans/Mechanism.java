package edu.pht.lessonjavabeans.beans;

import java.io.Serializable;
import java.util.Objects;

import static edu.pht.lessonjavabeans.util.Constants.NEW_LINE;

public abstract class Mechanism implements Serializable {

    private Long id;
    private String producer;

    public Mechanism() {}

    public Mechanism(Long id, String producer) {
        this.id = id;
        this.producer = producer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public abstract void drive();

    public abstract void stop();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanism mechanism = (Mechanism) o;
        return id.equals(mechanism.id) &&
                producer.equals(mechanism.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, producer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NEW_LINE);
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append("Id: " + id);
        sb.append(", Producer: " + producer);
        return sb.toString();
    }
}
