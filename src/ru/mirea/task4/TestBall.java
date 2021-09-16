package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball bl1 = new Ball(50, 50);
        System.out.println(bl1);
        bl1.move(10, 16);
        System.out.println(bl1);

        Ball bl2 = new Ball();
        bl2.setXY(15, 80);
        System.out.println(bl2);
    }
}
