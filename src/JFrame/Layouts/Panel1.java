package JFrame.Layouts;

import javax.swing.*;

public class Panel1 extends JPanel {
    Panel1(){
        BoxLayout box=new BoxLayout(this,BoxLayout.X_AXIS);
        setLayout(box);

        JButton b1,b2,b3;
        b1=new JButton("BUtton1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        add(b1);add(b2);add(b3);
    }

}
