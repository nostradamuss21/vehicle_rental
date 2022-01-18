package carRental;

import javax.swing.*;
import java.awt.*;

public class Cars {
    JFrame frame = new JFrame("Cars");
    public static JPanel panel;
    public JButton rent;
    public JList<String> players_list;
    public static JScrollPane cars_type;
    public static JScrollPane cars_make;
    public static JScrollPane cars_model;
    private static int daysToRent;

    public Cars() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.setSize(1250, 750);
        frame.setVisible(true);

        panel = new JPanel();

        cars_type = new JScrollPane();
        cars_type.setPreferredSize(new Dimension(250, 700));
        cars_type = new JList<String>(type);
        type.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cars_type = new JScrollPane(players_list);

        cars_make = new JScrollPane();
        cars_make.setPreferredSize(new Dimension(250, 700));

        cars_model = new JScrollPane();
        cars_model.setPreferredSize(new Dimension(250, 700));

        panel.add(cars_type);
        panel.add(cars_make);
        panel.add(cars_model);
        frame.add(panel);

        String[] finalValues = type;
        players_list.addListSelectionListener(le -> {           // valueChanged is method.... ListSelectionEvent is object

            int index = players_list.getSelectedIndex();

            if (index != -1)
                cars_make.setText("You have selected " + finalValues[index] + "Your selection is " + availability);

        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                new Cars();




            }
        });
    }
}
