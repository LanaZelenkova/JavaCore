package edu.pht.lessonjavabeans.domain;

import java.util.Objects;

public abstract class Detail {

    private Long id;
    private String model;
    private double price;

    public Detail() {}

    public Detail(Long id, String model, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void handle();

    public abstract void failTest();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return Double.compare(detail.price, price) == 0 &&
                id.equals(detail.id) &&
                model.equals(detail.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nId: " + id);
        sb.append(", Model: " + model);
        sb.append(", Price: " + price);
        return sb.toString();
    }
}
