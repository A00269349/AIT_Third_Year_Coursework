/**
 * @author Rafa
 * @version 16/11/2021/ - 08:57
 */

package Assignment_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;

class Testing
{
    String colNames[] = {"First Name", "Last Name","Position"};
    DefaultTableModel dtm = new DefaultTableModel(null,colNames);
    public void buildGUI()
    {
        java.util.List<Player> players = new java.util.ArrayList<Player>(java.util.Arrays.asList(
                new Player("Jim","Jones","Keeper"),new Player("Michael","Jackson","Winger"),
                new Player("Tiger","Woods","Striker"), new Player("Michael","Dunn","Left-right-out")));

        JTable table = new JTable(dtm);
        for(int x = 0, y = players.size(); x < y; x++)
        {
            addPlayer(players.get(x));
        }
        JScrollPane sp = new JScrollPane(table);
        JButton addPlayerBtn = new JButton("Add Player");

        final JFrame f = new JFrame("Players");
        f.getContentPane().add(sp);
        f.getContentPane().add(addPlayerBtn,BorderLayout.SOUTH);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        addPlayerBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JLabel[] labels = {new JLabel("First Name: "),new JLabel("Last Name: "),new JLabel("Position: ")};
                JTextField[] data = {new JTextField(5),new JTextField(5),new JTextField(5)};
                final int ROWS = 3;
                final int COLUMNS = 2;
                JPanel p = new JPanel(new GridLayout(ROWS,COLUMNS));
                for(int x = 0; x < ROWS; x++)
                {
                    p.add(labels[x]);
                    p.add(data[x]);
                }
                JOptionPane.showMessageDialog(f.getContentPane(),p);//needs error handling
                addPlayer(new Player(data[0].getText(),data[1].getText(),data[2].getText()));
            }
        });
    }
    public void addPlayer(Player player)
    {
        dtm.addRow(player.getData());
    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Testing().buildGUI();
            }
        });
    }
}
class Player
{
    String firstName;
    String lastName;
    String position;
    public Player(String fn, String ln, String p)
    {
        firstName = fn; lastName = ln; position = p;
    }
    public String[] getData()
    {
        return new String[]{firstName,lastName,position};
    }
}