package JFrame.JFrameAssignment;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JForm extends JFrame implements ActionListener, ItemListener {

    Container c;
    JTextField email;
    JTextArea address;
    JRadioButton male,female;
    ButtonGroup option;
    JCheckBox saveInfo;
    JButton submit,clear;
    JLabel user,pass;

//    Newly Added Swing Component
    JPasswordField password;
    JComboBox country;
    JTable userDetails;
    String countries []={"India","USA","England","Japan","Australia"};
    String users[][]={
            {"001","SAGAR PUJAR","55000"},
            {"002","ABC","60000"},
            {"003","XYZ","65000"},
            {"004","KLM","70000"}
    };
    String columns []={"Id","Name","Salary"};

    JPanel panel;
    JButton panelBtn;

    JToggleButton jtb;

    JFileChooser jFileChooser;

    JButton openDialog;
    JForm(String name){
        super(name);
        c=getContentPane();
        c.setLayout(new FlowLayout());
        email = new JTextField(15);
        email.setBounds(130,100,100, 40);
        password = new JPasswordField(15);
        address = new JTextArea(2,5);
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        saveInfo = new JCheckBox("Save Info");
        option = new ButtonGroup();
        option.add(male);option.add(female);
        submit = new JButton("Submit");
        submit.addActionListener(this);
        clear =new JButton("Clear");
        clear.addActionListener(this);
        country = new JComboBox(countries);
        userDetails =new JTable(users,columns);
        panel = new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setBackground(Color.red);
        panelBtn = new JButton("Panel Button");
        panelBtn.setBackground(Color.gray);
        jtb = new JToggleButton("ON");
        jtb.addItemListener(this);
        panel.add(panelBtn);
        openDialog = new JButton("Choose File");
        openDialog.addActionListener(this);
        c.add(email);c.add(password);c.add(address);c.add(male);c.add(female);c.add(country);c.add(saveInfo);c.add(submit);c.add(clear);c.add(userDetails);
        c.add(panel);c.add(jtb);c.add(openDialog);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")){
            System.out.println("User Name : "+email.getText() +"\nPassword : "+password.getText()+"\nAddress : "+address.getText()+"\nGender : "+(male.isSelected() ? "Male" : "Female") +"\nIsSaveInfo : "+(saveInfo.isSelected() ?"Saved" :"Not Saved")+
                    "\nCountry : "+country.getItemAt(country.getSelectedIndex()));
        }else if(e.getActionCommand().equals("Choose File")){
//            jFileChooser = new JFileChooser();
//            jFileChooser = new JFileChooser(FileSystemView.getFileSystemView());
              jFileChooser = new JFileChooser("d:", FileSystemView.getFileSystemView());
              jFileChooser.showSaveDialog(null);
        }
    }
    public void itemStateChanged(ItemEvent eve) {
        if (jtb.isSelected())
            jtb.setText("OFF");
        else
            jtb.setText("ON");
    }

    public static void main(String[] args) {
        JForm form=new JForm("FormAssignment");
        form.setSize(200,300);
        form.setVisible(true);
        form.setDefaultCloseOperation(JForm.EXIT_ON_CLOSE);
    }
}