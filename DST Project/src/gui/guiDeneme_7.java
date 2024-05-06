package src.gui;

import javax.swing.*;
import java.awt.*;

public class guiDeneme_7 {
    public static void main(String[] args) {

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane(); // JLayeredPane is a Swing container that provides a third dimension for positioning components
        layeredPane.setBounds(0, 0, 500, 500);

//        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);


        frame.setVisible(true);

    }
}
