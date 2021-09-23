package ru.mirea.task5;

public class Chihuahua extends Dog{

    protected boolean isLoud;

    public Chihuahua(String color, boolean isLoud) {
        super(color);
        this.isFluffy = false;
        this.isLoud = isLoud;

    }

    public String toString() {
        return "Чи-хуа-хуа{" +
                "\n  Цвет: " + color +
                "\n  Пушистый ли: " + isFluffy +
                "\n  Громкий ли: " + isLoud;
    }
}
