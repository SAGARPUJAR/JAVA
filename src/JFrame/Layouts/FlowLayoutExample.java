package JFrame.Layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    FlowLayoutExample(String name){
        super(name);
        Container c;
        c = getContentPane();
        FlowLayout flowLayout=new FlowLayout(FlowLayout.RIGHT,10,10);
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT,10,10);
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.CENTER,10,10);
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEADING,10,10);
//        FlowLayout flowLayout=new FlowLayout(FlowLayout.TRAILING,10,10);
        c.setLayout(flowLayout);

        JButton b1, b2, b3, b4;
        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        c.add(b1);c.add(b2);
        c.add(b3);c.add(b4);
    }
    public static void main(String[] args) {
        FlowLayoutExample layout=new FlowLayoutExample("Flow Layout");
        layout.setSize(500,500);
        layout.setVisible(true);
        layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
