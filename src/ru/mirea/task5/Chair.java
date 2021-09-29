package ru.mirea.task5;

public class Chair extends Furniture{
    protected int legs_amount;
    protected boolean isBackrest;

    public Chair(String material, int price, int legs_amount, boolean isBackrest) {
        super(material, price);
        this.legs_amount = legs_amount;
        this.isBackrest = isBackrest;
    }

    public int getLegs_amount() {
        return legs_amount;
    }

    public void setLegs_amount(int legs_amount) {
        this.legs_amount = legs_amount;
    }

    public boolean isBackrest() {
        return isBackrest;
    }

    public void setBackrest(boolean backrest) {
        isBackrest = backrest;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legs_amount=" + legs_amount +
                ", isBackrest=" + isBackrest +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
