import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class GUIBorderLayout  {
        public static void main(String[] args) {
                JFrame frame = new JFrame("Border Layout");
                frame.setSize(400,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());

                frame.add(new JButton("North"),BorderLayout.NORTH);
                frame.add(new JButton("South"),BorderLayout.SOUTH);
                frame.add(new JButton("East"),BorderLayout.EAST);
                frame.add(new JButton("West"),BorderLayout.WEST);
                frame.add(new JButton("Center"),BorderLayout.CENTER);
                frame.setVisible(true);
        }
}
