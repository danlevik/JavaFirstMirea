package ru.mirea.task25;

interface Shape {
    public void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("круг нарисован");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("квадрат нарисован");
    }
}

abstract class ShapeDecorator implements Shape{
    Shape shape;
    public ShapeDecorator(Shape shape) { this.shape = shape; }
    public abstract void draw();
}

class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    public void draw() {
        shape.draw();
    }

    void setRedBorder() { System.out.println("задана красная граница"); }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        RedShapeDecorator rectangle_border = new RedShapeDecorator(rectangle);
        rectangle_border.setRedBorder();
        rectangle_border.draw();

        System.out.println();

        Shape circle = new Circle();
        RedShapeDecorator circleborder = new RedShapeDecorator(circle);
        circleborder.setRedBorder();
        circleborder.draw();
    }
}