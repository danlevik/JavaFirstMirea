package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame{
    protected int milan = 0;
    protected int madrid = 0;
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    public Football()
    {
        setSize(500, 500);
        setLayout(new BorderLayout());
        add(b1, BorderLayout.WEST);
        add(b2, BorderLayout.EAST);
        add(result, BorderLayout.NORTH);
        add(last, BorderLayout.SOUTH);
        add(winner, BorderLayout.CENTER);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                result.setText("Result: " + milan + " X " + madrid);
                last.setText("Last Scorer: AC Milan");
                if (milan == madrid){
                    winner.setText("Winner: DRAW");
                }
                else if (milan > madrid){
                    winner.setText("Winner: AC Milan");
                }
                else{
                    winner.setText("Winner: Real Madrid");
                }
            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                result.setText("Result: " + milan + " X " + madrid);
                last.setText("Last Scorer: Real Madrid");
                if (milan == madrid){
                    winner.setText("Winner: DRAW");
                }
                else if (milan > madrid){
                    winner.setText("Winner: AC Milan");
                }
                else{
                    winner.setText("Winner: Real Madrid");
                }
            }
        });
    }

    public static void main(String[] args)
    {
        new Football().setVisible(true);
    }
}