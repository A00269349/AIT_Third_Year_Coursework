import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button_Event implements ActionListener
{
    JFrame window = new JFrame("EVENT LISTENER");
    JPanel panel = new JPanel();
    JButton button_l = new JButton("LEFT");
    JButton button_m = new JButton("MIDDLE");
    JButton button_r = new JButton("RIGHT");
    JLabel label = new JLabel("NO BUTTON PRESSED");

    public Button_Event() {
        super();

        button_l.setPreferredSize(new Dimension(300, 300));
        button_m.setPreferredSize(new Dimension(300, 300));
        button_r.setPreferredSize(new Dimension(300, 300));

        label.setPreferredSize(new Dimension(300, 300));

        button_l.addActionListener(this);
        button_m.addActionListener(this);
        button_r.addActionListener(this);

        panel.add(button_l);
        panel.add(button_m);
        panel.add(button_r);

        window.getContentPane().add(panel);
        window.setSize(500, 700);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button_l)) {
            label.setText("LEFT BUTTON PRESSED");
        }
        else if (e.getSource().equals(button_m)) {
            label.setText("MIDDLE BUTTON PRESSED");
        }
        else if (e.getSource().equals(button_r)) {
            label.setText("RIGHT BUTTON PRESSED");
        }
    }
    public static void main(String[] args) {
        Button_Event frame = new Button_Event();
    }
}

