package Assignment_2;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Main_Gui extends JFrame implements ActionListener
{
    //  BUTTONS
    private final JButton reveal_button = new JButton("REVEAL");
    private final JButton hide_button = new JButton("HIDE");
    //  TEXT AREAS
    private final JTextArea phone_table = new JTextArea(20, 20);
    //  PANELS
    private final JPanel button_panel = new JPanel();
    private final JPanel table_panel = new JPanel();
    //  CONTAINERS
    private final Container contentPane = this.getContentPane();
    //  FRAME
    private final JFrame frame = new JFrame("MAIN GUI");
    //  TEXT
    public static ArrayList<Phone> phones = new ArrayList<Phone>();
    public static String phones_text;

    public Main_Gui() {
        this.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        this.setSize(500, 500);

        /* PRINT */
        phone_table.setLayout(new BorderLayout());
        JScrollPane phone_table_scroll = new JScrollPane((phone_table));

        final int margin = 25;
        Border roundedBorder = new LineBorder(Color.LIGHT_GRAY, 5, true);

        phone_table_scroll.setBorder(new EmptyBorder(new Insets(margin, margin, margin, margin)));
        phone_table.setBorder(roundedBorder);

        /* BUTTONS MENU AREA */
        button_panel.add(reveal_button);
        button_panel.add(hide_button);
        reveal_button.addActionListener(this);
        hide_button.addActionListener(this);

        //  ADD TO WINDOW
        contentPane.add(table_panel);
        contentPane.add(phone_table_scroll);
        contentPane.add(button_panel);
        //this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(reveal_button)) {
            phones_text = "";
            for (Phone phone : phones) {
                phones_text = phones_text + phone.toString() + "\n";
            }
            phone_table.setText(phones_text);
        }
        if (e.getSource().equals(hide_button)) {
            phones_text = "";
            phone_table.setText(phones_text);
        }
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("Sony", "Experia X", 32, 12.5, 4.6, true, 150);
        Phone p2 = new Phone("Sony", "Experia Z", 64, 14.2, 5.6, true, 175);
        Phone p3 = new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, true, 180);
        Phone p4 = new Phone("Nokia", "3330", 16, 13.2, 2.3, false, 90);
        Phone p5 = new Phone("Motorola", "M1", 8, 11.3, 4.9, true, 100);
        Phone p6 = new Phone("IPhone", "6", 32, 13.5, 6.4, false, 250);
        Phone p7 = new Phone("Alcatel", "A3", 8, 9.3, 2.4, false, 50);

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones.add(p4);
        phones.add(p5);
        phones.add(p6);
        phones.add(p7);

        new Main_Gui();
    }
}
