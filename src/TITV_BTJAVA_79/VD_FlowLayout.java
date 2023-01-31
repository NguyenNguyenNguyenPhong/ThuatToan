package TITV_BTJAVA_79;

import javax.swing.*;
import java.awt.*;

public class VD_FlowLayout extends JFrame {
    public VD_FlowLayout(){
        this.setTitle("VD_FlowLayout");
        this.setSize(600, 400);

        // Căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // Set Layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER, 50, 50);

//        this.setLayout(flowLayout);
//        this.setLayout(flowLayout1);
        this.setLayout(flowLayout2);

        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");

        // add thành phần
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new VD_FlowLayout();
    }

}
