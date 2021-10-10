package ru.mirea.task11.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;

public class Main extends JFrame{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;

    public static final int GUESS_NUM = (int)(Math.random() * 21);


    int attempts = 0;
    JLabel isGood = new JLabel("");
    JTextField enterNumber = new JTextField();
    JButton confirm = new JButton("Угадать");

    public Main(){
        setSize(WIDTH, HEIGHT);
        setLayout(new GridLayout(3, 0, 10, 10));
        add(isGood);
        add(enterNumber);
        add(confirm);

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attempts++;

                if (Integer.parseInt(enterNumber.getText()) == GUESS_NUM)
                    isGood.setText("ВЫ ПОБЕДИЛИ");
                else if (attempts >= 3)
                    isGood.setText("Game over.");
                else if (Integer.parseInt(enterNumber.getText()) < GUESS_NUM)
                    isGood.setText("Загаданное число больше");
                else if (Integer.parseInt(enterNumber.getText()) > GUESS_NUM)
                    isGood.setText("Загаданное число меньше");
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
