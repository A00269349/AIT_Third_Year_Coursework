import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

public class A3_Controller_CarDetails implements ActionListener, WindowListener
{
    private final A3_View_CarDetails gui_view;
    CarListsInterface carInterface;
    CarLists cars = new CarLists();
    private int id;

    public A3_Controller_CarDetails(ArrayList<Car> carArrayList, CarListsInterface carInterface) throws RemoteException {
        cars.cars = carArrayList;
        this.carInterface = carInterface;
        gui_view = new A3_View_CarDetails();
        try {
            int size = carInterface.getListSize();
            id = (size > 0) ? size : 0;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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
    private void add_to_car() throws RemoteException {
        /* ADDS TO THE MODEL BY GETTING THE DATA IN THE TEXT FIELD */
        String make = gui_view.getMake_field().getText();
        String series = gui_view.getSeries_field().getText();
        if (make.isEmpty()) {make = "N/A";}
        if (series.isEmpty()) {series = "N/A";}
        Car c = new Car(id, make, series, gui_view.getCountries_comboBox().getSelectedItem().toString(), gui_view.getPower_type_comboBox().getSelectedItem().toString(),
                Integer.parseInt(gui_view.getYear_comboBox().getSelectedItem().toString()), Integer.parseInt(gui_view.getDoors_comboBox().getSelectedItem().toString()));

        // cars.add(c);
        cars.addToList(c);
        add_car_to_table(c);
        id++;
    }

    public void add_car_to_table(CarInterface car) throws RemoteException {
        gui_view.getDefault_table_model().addRow(car.getData());
    }

    //  REMOVE
    private void remove_from_car(int i) throws RemoteException {
/*        for (int j = 0; j < cars.size() - 1; j++) {
            if (cars.get(j).getId() == i) {
                cars.remove(j);
                carInterface.removeFromList(j);
                remove_car_from_table(j);
            }
        }  */
        for (int j = 0; j < cars.getListSize() - 1; j++) {
            if (cars.getIndex(j).getId() == i) {
                cars.removeFromList(j);
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
        //for (int j = 0; j < cars.size() - 1; j++) {
        for (int j = 0; j < cars.getListSize() - 1; j++) {
            //if (cars.get(j).getId() == i) {
            if (cars.getIndex(j).getId() == i) {
                //cars.set(j, c);
                cars.setList(c, j);
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
            try {
                remove_from_car(Integer.parseInt(gui_view.getId_field().getText()));
            }
            catch (RemoteException e) {
                e.printStackTrace();
            }
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

    @Override
    public void windowOpened(WindowEvent windowEvent) {
        for (CarInterface car : cars.cars) {
            try {
                add_car_to_table(car);
                System.out.println(car);
                System.out.println(Arrays.toString(car.getData()));
            }
            catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        try {

            FileOutputStream fileOut = new FileOutputStream("cars.set");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cars);
            objectOut.close();
            Naming.rebind("DeserializedCars", cars);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
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
