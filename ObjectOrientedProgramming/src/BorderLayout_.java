import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayout_ extends JFrame implements ActionListener {

    JButton button_n = new JButton("NORTH");
    JButton button_s = new JButton("SOUTH");
    JButton button_w = new JButton("WEST");
    JButton button_e = new JButton("EAST");
    JButton button_c = new JButton("CENTER");

    public BorderLayout_() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(button_w, BorderLayout.WEST);
        getContentPane().add(button_e, BorderLayout.EAST);
        getContentPane().add(button_s, BorderLayout.SOUTH);
        getContentPane().add(button_n, BorderLayout.NORTH);
        getContentPane().add(button_c, BorderLayout.CENTER);

        //setSize(screenSize.width, screenSize.height);

        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new BorderLayout_();
    }
}