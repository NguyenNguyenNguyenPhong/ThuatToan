package BaiTapJaVA;

import java.util.*;

public class Bai26 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int a, b;
        a= sc.nextInt();
        b = sc.nextInt();
        for(int i = 0; i <a; i++){
            int temp = sc.nextInt();
            numList.add(temp);
        }

        for(int i = 0; i <b; i++){
            int temp = sc.nextInt();
           numList.add(temp);
        }

        Collections.sort(numList);
        System.out.println(numList);
    }
}
