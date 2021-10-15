import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
public class Assignment_1_Part_1 extends JFrame
{
    private final JButton b1 = new JButton();
    private final JButton b2 = new JButton();
    private final JButton b3 = new JButton();
    private final JPanel panel = new JPanel();
    private JFrame frame = new JFrame("Part 1");
    private final BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

    public Assignment_1_Part_1() {
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(50,50,50,50)));

        b1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        b2.setAlignmentY(Component.TOP_ALIGNMENT);
        b3.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment_1_Part_1();
    }
}
