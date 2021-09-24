import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEvent implements ActionListener {

    JFrame window = new JFrame("EVENT LISTENER");
    JPanel panel = new JPanel();

    JButton buttonL = new JButton("LEFT BUTTON");
    JButton buttonM = new JButton("MIDDLE BUTTON");
    JButton buttonR = new JButton("RIGHT BUTTON");

    JLabel label = new JLabel("NO BUTTON PRESSED");

    public ButtonEvent() {
        super();

        buttonL.setPreferredSize(new Dimension(100, 100));
        buttonM.setPreferredSize(new Dimension(100, 100));
        buttonR.setPreferredSize(new Dimension(100, 100));
        label.setPreferredSize(new Dimension(100, 100));

        buttonL.addActionListener(this);
        buttonM.addActionListener(this);
        buttonR.addActionListener(this);

        panel.add(buttonL);
        panel.add(buttonR);
        panel.add(buttonM);

        window.getContentPane().add(panel);
        window.setSize(500, 700);
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(buttonL)) {
            label.setText("LEFT BUTTON");
        } else if (e.getSource().equals(buttonR)) {
            label.setText("RIGHT BUTTON");
        } else if (e.getSource().equals(buttonM)) {
            label.setText("MIDDLE BUTTON");
        }
    }

    public static void main(String[] args) {
        ButtonEvent frame = new ButtonEvent();
    }
}