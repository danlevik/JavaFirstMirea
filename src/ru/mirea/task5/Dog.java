package ru.mirea.task5;

public abstract class Dog {
    protected String color;
    protected boolean isFluffy;

    public Dog(String color) {
        this.color = "black";
        this.isFluffy = true;
    }

    public Dog(String color, boolean isFluffy) {
        this.color = color;
        this.isFluffy = isFluffy;
    }

    public abstract String toString();
}