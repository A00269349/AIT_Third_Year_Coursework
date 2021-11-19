package Assignment_3;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowListener;

public class A3_View_CarDetails extends JFrame {
    //  TABBED PANELS
    private final String[] PANEL_NAMES = {"HOME", "DISPLAY", "ADD", "REMOVE", "EDIT"};
    private final JPanel display_car_panel = new JPanel();
    private final JPanel add_car_panel = new JPanel();
    private final JPanel remove_car_panel = new JPanel();
    private final JPanel edit_car_panel = new JPanel();
    private final JTabbedPane tabbedPane = new JTabbedPane();
    private final JFrame frame = new JFrame("CAR DETAILS");
    // DISPLAY CARS
    // TABLE DATA
    private final String[] column_names = {"ID", "MAKE", "SERIES", "POWER", "COUNTRY", "YEAR", "DOORS"};
    private final DefaultTableModel default_table_model = new DefaultTableModel(null, column_names);
    private final JTable table = new JTable(default_table_model);
    // ADD PANEL
    // COMBO BOX DATA
    private final String[] countries = {"Japan", "USA", "Germany", "Italy", "France", "N/A"};
    private final String[] year = {"2010", "2011", "2012", "2013", "2014", "N/A"};
    private final String[] doors = {"2", "4", "N/A"};
    private final String[] power_type = {"Petrol", "Diesel", "Hybrid (Diesel)", "Electric"};
    // TEXT FIELDS
    private final JTextField series_field = new JTextField();
    private final JTextField make_field = new JTextField();
    // LABELS
    private final JLabel countries_label = new JLabel("COUNTRY");
    private final JLabel year_label = new JLabel("YEAR");
    private final JLabel doors_label = new JLabel("DOORS");
    private final JLabel power_type_label = new JLabel("POWER TYPE");
    private final JLabel make_label = new JLabel("MAKE");
    private final JLabel series_label = new JLabel("SERIES");
    // COMBO BOXES
    private final JComboBox<String> countries_comboBox = new JComboBox<>(countries);
    private final JComboBox<String> year_comboBox = new JComboBox<>(year);
    private final JComboBox<String> doors_comboBox = new JComboBox<>(doors);
    private final JComboBox<String> power_type_comboBox = new JComboBox<>(power_type);
    // BUTTONS
    JButton add_button = new JButton("ADD");
    // REMOVE PANEL
    // TEXT FIELDS
    private final JTextField id_field = new JTextField(10);
    // LABELS
    private final JLabel id_label = new JLabel("ID NUMBER");
    // COMBO BOXES
    // BUTTONS
    JButton remove_button = new JButton("REMOVE");
    // EDIT PANEL

    // TEXT FIELDS
    private final JTextField e_series_field = new JTextField();
    private final JTextField e_make_field = new JTextField();
    private final JTextField e_id_field = new JTextField();
    // LABELS
    private final JLabel e_id_label = new JLabel("ID NUMBER");
    private final JLabel e_countries_label = new JLabel("COUNTRY");
    private final JLabel e_year_label = new JLabel("YEAR");
    private final JLabel e_doors_label = new JLabel("DOORS");
    private final JLabel e_power_type_label = new JLabel("POWER TYPE");
    private final JLabel e_make_label = new JLabel("MAKE");
    private final JLabel e_series_label = new JLabel("SERIES");
    // COMBO BOXES
    private final JComboBox<String> e_countries_comboBox = new JComboBox<>(countries);
    private final JComboBox<String> e_year_comboBox = new JComboBox<>(year);
    private final JComboBox<String> e_doors_comboBox = new JComboBox<>(doors);
    private final JComboBox<String> e_power_type_comboBox = new JComboBox<>(power_type);
    // BUTTONS
    JButton edit_button = new JButton("EDIT");

