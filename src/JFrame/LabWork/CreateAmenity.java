package JFrame.LabWork;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;



public class CreateAmenity extends JFrame implements ActionListener {

    Container c;
    JLabel title, amenitylable, description, availableLable, res;
    JTextField amenityName;
    JTextArea amenityDescription, resadd, tout;
    JCheckBox isAvailable;
    JButton sub, reset;

    CreateAmenity(String name) {
        super(name);
        setBounds(300, 90, 900, 600);
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Add Amenity");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(400, 30);
        title.setLocation(300, 40);
        c.add(title);

        amenitylable = new JLabel("Amenity Name");
        amenitylable.setFont(new Font("Arial", Font.PLAIN, 15));
        amenitylable.setSize(100, 20);
        amenitylable.setLocation(100, 100);
        c.add(amenitylable);

        amenityName = new JTextField();
        amenityName.setFont(new Font("Arial", Font.PLAIN, 15));
        amenityName.setSize(190, 20);
        amenityName.setLocation(200, 100);
        c.add(amenityName);

        description = new JLabel("Description");
        description.setFont(new Font("Arial", Font.PLAIN, 15));
        description.setSize(100, 20);
        description.setLocation(100, 150);
        c.add(description);

        amenityDescription = new JTextArea(10, 10);
        amenityDescription.setFont(new Font("Arial", Font.PLAIN, 15));
        amenityDescription.setSize(150, 20);
        amenityDescription.setLocation(200, 150);
        c.add(amenityDescription);

        availableLable = new JLabel("isAvailable");
        availableLable.setFont(new Font("Arial", Font.PLAIN, 15));
        availableLable.setSize(100, 20);
        availableLable.setLocation(100, 200);
        c.add(availableLable);

        isAvailable = new JCheckBox("isAvailable");
        isAvailable.setFont(new Font("Arial", Font.PLAIN, 15));
        isAvailable.setSelected(false);
        isAvailable.setSize(75, 20);
        isAvailable.setLocation(200, 200);
        c.add(isAvailable);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
        c.add(res);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        c.add(resadd);


    }

    public static void main(String[] args) {
        CreateAmenity frame = new CreateAmenity("Create Amenity");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(CreateAmenity.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            String finalResult = "\n Amenity Name : " + amenityName.getText() + "\nAmenity Description : " + amenityDescription.getText() + "\nAmenity Available : " + (isAvailable.isSelected() ? "Available" : "Not Available");
            resadd.setText(finalResult);
            res.setText("Amenity Added Successfully and Saved to Json File !!");
            try {
                addDetailsToJSON();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            resetForm();

        } else {
            resetForm();
            resadd.setText("");
            res.setText("");
        }
    }

    public void resetForm() {
        amenityName.setText("");
        amenityDescription.setText("");
        isAvailable.setSelected(false);
    }

    public void addDetailsToJSON() throws IOException {
        JSONObject amneityObj = new JSONObject();
        amneityObj.put("Name", "Hotel");
        amneityObj.put("Author", "SAGAR");
        JSONArray amenityArray = new JSONArray();
        amenityArray.add("Amenity Name: "+amenityName.getText());
        amenityArray.add("Amenity Description :"+ amenityDescription.getText());
        amenityArray.add("isAvailable : " + (isAvailable.isSelected() ? "Available" : "Not Available"));
        amneityObj.put("AmenityList", amenityArray);
        FileWriter fw = new FileWriter(amenityName.getText()+".json",true);
        fw.write(amneityObj.toJSONString());
        fw.flush();
        fw.close();
    }
}