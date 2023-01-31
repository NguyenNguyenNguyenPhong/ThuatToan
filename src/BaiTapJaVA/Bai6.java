package BaiTapJaVA;

import java.util.Scanner;
// In ra n so Fibonaci dau tien
public class Bai6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            System.out.println(Fibonacci(i));
        }
    }

    public static int Fibonacci(int n){
        if(n < 0) return -1;
        if(n == 0 || n == 1) return n;
        else return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
