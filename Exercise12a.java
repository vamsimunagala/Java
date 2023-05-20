// Write a JAVA program that display the x and y position of the cursor movement usingMouse.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise12a extends JFrame {
    private JLabel statusLabel;

    public Exercise12a() {
        super("MouseMotionAdapter Demo");
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        statusLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        add(statusLabel);
        addMouseMotionListener(new CustomMouseMotionListener());

        setSize(400, 400);
        setLayout(new GridLayout(2, 1));
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise12a();
    }

    class CustomMouseMotionListener extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent e) {
            statusLabel.setText("Mouse moved to (" + e.getX() + ", " + e.getY() + ")");
        }
    }
}