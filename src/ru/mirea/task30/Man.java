package ru.mirea.task30;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoseSize() {
        return noseSize;
    }

    public void setNoseSize(String noseSize) {
        this.noseSize = noseSize;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public String getHaircut() {
        return haircut;
    }

    public void setHaircut(String haircut) {
        this.haircut = haircut;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man: " + "name=" + name + "; " +
                "noseSize=" + noseSize + "; " +
                "eyesColor=" + eyesColor + "; " +
                "haircut=" + haircut + "; " +
                "age=" + age +
                '.';
    }

    @Override
    public int hashCode() {
        return 31 * noseSize.hashCode() +
                31 * eyesColor.hashCode() + 31 * haircut.hashCode() + age;
    }
}