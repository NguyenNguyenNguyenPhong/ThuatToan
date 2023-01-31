package BaiTapJaVA;


//Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, nằm trong đoạn 10 và 200 (tính cả 10 và 200). Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
public class Bai01 {
    public static void main(String[] args) {
        for (int i = 10; i < 201; i++) {
            if ((i % 7 == 0) && (i % 5 != 0)) {
                System.out.println(i + ", ");
            }
        }
    }
}



