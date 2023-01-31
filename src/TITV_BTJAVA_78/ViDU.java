package TITV_BTJAVA_78;

import javax.swing.*;

public class ViDU {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        // Gắn tên
        jf.setTitle("Vi Du JFrame");
        // Gán kích cỡ
        jf.setSize(600, 400);
        // Gắn vị trí hiển thị
        jf.setLocation(300, 300);
        // Thoát ra khỏi chương trình khi đóng cửa sổ JFram
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cho phép hiển thị
        jf.setVisible(true);
    }
}
