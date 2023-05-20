/*
 Write a Java program to create radio buttons(male & female) perform event handling to display
relevant text when radio button selected and button press is performed */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise12b {
    private JFrame frame;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JButton submitButton;

    public Exercise12b() {
     
        frame = new JFrame("Gender Selection");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        submitButton = new JButton("Submit");

      
        maleRadioButton.addActionListener(new RadioButtonListener());
        femaleRadioButton.addActionListener(new RadioButtonListener());
        submitButton.addActionListener(new SubmitButtonListener());

        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);
        frame.add(submitButton);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }

    class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JRadioButton radioButton = (JRadioButton) e.getSource();
            String gender = radioButton.getText();

            if (gender.equals("Male")) {
                JOptionPane.showMessageDialog(frame, "You selected Male.");
            } else if (gender.equals("Female")) {
                JOptionPane.showMessageDialog(frame, "You selected Female.");
            }
        }
    }

    class SubmitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "Please select a gender.";

            if (maleRadioButton.isSelected()) {
                message = "You selected Male.";
            } else if (femaleRadioButton.isSelected()) {
                message = "You selected Female.";
            }

            JOptionPane.showMessageDialog(frame, message);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new  Exercise12b();
            }
        });
    }
}
