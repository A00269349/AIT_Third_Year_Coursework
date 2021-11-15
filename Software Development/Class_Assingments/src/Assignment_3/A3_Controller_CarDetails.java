package Assignment_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class A3_Controller_CarDetails implements ActionListener, WindowListener
{
    private final A3_View_CarDetails gui_view;
    private final ArrayList<Car> carModels;

    public A3_Controller_CarDetails() {
        carModels = new ArrayList<>();
        gui_view = new A3_View_CarDetails();

        gui_view.init();
        gui_view.setWindowsListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {

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
