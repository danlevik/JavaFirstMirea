package ru.mirea.task3;

public class Hand {
    protected boolean isMoving;
    protected int id;

    public Hand() {
        this.isMoving = false;
        this.id = 1;
    }

    public Hand(int id) {
        this.id = id;
        this.isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    @Override
    public String toString() {
        return "Рука\n" +
                "id=" + id +
                "\nisMoving=" + isMoving;
    }
}
