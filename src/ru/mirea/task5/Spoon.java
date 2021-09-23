package ru.mirea.task5;

public class Spoon extends Dish{

    protected boolean isRusty;

    public Spoon(String shape, boolean isFilledWithFood) {
        super(shape, isFilledWithFood);
        this.isRusty = false;
    }

    public Spoon(String shape, boolean isFilledWithFood, boolean isRusty) {
        super(shape, isFilledWithFood);
        this.isRusty = isRusty;
    }

    @Override
    public String toString() {
        return "Ложка: \n" +
                "  Форма: " + shape +
                "\n  Заржавела ли: " + isRusty +
                "\n  Есть ли еда: " + isFilledWithFood + "\n";
    }
}