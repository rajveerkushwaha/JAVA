import java.awt.FlowLayout;

import javax.swing.*;
public class JTextAreaEx {
        public static void main(String[] args) {
                JFrame frame = new JFrame("TExt Area Example");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());
                frame.setSize(400,400);
                JTextArea textArea = new JTextArea(10,30);
                frame.add(new JScrollPane(textArea));
                frame.setVisible(true);
                
        }       
}
