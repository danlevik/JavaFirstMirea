package ru.mirea.task5;

public class TestDishes {
    public static void main(String[] args){
        Plate pl1 = new Plate("square", true, "green");
        Spoon sp1 = new Spoon("round", false, true);
        Fork fk1 = new Fork("rectangle", true, true);

        pl1.washPlate();

        System.out.println(pl1);
        System.out.println(sp1);
        System.out.println(fk1);

        fk1.toSharpen();

        System.out.println(fk1);
    }
}
