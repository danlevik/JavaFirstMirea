package ru.mirea.task8.ex1;
import java.awt.*;

public abstract class Shape {
    protected Color color;
    protected int posx;
    protected int posy;
    protected int width;
    protected int height;

    public Shape(Color color, int posx, int posy, int width, int height) {
        this.color = color;
        this.posx = posx;
        this.posy = posy;
        this.width = width;
        this.height = height;
    }
}
