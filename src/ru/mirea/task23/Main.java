package ru.mirea.task23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Man m1 = new Man("Джон", "long", "blue", "cascade", 15);
        Man m2 = new Man("Марк","short", "green", "bold", 48);
        Man m3 = new Man("Никола","long", "blue", "cascade", 15);
        Man m4 = new Man("Андрей","middle", "brown", "undercut", 24);
        Man m5 = new Man("Василий","middle", "brown", "undercut", 24);

        ArrayList<Man> mans = new ArrayList<Man>();
        mans.add(m1);
        mans.add(m2);
        mans.add(m3);
        mans.add(m4);
        mans.add(m5);

        for (int i = 0; i < 5; i++){
            for (int j = i + 1; j < 5; j++){
                System.out.println("Близнецы ли " + mans.get(i).name + " и " + mans.get(j).name + "? Ответ: ");
                String result = mans.get(i).hashCode() == mans.get(j).hashCode()? "Да" : "Нет";
                System.out.println(result);
                System.out.println("Их хеш-коды: ");
                System.out.println(mans.get(i).hashCode());
                System.out.println(mans.get(j).hashCode());
                System.out.println();
            }
        }
    }
}
