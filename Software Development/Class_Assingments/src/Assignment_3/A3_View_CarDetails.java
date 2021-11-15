package Assignment_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;


public class A3_View_CarDetails extends JFrame {

    //  GENERAL SETUP
    private final String[] PANEL_NAMES = {"HOME", "DISPLAY", "ADD", "REMOVE", "EDIT"};
    private final JPanel display_car_panel = new JPanel();
    private final JPanel add_car_panel = new JPanel();
    private final JPanel remove_car_panel = new JPanel();
    private final JPanel edit_car_panel = new JPanel();
    JTabbedPane tabbedPane = new JTabbedPane();
    JFrame frame = new JFrame("CAR DETAILS");
    // ADD PANEL
    // BUTTONS
    String[] countries = {"Japan", "USA", "Germany", "Italy", "France", "N/A"};
    String[] year = {"2010", "2011", "2012", "2013", "2014", "N/A"};
    String[] doors = {"2", "4", "N/A"};
    String[] power_type = {"Petrol", "Diesel", "Hybrid (Diesel)", "Electric"};
    JLabel countries_label = new JLabel("COUNTRY");
    JLabel year_label = new JLabel("YEAR");
    JLabel doors_label = new JLabel("DOORS");
    JLabel power_type_label = new JLabel("POWER TYPE");
    JComboBox<String> countries_comboBox = new JComboBox<>(countries);
    JComboBox<String> year_comboBox = new JComboBox<>(year);
    JComboBox<String> doors_comboBox = new JComboBox<>(doors);
    JComboBox<String> power_type_comboBox = new JComboBox<>(power_type);
    JButton jButton = new JButton("ADD");


    // REMOVE
    private final JButton removeStudent = new JButton("REMOVE STUDENT");


    public A3_View_CarDetails() {
        this.setLayout(new BorderLayout());
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public void init() {
        create_tabs();
        create_display_car_panel();
        create_add_car_panel();
        create_remove_car_panel();
        create_edit_car_panel();

        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 350);
        frame.setVisible(true);
    }

    private void create_edit_car_panel() {

    }

    private void create_remove_car_panel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc;
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("REMOVE A CAR"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        gbc = create_grid_bag(0,0);
        panel.add(countries_label, gbc);
        gbc = create_grid_bag(1,0);
        panel.add(countries_comboBox, gbc);

        gbc = create_grid_bag(0,1);
        panel.add(year_label, gbc);
        gbc = create_grid_bag(1,1);
        panel.add(year_comboBox, gbc);

        gbc = create_grid_bag(0,2);
        panel.add(doors_label, gbc);
        gbc = create_grid_bag(1,2);
        panel.add(doors_comboBox, gbc);

        gbc = create_grid_bag(0,3);
        panel.add(power_type_label, gbc);
        gbc = create_grid_bag(1,3);
        panel.add(power_type_comboBox, gbc);

        gbc = create_grid_bag(1,4);
        panel.add(jButton, gbc);
        panel.setSize(500, 500);

        remove_car_panel.add(panel);
    }

    private void create_add_car_panel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("CREATE A NEW CAR"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        gbc = create_grid_bag(0,0);
        panel.add(countries_label, gbc);
        gbc = create_grid_bag(1,0);
        panel.add(countries_comboBox, gbc);

        gbc = create_grid_bag(0,1);
        panel.add(year_label, gbc);
        gbc = create_grid_bag(1,1);
        panel.add(year_comboBox, gbc);

        gbc = create_grid_bag(0,2);
        panel.add(doors_label, gbc);
        gbc = create_grid_bag(1,2);
        panel.add(doors_comboBox, gbc);

        gbc = create_grid_bag(0,3);
        panel.add(power_type_label, gbc);
        gbc = create_grid_bag(1,3);
        panel.add(power_type_comboBox, gbc);

        gbc = create_grid_bag(1,4);
        panel.add(jButton, gbc);
        panel.setSize(500, 500);

        add_car_panel.add(panel);
    }

    private void create_display_car_panel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("CREATE A NEW CAR"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        add_car_panel.add(panel);
    }


    private void create_tabs() {
        tabbedPane.addTab(PANEL_NAMES[1], display_car_panel);
        tabbedPane.addTab(PANEL_NAMES[2], add_car_panel);
        tabbedPane.addTab(PANEL_NAMES[3], remove_car_panel);
        tabbedPane.addTab(PANEL_NAMES[4], edit_car_panel);
    }
    private GridBagConstraints create_grid_bag(int x, int y) {
        Insets WEST_INSETS = new Insets(5, 0, 5, 5);
        Insets EAST_INSETS = new Insets(5, 5, 5, 0);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.anchor = (x == 0) ? GridBagConstraints.WEST : GridBagConstraints.EAST;
        gbc.fill = (x == 0) ? GridBagConstraints.BOTH : GridBagConstraints.HORIZONTAL;
        gbc.insets = (x == 0) ? WEST_INSETS : EAST_INSETS;
        gbc.weightx = (x == 0) ? 0.1 : 1.0;
        gbc.weighty = 1.0;
        return gbc;
    }

    public void setWindowsListener(WindowListener w) {
        this.addWindowListener(w);
    }
}
