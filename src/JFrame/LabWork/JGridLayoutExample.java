package JFrame.LabWork;

import javax.swing.*;
import java.awt.*;

public class JGridLayoutExample extends JFrame {

    JGridLayoutExample(String name) {
        super(name);
        Container c;
        c = getContentPane();
        c.setLayout(new GridLayout(9, 1, 20, 50));
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
    }

    public static void main(String[] args) {
        JGridLayoutExample gridLayout = new JGridLayoutExample("Gri Layout");
        gridLayout.setVisible(true);
        gridLayout.setSize(400, 500);
        gridLayout.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
