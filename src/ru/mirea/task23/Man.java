package ru.mirea.task23;

import java.util.ArrayList;

public class Man {
    public String name;
    private String noseSize;
    private String eyesColor;
    private String haircut;
    private int age;

    public Man(String name, String noseSize, String eyesColor, String haircut, int age) {
        this.name = name;
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return 31 * noseSize.hashCode() +
                31 * eyesColor.hashCode() + 31 * haircut.hashCode() + age;
    }
}
