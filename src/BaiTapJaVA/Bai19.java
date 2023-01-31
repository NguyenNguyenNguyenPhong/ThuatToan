package BaiTapJaVA;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


// Liet ke cac phan u xuat hien dung mot lan trong Mang
// Su dung TreeMap
public class Bai19 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solution();
    }

    // Thêm phần tử vào Map
    public static void addElement(Map<Integer, Integer> map, int element){
        if(map.containsKey(element)){
            int count = map.get(element) +1;
            map.put(element, count);
        }else {
            map.put(element,1);
        }
    }

    public static void solution(){
        int n = sc.nextInt();
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            numberList.add(temp);
        }

        // Tìm số lần suất hiện của các phần tử
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < n; i++){
            addElement(map, numberList.get(i));
        }

        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                System.out.print(key + " ");
            }
        }
    }
}
