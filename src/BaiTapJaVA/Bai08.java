package BaiTapJaVA;

import java.util.Scanner;

// Liet ke so nguyen to nho hon n
public class Bai08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i = 2; i <= n; i++){
            if(IsPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean IsPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n > 2){
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}