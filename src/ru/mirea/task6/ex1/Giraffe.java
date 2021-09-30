package ru.mirea.task6.ex1;

public class Giraffe implements Nameable{
    protected String name;
    protected int spots;
    protected int neck_length;

    public Giraffe(String name, int spots, int neck_length) {
        this.name = name;
        this.spots = spots;
        this.neck_length = neck_length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }

    public int getNeck_length() {
        return neck_length;
    }

    public void setNeck_length(int neck_length) {
        this.neck_length = neck_length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "name='" + name + '\'' +
                ", spots=" + spots +
                ", neck_length=" + neck_length +
                '}';
    }
}
