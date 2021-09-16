package ru.mirea.task7;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1;
        this.length = 2;
        this.color = "red";
        this.filled = true;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    @Override
    public String toString() {
        return "Shape: rectangle\n" +
                "width: " + this.width +
                "\nlength: " + this.length +
                "\ncolor: " + this.color;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "red";
        this.filled = true;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
