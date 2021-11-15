//package Assignment_3;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//import java.io.File;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//
//public class GUI_Controller_CollegeApplication implements ActionListener, WindowListener
//{
//    private final GUI_View_CollegeApplication gui_view;
//    private final ArrayList<Staff> staffModels;
//
//    public GUI_Controller_CollegeApplication() {
//        staffModels = new ArrayList<>();
//        gui_view = new GUI_View_CollegeApplication();
//
//        gui_view.init();
//
//        gui_view.setWindowsListener(this);
//        gui_view.getAddStaff().addActionListener(this);
//        gui_view.getAddStudent().addActionListener(this);
//        gui_view.getRemoveStaff().addActionListener(this);
//        gui_view.getRemoveStudent().addActionListener(this);
//        gui_view.getStaffPrintButton().addActionListener(this);
//        gui_view.getStudentPrintButton().addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        /*IF THE USER CLICKS ON THE DESIRED BUTTON, THEN THE RESPECTIVE OPERATION WILL OCCUR*/
//        if (e.getSource() == gui_view.getAddStaff()) {
//            addToStaffModel();
//        }
//        else if (e.getSource() == gui_view.getRemoveStaff()) {
//            removeFromStaffModel();
//        }
//        else if (e.getSource() == gui_view.getStaffPrintButton()) {
//            printStaffModel();
//        }
//    }
//    /* ADD */
//    private void addToStaffModel() {
//        staffModels.add(new Staff(gui_view.getStaffFirstNameField().getText(), gui_view.getStaffLastNameField().getText(), gui_view.getStaffDepartmentField().getText()));
//    }
//    /* REMOVE */
//    private void removeFromStaffModel() {
//        int index = -1;
//        for (int i = 0; i < staffModels.size(); i++) {
//            if (staffModels.get(i).getFirstName().equals(gui_view.getStaffFirstNameField().getText())) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            staffModels.remove(index);
//        }
//    }
//    /* PRINT */
//    private void printStaffModel() {
//        StringBuilder text = new StringBuilder();
//        for (Staff m : staffModels) {
//            text.append(m).append("\n");
//        }
//        gui_view.getStaffPrintArea().setText(text.toString());
//    }
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//        System.out.println("WINDOW STARTED");
//    }
//    @Override
//    /* THIS HANDLES THE BACKUP FILE BY PRINTING OUT THE ARRAYLIST INTO A BACKUP FILE */ public void windowClosing(WindowEvent e) {
//        System.out.println("WINDOW CLOSING");
//        File f = new File("Lab10-A00269349/backup.txt");
//        try {
//            PrintWriter pw = new PrintWriter(f);
//            for (Staff m : staffModels) {
//                pw.println(m);
//            }
//            pw.close();
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//        System.exit(0);
//    }
//    @Override
//    public void windowClosed(WindowEvent e) {
//
//    }
//    @Override
//    public void windowIconified(WindowEvent e) {
//
//    }
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//
//    }
//    @Override
//    public void windowActivated(WindowEvent e) {
//
//    }
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//
//    }
//}
