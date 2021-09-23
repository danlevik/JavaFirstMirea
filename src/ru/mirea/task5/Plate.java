package ru.mirea.task5;

public class Plate extends Dish{

    protected String color;

    public Plate(String shape, boolean isFilledWithFood, String color) {
        super(shape, isFilledWithFood);
        this.color = color;
    }

    protected void washPlate(){
        setFilledWithFood(false);
        System.out.println("Вы помыли тарелку и видите свое отражение.");
    }

    @Override
    public String toString() {
        return "Тарелка: \n" +
                "  Форма: " + shape +
                "\n  Цвет: " + color +
                "\n  Есть ли еда: " + isFilledWithFood + "\n";
    }
}
