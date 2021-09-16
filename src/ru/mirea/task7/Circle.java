package ru.mirea.task7;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = 1;
        this.color = "red";
        this.filled = true;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        this.filled = true;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle\n" +
                "radius: " + this.radius +
                "\ncolor: " + this.color;
    }
}
