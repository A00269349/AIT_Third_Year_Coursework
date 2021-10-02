import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Assignment_1_Part_2 extends JFrame implements ActionListener
{
    private final JButton b1 = new JButton();
    private final JButton b2 = new JButton();
    private final JButton b3 = new JButton();
    private final JPanel panel = new JPanel();
    private final JCheckBox cb = new JCheckBox("GIVE COLOURS");
    private final JFrame frame = new JFrame("Part 2");
    private final BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
    private boolean checked = false;

    public Assignment_1_Part_2() {
        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

        b1.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        b2.setAlignmentY(Component.TOP_ALIGNMENT);
        b3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        cb.setAlignmentY(Component.BOTTOM_ALIGNMENT);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(cb);
        cb.addActionListener(this);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(cb)) {
            if (checked == false) {
                checked = true;
            }
            else {
                checked = false;
            }
        }
        if (checked) {
            b1.setBackground(Color.RED);
            b2.setBackground(Color.GREEN);
            b3.setBackground(Color.BLUE);
        }
        else {
            b1.setBackground(Color.LIGHT_GRAY);
            b2.setBackground(Color.LIGHT_GRAY);
            b3.setBackground(Color.LIGHT_GRAY);
        }
        System.out.println(checked);
    }

    public static void main(String[] args) {
        new Assignment_1_Part_2();
    }
}
