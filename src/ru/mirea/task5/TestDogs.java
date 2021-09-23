package ru.mirea.task5;

import java.util.BitSet;

public class TestDogs {
    public static void main(String[] args){
        Chihuahua ch1 = new Chihuahua("white", true);
        Buldog b1 = new Buldog("black", false, true);

        System.out.println(ch1);
        System.out.println(b1);
    }
}
