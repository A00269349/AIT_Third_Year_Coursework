import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class A3_Controller_CarDetails implements ActionListener, WindowListener
{
    private final A3_View_CarDetails gui_view;
    public ArrayList<Car> cars;
    private int id = 0;

    public A3_Controller_CarDetails(ArrayList<Car> arraylist_car) throws RemoteException {
        cars = arraylist_car;
        gui_view = new A3_View_CarDetails();

        gui_view.init();

        gui_view.setWindowsListener(this);
        gui_view.getFrame().addWindowListener(this);

        gui_view.getSeries_field().addActionListener(this);
        gui_view.getMake_field().addActionListener(this);
        gui_view.getCountries_comboBox().addActionListener(this);
        gui_view.getYear_comboBox().addActionListener(this);
        gui_view.getDoors_comboBox().addActionListener(this);
        gui_view.getPower_type_comboBox().addActionListener(this);
        gui_view.getAdd_button().addActionListener(this);
        gui_view.getRemove_button().addActionListener(this);
        gui_view.getEdit_button().addActionListener(this);
    }

    //  ADD
    private void add_to_car() throws RemoteException  {
        /* ADDS TO THE MODEL BY GETTING THE DATA IN THE TEXT FIELD */
        String make = gui_view.getMake_field().getText();
        String series = gui_view.getSeries_field().getText();
        if (make.isEmpty()) {make = "N/A";}
        if (series.isEmpty()) {series = "N/A";}
        Car c = new Car(id, make, series, gui_view.getCountries_comboBox().getSelectedItem().toString(), gui_view.getPower_type_comboBox().getSelectedItem().toString(),
                Integer.parseInt(gui_view.getYear_comboBox().getSelectedItem().toString()), Integer.parseInt(gui_view.getDoors_comboBox().getSelectedItem().toString()));
        cars.add(c);
        add_car_to_table(c);
        id++;
    }

    public void add_car_to_table(Car car) {
        gui_view.getDefault_table_model().addRow(car.getData());
    }

    //  REMOVE
    private void remove_from_car(int i) {
        for (int j = 0; j < cars.size() - 1; j++) {
            if (cars.get(j).getId() == i) {
                cars.remove(j);
                remove_car_from_table(j);
            }
        }
    }

    private void remove_car_from_table(int i) {gui_view.getDefault_table_model().removeRow(i);}

    //  EDIT
    private void edit_from_car(int i) throws RemoteException {
        String make = gui_view.getE_make_field().getText();
        String series = gui_view.getE_series_field().getText();
        if (make.isEmpty()) {make = "N/A";}
        if (series.isEmpty()) {series = "N/A";}
        Car c = new Car(Integer.parseInt(gui_view.getE_id_field().getText()), make, series, gui_view.getE_countries_comboBox().getSelectedItem().toString(),
                gui_view.getE_power_type_comboBox().getSelectedItem().toString(), Integer.parseInt(gui_view.getE_year_comboBox().getSelectedItem().toString()),
                Integer.parseInt(gui_view.getE_doors_comboBox().getSelectedItem().toString()));
        for (int j = 0; j < cars.size() - 1; j++) {
            if (cars.get(j).getId() == i) {
                cars.set(j, c);
                gui_view.getDefault_table_model().setValueAt(make, j, 1);
                gui_view.getDefault_table_model().setValueAt(series, j, 2);
                gui_view.getDefault_table_model().setValueAt(gui_view.getE_countries_comboBox().getSelectedItem().toString(), j, 4);
                gui_view.getDefault_table_model().setValueAt(gui_view.getE_power_type_comboBox().getSelectedItem().toString(), j, 3);
                gui_view.getDefault_table_model().setValueAt(Integer.parseInt(gui_view.getE_doors_comboBox().getSelectedItem().toString()), j, 6);
                gui_view.getDefault_table_model().setValueAt(Integer.parseInt(gui_view.getE_year_comboBox().getSelectedItem().toString()), j, 5);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == gui_view.getAdd_button()) {
            try {
                add_to_car();
            }
            catch (RemoteException e) {
                e.printStackTrace();
            }
            System.out.println("A BUTTON HAS BEEN CLICKED");
        }
        if (actionEvent.getSource() == gui_view.getRemove_button()) {
            remove_from_car(Integer.parseInt(gui_view.getId_field().getText()));
            System.out.println("REMOVE BUTTON HAS BEEN CLICKED");
        }
        if (actionEvent.getSource() == gui_view.getEdit_button()) {
            try {
                edit_from_car(Integer.parseInt(gui_view.getE_id_field().getText()));
            }
            catch (RemoteException e) {
                e.printStackTrace();
            }
            System.out.println("EDIT BUTTON HAS BEEN CLICKED");
        }
    }

    private void ExecuteSerialization() throws IOException {
        FileOutputStream fileOut = new FileOutputStream("CarsSet.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        SerializeMembers(cars, objectOut);
        objectOut.close();
    }

    private void ExecuteDeserialization() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("CarsSet.txt");
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        DeserializeMembers(cars, objectIn);
        objectIn.close();
    }

    private static void SerializeMembers(ArrayList<Car> cars, ObjectOutputStream objectOut) throws IOException {
        objectOut.writeObject(cars);
    }
    private void DeserializeMembers(ArrayList<Car> cars, ObjectInputStream objectIn) throws IOException, ClassNotFoundException {
        for (Car car : cars)
            add_car_to_table(car);
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        try {
            ExecuteDeserialization();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {
            ExecuteSerialization();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
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
