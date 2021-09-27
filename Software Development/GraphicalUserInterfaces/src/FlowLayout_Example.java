import java.awt.*;
import javax.swing.*;

public class FlowLayout_Example extends JFrame {
  private final JButton theButton1 = new JButton("Button 1");
  private final JButton theButton2 = new JButton("2");
  private final JButton theButton3 = new JButton("Button 3");
  private final JButton theButton4 = new JButton("Long-Named Button 4");
  private final JButton theButton5 = new JButton("Button 5");

    public static void main(String[] args) {
	    new FlowLayout_Example();
    }
    public FlowLayout_Example(){
        
        getContentPane().setLayout(new FlowLayout());

        getContentPane().add(theButton1);
        getContentPane().add(theButton2);
        getContentPane().add(theButton3);
        getContentPane().add(theButton4);
        getContentPane().add(theButton5);
        setSize(500,75);
        setVisible(true);
    }
}