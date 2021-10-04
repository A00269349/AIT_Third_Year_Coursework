import javax.swing.*;

public class EmployeeView extends JFrame {
    public void showDetails(String name, int id) {

        JLabel namelabel = new JLabel(name);
        JLabel idlabel = new JLabel(Integer.toString(id));

        JPanel panel = new JPanel();
        panel.add(namelabel);
        panel.add(idlabel);

        getContentPane().add(panel);
        setSize(200, 200);
        pack();
        setVisible(true);

    }

    public void printDetails(String name, int id) {
        System.out.println("---------------------------------- DEBUG VIEWS ---");
        System.out.println("--- NAME -----------------------------------------");
        System.out.println("   " + name);
        System.out.println("--- ID -------------------------------------------");
        System.out.println("   " + id);
        System.out.println("--------------------------------------------------");
    }
}
