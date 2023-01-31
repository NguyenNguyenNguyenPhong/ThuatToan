package TITV_BTJAVA_31;

public class HoaDonCaPhe {
    private String tenCaPhe;
    private double giaTien1kg;
    private double khoiLuong;

    public HoaDonCaPhe(String tenCaPhe, double giaTien1kg, double khoiLuong) {
        this.tenCaPhe = tenCaPhe;
        this.giaTien1kg = giaTien1kg;
        this.khoiLuong = khoiLuong;
    }

    public String getTenCaPhe() {
        return tenCaPhe;
    }

    public void setTenCaPhe(String tenCaPhe) {
        this.tenCaPhe = tenCaPhe;
    }

    public double getGiaTien1kg() {
        return giaTien1kg;
    }

    public void setGiaTien1kg(double giaTien1kg) {
        this.giaTien1kg = giaTien1kg;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public double tinhTongTien(){
        return this.giaTien1kg * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongLonHon(double kl){
        return this.khoiLuong > kl;
    }
    public  boolean kiemTraTongTienLonHon500k(){
        return this.tinhTongTien() > 500000;
    }
    public double giamGia(double x){
        if(this.tinhTongTien() > 500000){
            return (x /100) * this.tinhTongTien();
        }else return 0;
    }
    public double giaSauKhiGiam(double x) {
        return this.tinhTongTien() - this.giamGia(x);
    }
}
