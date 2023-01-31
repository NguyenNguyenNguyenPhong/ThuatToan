package BaiTapJaVA;

import java.util.Scanner;

//Giai phuong trinh ax^2 + bx + x = 0
public class Bai04 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       float a = sc.nextFloat();
       float b = sc.nextFloat();
       float c = sc.nextFloat();
       giaiPTBac2(a, b,c);

    }

    public static void giaiPTBac2(float a, float b, float c){
        if(a == 0){
            if(b == 0){
                System.out.println("Phuong trinh vo nghiem");
            }else {
                System.out.println("Phuong trinh co mot nghiem: " + "x = " + (-c/b));
            }
            return;
        }

        float delta = b*b -4*a*c;
        float x1, x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
