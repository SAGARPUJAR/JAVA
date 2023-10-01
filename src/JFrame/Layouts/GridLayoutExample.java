package JFrame.Layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    GridLayoutExample(String name){
        super(name);
        Container c;
        c=getContentPane();
        GridLayout gridLayout=new GridLayout(2,3,50,50);
        JButton b1,b2,b3,b4,b5,b6;
        b1= new JButton("Button1");
        b2= new JButton("Button2");
        b3= new JButton("Button3");
        b4= new JButton("Button4");
        b5= new JButton("Button5");
        b6= new JButton("Button6");
        c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);c.add(b6);
        c.setLayout(gridLayout);
    }
    public static void main(String[] args) {
        GridLayoutExample layout=new GridLayoutExample("GridLayout");
        layout.setSize(500,500);
        layout.setVisible(true);
        layout.setDefaultCloseOperation(GridLayoutExample.EXIT_ON_CLOSE);
    }
}
