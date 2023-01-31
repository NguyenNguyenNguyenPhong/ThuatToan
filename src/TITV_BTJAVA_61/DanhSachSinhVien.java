package TITV_BTJAVA_61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {

    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public void themDanhSach(SinhVien sv){
        this.danhSach.add(sv);
    }
    public void inDanhSach(){
        for(SinhVien sinhVien: danhSach){
            System.out.println(sinhVien);
        }
    }
    public boolean kiemTraDanhSachRong(){
         return this.danhSach.isEmpty();
    }
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    public void lamRongDanhSach(){
         this.danhSach.removeAll(danhSach);
    }
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }
    public void timSinhVien(String ten){
        for (SinhVien sv : danhSach){
            if(sv.getHoVaTen().indexOf(ten) >= 0){
                System.out.println(sv);
            }
        }
    }

    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {

            public int compare(SinhVien sv1, SinhVien sv2) {
                if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
                    return 1;
                }else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
