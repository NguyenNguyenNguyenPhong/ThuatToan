package BaiTapJaVA;

import java.util.ArrayList;
import java.util.Scanner;

// Kiem tra n cos phai so thuan nghich hay khong
public class Bai13 {
    static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc .nextLong();
        if(solution(n)) System.out.println(true);
        else System.out.println(false);
    }

    public static boolean solution(long n){
        String numberStr = String.valueOf(n);
        int numberSize = numberStr.length();
        for(int i = 0; i < numberSize/2; i++){
            if(numberStr.charAt(i) != numberStr.charAt(numberSize-1-i)) return false;
        }
        return true;
    }
}
