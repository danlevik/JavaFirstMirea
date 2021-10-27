package ru.mirea.task13;

import java.util.ArrayList;

public class MyArrayListTest {
    public static void main(String[] args){
        MyArrayList<Integer> list1 = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();
        MyArrayList<Integer> list3 = new MyArrayList<>();


        // добавить элемент в конец
        list1.add(41);
        list1.add(43);
        list2.add(51);
        list2.add(53);
        System.out.println(list1);
        // добавить элемент по индексу
        list1.add(1, 42);
        list2.add(1, 52);
        System.out.println(list1);

        System.out.println(list2);


        // удалить элемент по индексу
        list2.remove(1);
        System.out.println(list2);

        // замена элемента
        list2.set(0, 0);
        System.out.println(list2);

    }
}
