package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(5, "GREEN");
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        c1.setRadius(3);
        System.out.println(c1);

    }
}
