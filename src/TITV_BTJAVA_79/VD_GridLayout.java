package TITV_BTJAVA_79;

import javax.swing.*;
import java.awt.*;

public class VD_GridLayout extends JFrame {
    public VD_GridLayout(){
        this.setTitle("VD_GridLayout");
        this.setSize(600, 400);

        // căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);

        // Set Layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout_2 = new GridLayout(4, 4);
        GridLayout gridLayout_3 = new GridLayout(4, 4, 25, 25);
        this.setLayout(gridLayout_3);

        for(int i = 0; i < 16; i++){
            JButton jButton = new JButton(i +"");
            this.add(jButton);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new VD_GridLayout();
    }
}
