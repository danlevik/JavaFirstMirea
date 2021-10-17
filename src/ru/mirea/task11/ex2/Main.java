package ru.mirea.task11.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JFrame{

    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel west = new JPanel();
    JPanel east = new JPanel();
    JPanel center = new JPanel();



    public Main()
    {
        setSize(500, 500);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(south, BorderLayout.SOUTH);
        panel.add(north, BorderLayout.NORTH);
        panel.add(west, BorderLayout.WEST);
        panel.add(east, BorderLayout.EAST);
        panel.add(center, BorderLayout.CENTER);

        setMouseListener(center, "CENTER");
        setMouseListener(north, "NORTH");
        setMouseListener(south, "SOUTH");
        setMouseListener(west, "WEST");
        setMouseListener(east, "EAST");

        add(panel);
    }


    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }

    private static void setMouseListener(JPanel panel, String text) {
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                JOptionPane.showMessageDialog(panel, "Добро пожаловать в " + text);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });
    }
}
