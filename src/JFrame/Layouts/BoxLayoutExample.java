package JFrame.Layouts;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    BoxLayoutExample(String name){
        super(name);
        Container c;
        c=getContentPane();
        c.setLayout(new FlowLayout());

        Panel1 panel1=new Panel1();
        c.add(panel1);
        Panel2 panel2=new Panel2();
        c.add(panel2);
    }
    public static void main(String[] args) {
        BoxLayoutExample layout=new BoxLayoutExample("Box Layout");
        layout.setSize(500,500);
        layout.setVisible(true);
        layout.setDefaultCloseOperation(BoxLayoutExample.EXIT_ON_CLOSE);
    }
}