    public A3_View_CarDetails() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        create_tabs();
        create_display_car_panel();
        create_add_car_panel();
        create_edit_car_panel();
        create_remove_car_panel();
        frame.add(tabbedPane);
        frame.setSize(750, 750);
        frame.setVisible(true);
    }

    //  CREATE PANELS
    private void create_tabs() {
        tabbedPane.addTab(PANEL_NAMES[1], display_car_panel);
        tabbedPane.addTab(PANEL_NAMES[2], add_car_panel);
        tabbedPane.addTab(PANEL_NAMES[3], remove_car_panel);
        tabbedPane.addTab(PANEL_NAMES[4], edit_car_panel);
    }

    private void create_display_car_panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 0));
        JScrollPane scrollPane = new JScrollPane(table);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(String.class, centerRenderer);

        for (int columnIndex = 0; columnIndex < table.getColumnCount(); columnIndex++) {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
        }

        table.setPreferredScrollableViewportSize(new Dimension(700, 600));
        table.setFillsViewportHeight(true);

        panel.add(scrollPane);
        display_car_panel.add(panel);
    }

    private void create_add_car_panel() {
        JPanel panel = new JPanel();

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc;

        Border TITLE_HEADING = BorderFactory.createTitledBorder("CREATE A NEW CAR");
        Border INSETS_ = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createCompoundBorder(TITLE_HEADING, INSETS_));

        add_to_grid_bag(panel, 0, countries_label, countries_comboBox);
        add_to_grid_bag(panel, 1, year_label, year_comboBox);
        add_to_grid_bag(panel, 2, doors_label, doors_comboBox);
        add_to_grid_bag(panel, 3, power_type_label, power_type_comboBox);

        add_to_grid_bag(panel, 5, make_label, make_field);
        add_to_grid_bag(panel, 6, series_label, series_field);

        gbc = create_grid_bag(0, 8);
        gbc.ipady = 20;
        gbc.gridwidth = 2;
        panel.add(add_button, gbc);
        add_car_panel.add(panel);
    }

    private void create_edit_car_panel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc;
        Border TITLE_HEADING = BorderFactory.createTitledBorder("EDIT A CAR");
        Border INSETS = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createCompoundBorder(TITLE_HEADING, INSETS));

        add_to_grid_bag(panel, 0, e_id_label, e_id_field);
        add_to_grid_bag(panel, 1, e_countries_label, e_countries_comboBox);
        add_to_grid_bag(panel, 2, e_year_label, e_year_comboBox);
        add_to_grid_bag(panel, 3, e_doors_label, e_doors_comboBox);
        add_to_grid_bag(panel, 4, e_power_type_label, e_power_type_comboBox);

        add_to_grid_bag(panel, 5, e_make_label, e_make_field);
        add_to_grid_bag(panel, 6, e_series_label, e_series_field);

        gbc = create_grid_bag(0, 9);
        gbc.ipady = 20;
        gbc.gridwidth = 2;
        panel.add(edit_button, gbc);
        edit_car_panel.add(panel);
    }

    private void create_remove_car_panel() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc;
        Border TITLE_HEADING = BorderFactory.createTitledBorder("REMOVE A NEW CAR");
        Border INSETS = BorderFactory.createEmptyBorder(5, 5, 5, 5);

        panel.setSize(500, 500);
        panel.setLayout(layout);
        panel.setBorder(BorderFactory.createCompoundBorder(TITLE_HEADING, INSETS));

        add_to_grid_bag(panel, 0, id_label, id_field);

        gbc = create_grid_bag(0, 3);
        gbc.ipady = 20;
        gbc.gridwidth = 2;

        panel.add(remove_button, gbc);
        remove_car_panel.add(panel);
    }

    //  GRID BAG FUNCTIONS
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

    private void add_to_grid_bag(JPanel panel, int y, JLabel label, JComboBox<String> comboBox) {
        GridBagConstraints gbc;
        gbc = create_grid_bag(0, y);
        panel.add(label, gbc);
        gbc = create_grid_bag(1, y);
        panel.add(comboBox, gbc);
    }

    private void add_to_grid_bag(JPanel panel, int y, JLabel label, JTextField textField) {
        GridBagConstraints gbc;
        gbc = create_grid_bag(0, y);
        panel.add(label, gbc);
        gbc = create_grid_bag(1, y);
        panel.add(textField, gbc);
    }

    //  GETTERS / SETTERS
    public void setWindowsListener(WindowListener w) {
        this.addWindowListener(w);
    }

    public String[] getPANEL_NAMES() {return PANEL_NAMES;}

    public JPanel getDisplay_car_panel() {return display_car_panel;}

    public JPanel getAdd_car_panel() {return add_car_panel;}

    public JPanel getRemove_car_panel() {return remove_car_panel;}

    public JPanel getEdit_car_panel() {return edit_car_panel;}

    public JTabbedPane getTabbedPane() {return tabbedPane;}

    public JFrame getFrame() {return frame;}

    public String[] getColumn_names() {return column_names;}

    public DefaultTableModel getDefault_table_model() {return default_table_model;}

    public JTable getTable() {return table;}

    public String[] getCountries() {return countries;}

    public String[] getYear() {return year;}

    public String[] getDoors() {return doors;}

    public String[] getPower_type() {return power_type;}

    public JTextField getSeries_field() {return series_field;}

    public JTextField getMake_field() {return make_field;}

    public JLabel getCountries_label() {return countries_label;}

    public JLabel getYear_label() {return year_label;}

    public JLabel getDoors_label() {return doors_label;}

    public JLabel getPower_type_label() {return power_type_label;}

    public JLabel getMake_label() {return make_label;}

    public JLabel getSeries_label() {return series_label;}

    public JComboBox<String> getCountries_comboBox() {return countries_comboBox;}

    public JComboBox<String> getYear_comboBox() {return year_comboBox;}

    public JComboBox<String> getDoors_comboBox() {return doors_comboBox;}

    public JComboBox<String> getPower_type_comboBox() {return power_type_comboBox;}

    public JButton getAdd_button() {return add_button;}

    public JTextField getId_field() {return id_field;}

    public JLabel getId_label() {return id_label;}

    public JButton getRemove_button() {return remove_button;}

    public JTextField getE_series_field() {return e_series_field;}

    public JTextField getE_make_field() {return e_make_field;}

    public JTextField getE_id_field() {return e_id_field;}

    public JLabel getE_id_label() {return e_id_label;}

    public JLabel getE_countries_label() {return e_countries_label;}

    public JLabel getE_year_label() {return e_year_label;}

    public JLabel getE_doors_label() {return e_doors_label;}

    public JLabel getE_power_type_label() {return e_power_type_label;}

    public JLabel getE_make_label() {return e_make_label;}

    public JLabel getE_series_label() {return e_series_label;}

    public JComboBox<String> getE_countries_comboBox() {return e_countries_comboBox;}

    public JComboBox<String> getE_year_comboBox() {return e_year_comboBox;}

    public JComboBox<String> getE_doors_comboBox() {return e_doors_comboBox;}

    public JComboBox<String> getE_power_type_comboBox() {return e_power_type_comboBox;}

    public JButton getEdit_button() {return edit_button;}
}
