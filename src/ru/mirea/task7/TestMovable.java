package ru.mirea.task7;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(0, 0, 2, 3, 5, 6);
        System.out.println(r1);
        r1.moveRight();
        System.out.println(r1);
        r1.moveDown();
        System.out.println(r1);
    }
}
