package edu.pht.lessonjavabeans.domain;

public enum Color {
    RED("red"),
    BLACK("black"),
    WHITE("white");

    private String colorInfo;

    Color(String colorInfo) {
        this.colorInfo = colorInfo;
    }

    @Override
    public String toString() {
        return colorInfo;
    }
}
