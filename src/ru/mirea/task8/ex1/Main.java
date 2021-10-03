package ru.mirea.task8.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame{
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    Color colors[] = { Color.BLUE, Color.GREEN, Color.RED};
    Random random = new Random();

    public Main(){
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String arr[]){
        new Main();
    }

    public void paint(Graphics g){
        super.paintComponents(g);
        int color, rand_x, rand_y, rand_w, rand_h, rand_shape;

        for (int i = 0; i < 20; i++){
            color = random.nextInt(colors.length);
            rand_x = random.nextInt(WIDTH);
            rand_y = random.nextInt(HEIGHT);
            rand_w = random.nextInt(WIDTH/4);
            rand_h = random.nextInt(HEIGHT/4);
            rand_shape = random.nextInt(2);

            switch (rand_shape){
                case 0:
                    Rectangle rect = new Rectangle(colors[color], rand_x, rand_y, rand_w, rand_h);
                    g.setColor(rect.color);
                    g.drawRect(rect.posx, rect.posy, rect.width, rect.height);
                    break;
                case 1:
                    Circle circle = new Circle(colors[color], rand_x, rand_y, rand_w, rand_h);
                    g.setColor(circle.color);
                    g.drawOval(circle.posx, circle.posy, circle.width, circle.height);
                    break;
            }
        }
    }
}
