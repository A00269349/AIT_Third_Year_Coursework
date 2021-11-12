package Assignment_3;

import javax.swing.*;
import java.awt.*;

import static java.util.Locale.Category.DISPLAY;

public class TabbedPane extends JPanel {
    public TabbedPane() {
        initializeUI();
    }

    public static void showFrame() {
        JPanel panel = new TabbedPane();
        panel.setOpaque(true);

        JFrame frame = new JFrame("Simple Tabbed Pane Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TabbedPane::showFrame);
    }

    private void initializeUI() {
        JTabbedPane tabbedPane = new JTabbedPane();

        create_panels(tabbedPane);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 200));
        this.add(tabbedPane, BorderLayout.CENTER);
    }

    private void create_panels(JTabbedPane tabbedPane) {
        String[] PANEL_NAMES = {"HOME", "DISPLAY", "ADD", "REMOVE", "EDIT" };
        JPanel homepage_panel = new JPanel();
        homepage_panel.add(new JLabel(PANEL_NAMES[0]));
        tabbedPane.addTab(PANEL_NAMES[0], homepage_panel);

        JPanel display_staff_panel = new JPanel();
        display_staff_panel.add(new JLabel(PANEL_NAMES[1]));
        tabbedPane.addTab(PANEL_NAMES[1], display_staff_panel);

        JPanel add_staff_panel = new JPanel();
        add_staff_panel.add(new JLabel(PANEL_NAMES[2]));
        tabbedPane.addTab(PANEL_NAMES[2], add_staff_panel);

        JPanel remove_staff_panel = new JPanel();
        add_staff_panel.add(new JLabel(PANEL_NAMES[3]));
        tabbedPane.addTab(PANEL_NAMES[3], remove_staff_panel);

        JPanel edit_staff_panel = new JPanel();
        add_staff_panel.add(new JLabel(PANEL_NAMES[4]));
        tabbedPane.addTab(PANEL_NAMES[4], edit_staff_panel);
    }
}

