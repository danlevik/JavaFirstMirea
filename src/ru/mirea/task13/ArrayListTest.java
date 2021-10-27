package ru.mirea.task13;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


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

        // вставить один список в конец другого (можно по индексу)
        list2.addAll(list1);
        System.out.println(list2);

        // индекс элемента
        System.out.println("index: " + list2.indexOf(41));
        System.out.println("index: " + list2.indexOf(202));

        // пустой ли список
        System.out.println("isEmpty: " + list2.isEmpty());
        System.out.println("isEmpty: " + list3.isEmpty());

        // удалить элемент по индексу
        list2.remove(4);
        System.out.println(list2);

        // замена элемента
        list2.set(0, 0);
        System.out.println(list2);

        // сортировка
        list2.sort(Integer::compareTo);
        System.out.println(list2);
    }
}
