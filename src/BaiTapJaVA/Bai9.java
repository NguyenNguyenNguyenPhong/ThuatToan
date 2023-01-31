package BaiTapJaVA;

import java.util.Scanner;
// Liet ke n so nguyen to dau tien
public class Bai9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int number = 0;
        int i = 2;
        while(number < n){
            if(IsPrime(i)){
                System.out.println(i);
                number++;
            }
            i++;
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
