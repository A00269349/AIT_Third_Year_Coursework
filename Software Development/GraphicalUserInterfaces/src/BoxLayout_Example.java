import java.awt.*;
import javax.swing.*;

public class BoxLayout_Example extends JFrame {
	private final JButton theButton1 = new JButton("Button 1");
	private final JButton theButton2 = new JButton("Button 2");
	private final JButton theButton3 = new JButton("Button 3");
	private final JButton theButton4 = new JButton("Button 4");
	private final JButton theButton5 = new JButton("Long-Named Button 5");

	public BoxLayout_Example() {
		
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

		theButton1.setAlignmentY(Component.LEFT_ALIGNMENT);
		getContentPane().add(theButton1);

		theButton2.setAlignmentY(Component.CENTER_ALIGNMENT);
		getContentPane().add(theButton2);

		theButton3.setAlignmentY(Component.RIGHT_ALIGNMENT);
		getContentPane().add(theButton3);

		theButton4.setAlignmentY(Component.CENTER_ALIGNMENT);
		getContentPane().add(theButton4);

		theButton5.setAlignmentY(Component.CENTER_ALIGNMENT);
		getContentPane().add(theButton5);

		setSize(250,175);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BoxLayout_Example();
	}
}
