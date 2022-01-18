package carRental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

public class Cars extends JFrame implements ActionListener {

    JComboBox select, choose, populate;

    Map<String, String[]> map=new TreeMap<String, String[]>();

    String[] type_cars = {"Select", "Car","Truck", "SUV"};
    String[] make_cars = {"Select","Chevrolet Cars", "Ford Cars", "Honda Cars"};
    String[] make_trucks = {"Select", "Chevrolet Trucks", "Ford Trucks", "Honda Trucks"};
    String[] make_suvs = {"Select", "Chevrolet SUVs", "Ford SUVs", "Honda SUVs"};
    String[] chevyCarModels = {"Select", "Cruise", "Volt", "Camaro"};
    String[] chevyTruckModels = {"Select", "Silverado", "Colorado"};
    String[] chevySUVModels = {"Select", "Trailblazer", "Equinox", "Tahoe"};
    String[] fordCarModels = {"Select", "Focus", "Taurus"};
    String[] fordTruckModels = {"Select", "F150", "F250"};
    String[] fordSUVModels = {"Select", "Explorer", "Escape", "Bronco"};
    String[] hondaCarModels = {"Select", "Civic", "Accord", "Insight"};
    String[] hondaTruckModels = {"Select", "Ridgeline"};
    String[] hondaSUVModels = {"Select", "Passport", "HR-V", "CR-V"};

    public Cars() {

        this.setLayout(new FlowLayout());

        //select = new JComboBox(type_cars);
        //select.addActionListener(this);
        //select.setEditable(true);
        //add(select);

        //map.put("Cars", make_cars);
        //map.put("Trucks", make_trucks);
        //map.put("SUVs", make_suvs);

        choose = new JComboBox(make_cars);
        choose.addActionListener(this);
        choose.setEditable(true);
        add(choose);

        map.put("Chevrolet Cars", chevyCarModels);
        map.put("Ford Cars", fordCarModels);
        map.put("Honda Cars", hondaCarModels);
        map.put("Chevrolet Trucks", chevyTruckModels);
        map.put("Ford Trucks", fordTruckModels);
        map.put("Honda Trucks", hondaTruckModels);
        map.put("Chevrolet SUVs", chevySUVModels);
        map.put("Ford SUVs", fordSUVModels);
        map.put("Honda SUVs", hondaSUVModels);

        populate = new JComboBox();
        populate.addActionListener(this);
        populate.setEditable(true);
        add(populate);


        //this.add(type_combo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(1250, 750);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //select = (JComboBox) e.getSource();
        //String thing = (String) select.getSelectedItem();

        //if(map.containsKey(thing)) {

        choose = (JComboBox) e.getSource();
            //choose.removeAllItems();
        String value = (String) choose.getSelectedItem();

        //for(String cho:map.get(thing)) {

            if(map.containsKey(value)) {
                populate.removeAllItems();

                for(String pop:map.get(value)) {
                    populate.addItem(pop);
                    //}
                }
            }

        }

}
