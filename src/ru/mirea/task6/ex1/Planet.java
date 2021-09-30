package ru.mirea.task6.ex1;

public class Planet implements Nameable {
    protected String name;
    protected boolean isLiving;
    protected boolean isGiant;

    public Planet(String name, boolean isLiving, boolean isGiant) {
        this.name = name;
        this.isLiving = isLiving;
        this.isGiant = isGiant;
    }

    public Planet(String name, boolean isLiving) {
        this.name = name;
        this.isLiving = isLiving;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLiving() {
        return isLiving;
    }

    public void setLiving(boolean living) {
        isLiving = living;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", isLiving=" + isLiving +
                '}';
    }
}
