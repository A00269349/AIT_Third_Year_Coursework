import javax.swing.*;
import java.awt.*;

public class GridBagLayout_Example extends JFrame {
    private final JButton theButton1 = new JButton("Button 1");
    private final JButton theButton2 = new JButton("2");
    private final JButton theButton3 = new JButton("Button 3");
    private final JButton theButton4 = new JButton("Long-Named Button 4");
    private final JButton theButton5 = new JButton("Button 5");
    private final GridBagLayout gridBag = new GridBagLayout();
    private final GridBagConstraints constraints = new GridBagConstraints();
    public GridBagLayout_Example() {
        getContentPane().setLayout(new GridLayout(3, 2));

        constraints.gridx = 0;
        constraints.gridy = 0;
        gridBag.setConstraints(theButton3, constraints);
        getContentPane().add(theButton1);
        constraints.gridx = 1;
        constraints.gridy = 0;
        gridBag.setConstraints(theButton3, constraints);
        getContentPane().add(theButton2);
        constraints.gridx = 2;
        constraints.gridy = 0;
        gridBag.setConstraints(theButton3, constraints);
        getContentPane().add(theButton3);
        constraints.gridx = 0;
        constraints.gridy = 1;
        gridBag.setConstraints(theButton3, constraints);
        getContentPane().add(theButton4);
        constraints.gridx = 1;
        constraints.gridy = 1;
        gridBag.setConstraints(theButton3, constraints);
        getContentPane().add(theButton5);
        constraints.gridx = 2;
        constraints.gridy = 1;
        gridBag.setConstraints(theButton3, constraints);

        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayout_Example();
    }
}

