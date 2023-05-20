// Write a java program to Demonstrate KeyAdapter classes.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise12c extends JFrame {
    private JLabel statusLabel;

    public Exercise12c() {
        super("KeyAdapter Demo");
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        statusLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        add(statusLabel);
        addKeyListener(new CustomKeyListener());

        setSize(400, 400);
        setLayout(new GridLayout(2, 1));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise12c();
    }

    class CustomKeyListener extends KeyAdapter {
        public void keyTyped(KeyEvent e) {
            statusLabel.setText("You have typed character " + e.getKeyChar());
        }
    }
}