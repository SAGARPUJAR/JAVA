package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrameExamplePanel extends JFrame {
    Container c;
    Container container;
    JFrameExamplePanel(String name){
        super(name);
        container=getContentPane();
        JPanelExample jPanelExample=new JPanelExample();
        container.add(jPanelExample);
    }

    public static void main(String[] args) {
        JFrameExamplePanel jFrame = new JFrameExamplePanel("JFrame Panel");
        jFrame.setSize(200,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
}
