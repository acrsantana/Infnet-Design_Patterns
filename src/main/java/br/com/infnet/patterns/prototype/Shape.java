package br.com.infnet.patterns.prototype;

import java.util.Objects;

public abstract class Shape{

    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }

}
