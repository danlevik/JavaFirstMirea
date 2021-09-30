package ru.mirea.task5;

public abstract class Furniture implements ru.mirea.task6.ex2.Priceable{
    protected String material;
    protected int price;

    public Furniture(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
