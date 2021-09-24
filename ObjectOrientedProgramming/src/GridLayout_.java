import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayout_ extends JFrame implements ActionListener {

    JButton button_n = new JButton("plug");
    JButton button_s = new JButton("colleague");
    JButton button_w = new JButton("fireplace");
    JButton button_e = new JButton("inhabitant");
    JButton button_c = new JButton("first-hand");

    public GridLayout_() {
        getContentPane().setLayout(new GridLayout());

        getContentPane().add(button_e);
        getContentPane().add(button_w);
        getContentPane().add(button_e);
        getContentPane().add(button_s);
        getContentPane().add(button_n);
        getContentPane().add(button_c);

        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new GridLayout_();
    }
}