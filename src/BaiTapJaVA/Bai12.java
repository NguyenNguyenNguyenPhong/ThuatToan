package BaiTapJaVA;

import java.util.ArrayList;
import java.util.Scanner;

// In ra tong cac chu so cua mot so
public class Bai12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        solution(n);
    }

    public static void solution(int n){
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int sum = 0;
        while(n > 0){
            int temp = n%10;
            numberList.add(temp);
            n = n/10;
            sum+= temp;
        }
        for(int i = numberList.size()-1; i > 0; i--){
            System.out.print(numberList.get(i) + " + ");
        }
        System.out.print(numberList.get(0) + " = " + sum);
    }
}
