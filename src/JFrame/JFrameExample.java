package JFrame;

import javax.swing.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Frame");
        jFrame.setSize(200,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
}
