import java.awt.FlowLayout;

import javax.swing.*;
public class TextField {
        public static void main(String[] args) {
                JFrame frame = new JFrame("Text Field Example");
                frame.setSize(400,400);
                frame.setLayout(new FlowLayout());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel label = new JLabel("Enter your name :- ");
                JTextField textField =  new JTextField(20);
                frame.add(label);
                frame.add(textField);
                frame.setVisible(true);
        }
        
}
