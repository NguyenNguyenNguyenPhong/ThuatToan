package TITV_BTJAVA_45;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    protected PhuongTienDiChuyen() {
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void batDau(){
        System.out.println("Start");
    }
    public void tangtoc(){
        System.out.println("Tang toc");
    }
    public void dungLai(){
        System.out.println("Dung lai");
    }

    public abstract double layvantoc();
}
