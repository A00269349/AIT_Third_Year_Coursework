import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main_Gui extends JFrame implements ActionListener
{
    private final JButton reveal_button = new JButton("REVEAL");
    private final JButton hide_button = new JButton("HIDE");
    private final JTextField phone_table = new JTextField();
    private final JPanel panel = new JPanel();
    private JFrame frame = new JFrame("Part 1");

    private final BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);
    private boolean checked = false;

    public Main_Gui() {
        /*
            -----------------------------
            |                           |
            |                           |
            |                           |
            |                           |
            -----------------------------
            -------------   -------------
            |           |   |           |
            -------------   -------------
         */

        panel.setLayout(boxlayout);
        panel.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));

        reveal_button.setAlignmentY(Component.CENTER_ALIGNMENT);
        hide_button.setAlignmentY(Component.CENTER_ALIGNMENT);

        panel.add(phone_table);
        panel.add(reveal_button);
        panel.add(hide_button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

/*        if (e.getSource().equals(cb)) {
            if (!checked) {
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
        }*/
        System.out.println(checked);
    }

    public static void main(String[] args) {
        new Main_Gui();
    }
}
