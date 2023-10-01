package JFrame.Layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    BorderLayoutExample(String name){
        super(name);
        Container c;
        c= getContentPane();
        JButton b1,b2,b3,b4,b5;
        b1= new JButton("Button1");
        b2= new JButton("Button2");
        b3= new JButton("Button3");
        b4= new JButton("Button4");
        b5= new JButton("Button5");
        c.add(b1,BorderLayout.EAST);
        c.add(b2,BorderLayout.CENTER);
        c.add(b3,BorderLayout.NORTH);
        c.add(b4,BorderLayout.SOUTH);
        c.add(b5,BorderLayout.WEST);
    }
    public static void main(String[] args) {
        BorderLayoutExample layout=new BorderLayoutExample("Border Layout");
        layout.setSize(500,500);
        layout.setVisible(true);
        layout.setDefaultCloseOperation(BorderLayoutExample.EXIT_ON_CLOSE);
    }
}
