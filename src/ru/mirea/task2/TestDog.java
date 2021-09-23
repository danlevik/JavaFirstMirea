package ru.mirea.task2;

import java.util.ArrayList;

public class TestDog {
    protected static ArrayList<Dog> dogarr = new ArrayList<>();
    public static void main(String[] args) {

        putInArr(new Dog("Mike", 2));
        putInArr(new Dog("Helen", 7));
        putInArr(new Dog("Bob"));
        dogarr.get(2).setAge(1);
        System.out.println(dogarr.get(1));
        dogarr.get(0).intoHumanAge();
        dogarr.get(1).intoHumanAge();
        dogarr.get(2).intoHumanAge();
    }

    public static void putInArr(Dog d){
        dogarr.add(d);
    }
}