package Assignment_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class A3_Controller_CarDetails implements ActionListener, WindowListener
{
    private final A3_View_CarDetails gui_view;
    private final ArrayList<Car> cars;
    private int id = 0;
    public A3_Controller_CarDetails() {
        cars = new ArrayList<>();
        gui_view = new A3_View_CarDetails();

        gui_view.init();
        gui_view.setWindowsListener(this);
        gui_view.getSeries_field().addActionListener(this);
        gui_view.getMake_field().addActionListener(this);
        gui_view.getCountries_comboBox().addActionListener(this);
        gui_view.getYear_comboBox().addActionListener(this);
        gui_view.getDoors_comboBox().addActionListener(this);
        gui_view.getPower_type_comboBox().addActionListener(this);
        gui_view.getAdd_button().addActionListener(this);
    }

    /* ADD */
    private void add_to_car() {
        /* ADDS TO THE MODEL BY GETTING THE DATA IN THE TEXT FIELD */
        String make = gui_view.getMake_field().getText();
        String series = gui_view.getSeries_field().getText();

        if (make.isEmpty()) { make = "N/A"; }
        if (series.isEmpty()) { series = "N/A"; }

        id++;

        Car c = new Car(
                id,
                make,
                series,
                gui_view.getCountries_comboBox().getSelectedItem().toString(),
                gui_view.getPower_type_comboBox().getSelectedItem().toString(),
                Integer.parseInt(gui_view.getYear_comboBox().getSelectedItem().toString()),
                Integer.parseInt(gui_view.getDoors_comboBox().getSelectedItem().toString()));

        cars.add(c);
        add_car_to_table(c);
    }
    public void add_car_to_table(Car car) {
        gui_view.getDefault_table_model().addRow(car.getData());
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == gui_view.getAdd_button()) {
            add_to_car();
            System.out.println("ADD BUTTON HAS BEEN CLICKED");
        }
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }
}
