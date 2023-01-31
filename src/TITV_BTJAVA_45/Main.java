package TITV_BTJAVA_45;

public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hãng 1", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Hãng 2", "USA");
        HangSanXuat h3 = new HangSanXuat("Hãng 3", "Nhật Bản");

        PhuongTienDiChuyen p1 = new XeOTo(h1, "Trường Hải");
        MayBay p2 = new MayBay(h2, "Xăng");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("Lấy hảng sản xuất");
        System.out.println("p1: "+ p1.layTenHangSanXuat());

        System.out.println("Bắt đầu: ");
        p2.batDau();

        System.out.println("Lấy vận tốc: ");
        System.out.println("p1: "+ p1.layvantoc());
        System.out.println("p2: "+ p2.layvantoc());
        System.out.println("p3: "+ p3.layvantoc());


        System.out.println("Cất cánh: ");
        p2.catCanh();
    }
}