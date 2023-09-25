package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JForm extends JFrame implements ActionListener {

    Container c;
    JTextArea address;
    JTextField username,password;
    JCheckBox saveInfo;
    ButtonGroup buttonGroup;
    JRadioButton male,female;
    JButton submit,clear;

    JForm(String name){
        super(name);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        username = new JTextField(15);
        password = new JTextField(15);
        address = new JTextArea(10,5);
        saveInfo = new JCheckBox("Save Info");
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        buttonGroup =new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);
        submit = new JButton("Submit");
        clear = new JButton("Clear");
        submit.addActionListener(this);
        clear.addActionListener(this);
        c.add(username);c.add(password);c.add(address);c.add(saveInfo);c.add(male);c.add(female);c.add(submit);c.add(clear);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Submit")){
                System.out.println("UserName : "+username.getText()+"\nPassword : "+password.getText()+"\nAddress : "+address.getText());
            }else{
                username.setText("");password.setText("");address.setText("");
            }
    }
    public static void main(String[] args) {
        JForm jForm=new JForm("My Form");
        jForm.setSize(200,200);
        jForm.setVisible(true);
        jForm.setDefaultCloseOperation(JForm.EXIT_ON_CLOSE);
    }
}
