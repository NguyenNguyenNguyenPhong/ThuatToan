package BaiTapJaVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Phan tich n ra thua so nguyen to
public class Bai11 {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        phanTich(n);
    }

    public static void phanTich(int n){
        int i = 2;
        ArrayList<Integer> listNumbers = new ArrayList<Integer>();
        while(n >0){
            if(n % i == 0) {
                n = n/i;
                listNumbers.add(i);
            }
            else i++;
        }

        int Size = listNumbers.size();
        for(int j = 0; j < Size -1; j++){
            if(j != Size -2 )
            {
                System.out.print(listNumbers.get(j) + "*");
            }else
                System.out.print(listNumbers.get(j));
        }
    }

}
