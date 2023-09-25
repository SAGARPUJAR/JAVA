package JFrame;

import javax.swing.*;
import java.awt.*;

public class JPanelExample extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvetica",Font.BOLD,34));
        g.drawString("SAGAR PUJAR",50,100);
    }
}
