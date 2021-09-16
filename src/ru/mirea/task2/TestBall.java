package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Blue", 3, true);
        Ball b2 = new Ball("Red", 1);
        Ball b3 = new Ball();
        Ball b4 = new Ball(4);
        b4.setColor("Violet");
        System.out.println(b1);
        System.out.println(b3);

    }
}