package ru.mirea.task6.ex1;

public class Main {
    public static void main(String[] args){
        Giraffe g1 = new Giraffe("Melman", 59, 5);
        Giraffe g2 = new Giraffe("Gi ra Ffe", 100, 10);

        Planet p1 = new Planet("Earth", true, false);
        Planet p2 = new Planet("Saturn", false, true);

        System.out.println(g1.getName());
        System.out.println(g2.getName());
        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
