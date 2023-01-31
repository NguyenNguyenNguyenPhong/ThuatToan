package BaiTapJaVA;

import java.util.Arrays;
import java.util.Scanner;

//Viết chương trình Java nhập một mảng số nguyên a0,
// a1, a2, …, an-1. Hãy sắp xếp mảng theo thứ tự tăng dần,
// sau đó chèn phần tử k vào mà vẫn đảm bảo mảng là tăng dần.
public class Bai24 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        sortASC(arr);
        System.out.println(Arrays.toString(arr));

        insert(arr, k);


    }
    public static void sortASC(int [] arr){
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void insert(int [] arr, int k){
        int index = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] <= k && arr[i+1] > k )
                i = index;
            break;
        }
        int tempIndex = arr.length;

        for(int i = tempIndex-1; i >=index; i--){
            arr[i+1] = arr[i];
        }
        arr[index] = k;
        tempIndex += 1;

        System.out.println(Arrays.toString(arr));
    }

}
