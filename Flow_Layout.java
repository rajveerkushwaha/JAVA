import java.awt.*;

public class Flow_Layout  {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Example");

        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        frame.add(new Button("Button 1"));
        frame.add(new Button("Button 2"));
        frame.add(new Button("Button 3"));

        frame.setVisible(true);
    }
}
