package ru.mirea.task7;

public class Square extends Rectangle{

    public Square() {
        this.length = 1;
        this.width = 1;
        this.color = "red";
        this.filled = true;
    }

    public Square(double side) {
        this.length = side;
        this.width = side;
        this.color = "red";
        this.filled = true;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double side){
        this.length = side;
        this.width = side;
    }

    public double getSide(){
        return this.length;
    }

    public void setWidth(double side){
        this.width = side;
        this.length = side;
    }

    public void setLength(double side){
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Shape: square\n" +
                "size: " + this.width +
                "\ncolor: " + this.color;
    }
}
