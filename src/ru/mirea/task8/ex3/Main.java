package ru.mirea.task8.ex3;

import javax.swing.*;
import javax.tools.Tool;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Main extends JFrame {
    public static final int WIDTH = 173;
    public static final int HEIGHT = 165;
    static Image image;
    protected static ArrayList<Image> frames = new ArrayList<>();

    public Main(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        g.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        new Main();
        frames.add(new ImageIcon("D:/JavaFirstMirea/src/ru/mirea/task8/ex3/eye1.png").getImage());
        frames.add(new ImageIcon("D:/JavaFirstMirea/src/ru/mirea/task8/ex3/eye2.png").getImage());
        frames.add(new ImageIcon("D:/JavaFirstMirea/src/ru/mirea/task8/ex3/eye3.png").getImage());
        frames.add(new ImageIcon("D:/JavaFirstMirea/src/ru/mirea/task8/ex3/eye4.png").getImage());
        frames.add(new ImageIcon("D:/JavaFirstMirea/src/ru/mirea/task8/ex3/eye3.png").getImage());
        frames.add(new ImageIcon("D:/JavaFirstMirea/src/ru/mirea/task8/ex3/eye2.png").getImage());

        Main frame = new Main();

        while (true){
            for (int i = 0; i < 6; i++){
                image = frames.get(i);
                frame.repaint();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}