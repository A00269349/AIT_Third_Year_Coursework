package Assignment_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;

public class GUI_View_CollegeApplication extends JFrame
{
    /* BUTTONS */
    /* STUDENT */
    private final JButton addStudent = new JButton("ADD STUDENT");
    private final JButton removeStudent = new JButton("REMOVE STUDENT");
    private final JButton addStaff = new JButton("ADD STAFF");
    private final JButton removeStaff = new JButton("REMOVE STAFF");
    private final JButton studentPrintButton = new JButton("PRINT STUDENT AREA");
    private final JButton staffPrintButton = new JButton("PRINT STAFF AREA");
    /* LABEL */
    /*STUDENT */
    private final JLabel studentFirstName = new JLabel("STUDENT FIRST NAME");
    private final JLabel studentLastName = new JLabel("STUDENT LAST NAME");
    private final JLabel studentDepartment = new JLabel("STUDENT DEPARTMENT");
    /* STAFF */
    private final JLabel staffFirstName = new JLabel("STAFF FIRST NAME");
    private final JLabel staffLastName = new JLabel("STAFF LAST NAME");
    private final JLabel staffDepartment = new JLabel("STAFF DEPARTMENT");
    /* PRINT */
    private final JLabel studentPrint = new JLabel("STAFF PRINT AREA");
    private final JLabel staffPrint = new JLabel("STUDENT PRINT AREA");
    /*STUDENT */
    private final JTextField studentFirstNameField = new JTextField();
    private final JTextField studentLastNameField = new JTextField();
    private final JTextField studentDepartmentField = new JTextField();
    /* STAFF */
    private final JTextField staffFirstNameField = new JTextField();
    private final JTextField staffLastNameField = new JTextField();
    private final JTextField staffDepartmentField = new JTextField();

    private final JTextArea studentPrintArea = new JTextArea();
    private final JTextArea staffPrintArea = new JTextArea();

    private final JPanel staffMenuPanel = new JPanel();
    private final JPanel studentMenuPanel = new JPanel();
    private final JPanel studentMainPanel = new JPanel();
    private final JPanel staffMainPanel = new JPanel();
    private final JPanel studentPrintPanel = new JPanel();
    private final JPanel staffPrintPanel = new JPanel();

    private final Container contentPane = this.getContentPane();

    public GUI_View_CollegeApplication() {
        this.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public void init() {
        /* STUDENT MENU AREA */
        studentMenuPanel.add(addStudent);
        studentMenuPanel.add(removeStudent);
        studentMenuPanel.add(studentPrintButton);
        /* STUDENT MAIN AREA */
        studentMainPanel.setLayout(new BoxLayout(studentMainPanel, BoxLayout.PAGE_AXIS));
        studentMainPanel.add(studentFirstName);
        studentMainPanel.add(studentFirstNameField);
        studentMainPanel.add(studentLastName);
        studentMainPanel.add(studentLastNameField);
        studentMainPanel.add(studentDepartment);
        studentMainPanel.add(studentDepartmentField);
        /* PRINT */
        studentPrintArea.setLayout(new BorderLayout());
        JScrollPane studentScroll = new JScrollPane(studentPrintArea);
        studentPrintPanel.add(studentPrint, BorderLayout.NORTH);
        studentPrintPanel.add(studentScroll, BorderLayout.CENTER);

        /* STAFF MENU AREA */
        staffMenuPanel.add(addStaff);
        staffMenuPanel.add(removeStaff);
        staffMenuPanel.add(staffPrintButton);
        /* STAFF MAIN AREA */
        staffMainPanel.setLayout(new BoxLayout(staffMainPanel, BoxLayout.PAGE_AXIS));
        staffMainPanel.add(staffFirstName);
        staffMainPanel.add(staffFirstNameField);
        staffMainPanel.add(staffLastName);
        staffMainPanel.add(staffLastNameField);
        staffMainPanel.add(staffDepartment);
        staffMainPanel.add(staffDepartmentField);
        /* PRINT */
        staffPrintArea.setLayout(new BorderLayout());
        JScrollPane staffScroll = new JScrollPane(staffPrintArea);
        staffPrintPanel.add(staffPrint, BorderLayout.NORTH);
        staffPrintPanel.add(staffScroll, BorderLayout.CENTER);

        contentPane.add(studentMenuPanel);
        contentPane.add(studentMainPanel);
        contentPane.add(studentPrintArea);

        contentPane.add(staffMenuPanel);
        contentPane.add(staffMainPanel);
        contentPane.add(staffPrintArea);

        this.setVisible(true);
    }

    public void setWindowsListener(WindowListener w) {
        this.addWindowListener(w);
    }
    public JButton getAddStudent() {
        return addStudent;
    }
    public JButton getRemoveStudent() {
        return removeStudent;
    }
    public JButton getAddStaff() {
        return addStaff;
    }
    public JButton getRemoveStaff() {
        return removeStaff;
    }
    public JButton getStaffPrintButton() {
        return staffPrintButton;
    }
    public JButton getStudentPrintButton() {
        return studentPrintButton;
    }
    public JTextField getStudentFirstNameField() {
        return studentFirstNameField;
    }
    public JTextField getStudentLastNameField() {
        return studentLastNameField;
    }
    public JTextField getStudentDepartmentField() {
        return studentDepartmentField;
    }
    public JTextField getStaffFirstNameField() {
        return staffFirstNameField;
    }
    public JTextField getStaffLastNameField() {
        return staffLastNameField;
    }
    public JTextField getStaffDepartmentField() {
        return staffDepartmentField;
    }
    public JTextArea getStudentPrintArea() {
        return studentPrintArea;
    }
    public JTextArea getStaffPrintArea() {
        return staffPrintArea;
    }
}
