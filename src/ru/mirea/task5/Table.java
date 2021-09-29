package ru.mirea.task5;

public class Table extends Furniture{
    protected int legs_amount;
    protected String shape;

    public Table(String material, int price, int legs_amount, String shape) {
        super(material, price);
        this.legs_amount = legs_amount;
        this.shape = shape;
    }

    public int getLegs_amount() {
        return legs_amount;
    }

    public void setLegs_amount(int legs_amount) {
        this.legs_amount = legs_amount;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Table{" +
                "shape='" + shape + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
