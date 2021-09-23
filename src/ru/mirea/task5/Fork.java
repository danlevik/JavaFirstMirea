package ru.mirea.task5;

public class Fork extends Dish{

    protected boolean isDull;

    public Fork(String shape, boolean isFilledWithFood) {
        super(shape, isFilledWithFood);
        this.isDull = false;
    }

    public Fork(String shape, boolean isFilledWithFood, boolean isDull) {
        super(shape, isFilledWithFood);
        this.isDull = isDull;
    }

    protected void toSharpen() {
        this.isDull = false;
        System.out.println("Вы заточили вилку");
    }

    @Override
    public String toString() {
        return "Вилка: \n" +
                "  Форма: " + shape +
                "\n  Затупилась ли: " + isDull +
                "\n  Есть ли еда: " + isFilledWithFood + "\n";
    }
}