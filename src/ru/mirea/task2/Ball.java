package ru.mirea.task2;

import java.lang.*;


public class Ball {
    private String color;
    private int size;
    private boolean isBroken;

    public Ball(String color, int size, boolean isBroken) {
        this.color = color;
        this.size = size;
        this.isBroken = isBroken;
    }

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
        this.isBroken = false;
    }

    public Ball(String color) {
        this.color = color;
        this.size = 2;
        this.isBroken = false;
    }

    public Ball(int size) {
        this.size = size;
        this.color = "White";
        this.isBroken = false;

    }

    public Ball() {
        this.size = 1;
        this.color = "Cyan";
        this.isBroken = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return "Красивый шар " +
                "цвета " + color + ", " +
                "размера " + size + ", " +
                "сломан ли? " + isBroken +
                "...";
    }
}