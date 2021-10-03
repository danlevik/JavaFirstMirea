package ru.mirea.task8.ex2;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

public class Main extends JFrame {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    static Image image;

    public Main(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        String url = args[0];
        System.out.println(url);
        image = Toolkit.getDefaultToolkit().getImage(url);
        new Main();
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 0, 0, this);
    }
}
