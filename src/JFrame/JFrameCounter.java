package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameCounter extends JFrame implements ActionListener {
    Container container;
    JButton increase,decease;
    JLabel labelValue;
    int count=0;

    JFrameCounter(String name){
        super(name);
        container = getContentPane();
        container.setLayout(new FlowLayout());
        increase =new JButton("+");
        decease =  new JButton("-");
        labelValue = new JLabel("0");
        increase.addActionListener(this);
        decease.addActionListener(this);
        container.add(increase);container.add(decease);container.add(labelValue);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("+")){
                count ++;
                labelValue.setText(String.valueOf(count));
            }else{
                if (count !=0 ){
                    count --;
                    labelValue.setText(String.valueOf(count));
                }
            }
    }

    public static void main(String[] args) {
        JFrameCounter counter=new JFrameCounter("My Frame Counter");
        counter.setSize(200,300);
        counter.setVisible(true);
        counter.setDefaultCloseOperation(JFrameCounter.EXIT_ON_CLOSE);
    }
}
