package ru.mirea.task5;

import java.util.ArrayList;

public class FurnitureShop {
    public static ArrayList<Chair> chair_arr = new ArrayList<>();
    public static ArrayList<Table> table_arr = new ArrayList<>();

    public FurnitureShop() {
    }

    public static void addChair(Chair chair){
        chair_arr.add(chair);
    }

    public static void addTable(Table table){
        table_arr.add(table);
    }

    public static void printChairs(){
        for (Chair chair : chair_arr){
            System.out.println(chair);
        }
    }

    public static void printTables(){
        for (Table table : table_arr){
            System.out.println(table);
        }
    }


}
