package BaiTapJaVA;

import java.util.Scanner;

// Nhập một sâu ký tự. Đếm số từ của sâu đó (mỗi từ cách nhau bởi một khoảng trắng
// có thể là một hoặc nhiều dấu cách, tab, xuống dòng).
// Ví dụ " hoc java co ban den nang cao " có 7 từ.
public class Bai16 {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String input = sc.nextLine();
        System.out.println(solution(input));

    }
//Y tuong : Neu tim thay mot ki tu khac null thi danh dau da dem duoc mot tu

    public  static int solution(String input){
        if(input == null) return -1;

        int count = 0;
        int size = input.length();
        boolean notCounter = true; // Danh dau chua dem
        for(int i = 0; i < size; i++){
            if(input.charAt(i) != SPACE && input.charAt(i) != TAB &&
                    input.charAt(i) != BREAK_LINE ){
                if(notCounter){// neu tu do chua dem danh dau da dem
                    notCounter = false;
                    count++; // Tang bien dem len 1 moi khi dem duoc 1 tu
                }
            }else{
                notCounter = true;
            }
        }
        return count;
    }

}
