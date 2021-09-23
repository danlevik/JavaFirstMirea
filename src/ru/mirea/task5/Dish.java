package ru.mirea.task5;

public abstract class Dish {
    protected String shape;
    protected boolean isFilledWithFood;

    public Dish() {
        this.shape = "round";
        this.isFilledWithFood = false;
    }

    public Dish(String shape, boolean isFilledWithFood) {
        this.shape = shape;
        this.isFilledWithFood = isFilledWithFood;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public boolean isFilledWithFood() {
        return isFilledWithFood;
    }

    public void setFilledWithFood(boolean filledWithFood) {
        isFilledWithFood = filledWithFood;
    }

    public abstract String toString();
}
