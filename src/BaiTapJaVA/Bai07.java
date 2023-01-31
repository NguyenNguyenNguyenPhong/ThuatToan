package BaiTapJaVA;
import java.util.Scanner;

// Tim UCLN, BNNN
public class Bai07 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(UCLN(a,b));
        System.out.println(BNNN(a,b));
    }

    public static int UCLN(int a, int b){
        if(b == 0) return a;
        return  UCLN(b, a%b);
    }
    public static int BNNN(int a, int b){
        int c = a*b;
        return c / UCLN(a,b);
    }
}
