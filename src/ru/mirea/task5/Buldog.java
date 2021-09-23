package ru.mirea.task5;

public class Buldog extends Dog {

    protected boolean isSlobbering;

    public Buldog(String color, boolean isFluffy, boolean isSlobbering) {
        super(color, isFluffy);
        this.isSlobbering = isSlobbering;
    }

    public Buldog(String color, boolean isFluffy) {
        super(color, isFluffy);
        this.isSlobbering = true;
    }

    public String toString() {
        return "Бульдог: " +
                "\n  Цвет: " + color +
                "\n  Пушистый ли: " + isFluffy +
                "\n  Слюнявый ли: ";
    }
}
