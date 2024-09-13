import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingDemo {
        public static void main(String[] args)  
        {
                JFrame frame = new JFrame("Simple Frame");
                frame.setSize(400,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new FlowLayout());
                JButton button = new JButton("Click ME!");
                button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e)  {
                                System.out.println("Button Clicked!");
                                
                        }
                });
                frame.add(button);

                frame.setVisible(true);

        }        
}
