package BaiTapJaVA;
import java.util.Scanner;
// Tinh n!
public class Bai02 {
    static Scanner sc = new Scanner(System.in);
    public  static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println(tinhGiaithua(n));
    }

    /**
     * If n is greater than 0, return n times the factorial of n minus 1. Otherwise, return 1
     *
     * @param n the number to calculate the factorial of
     */
    public  static long  tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
}
