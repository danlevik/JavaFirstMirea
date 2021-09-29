package ru.mirea.task5;

public class TestFurniture {
    public static void main(String[] args){
        FurnitureShop shop1 = new FurnitureShop();

        shop1.addChair(new Chair("wood", 2000, 4, true));
        shop1.addChair(new Chair("plastic", 218, 3, false));
        shop1.addChair(new Chair("stone", 8000, 0, true));

        shop1.addTable(new Table("pine", 15000, 4, "circle"));
        shop1.addTable(new Table("oak", 49500, 1, "circle"));
        shop1.addTable(new Table("stone", 15000, 4, "square"));
        shop1.addTable(new Table("iron", 3000, 4, "rectangle"));

        shop1.printTables();
        shop1.printChairs();

        System.out.println();

        shop1.chair_arr.get(0).setPrice(3800);
        shop1.printChairs();
    }
}
