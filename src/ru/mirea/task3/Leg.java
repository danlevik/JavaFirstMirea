package ru.mirea.task3;

public class Leg {
    protected boolean isMoving;
    protected int id;

    public Leg() {
        this.isMoving = false;
        this.id = 1;
    }

    public Leg(int id) {
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
        return "Нога\n" +
                "id=" + id +
                "\nisMoving=" + isMoving;
    }
}
