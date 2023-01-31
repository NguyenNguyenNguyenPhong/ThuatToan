package TITV_BTJAVA_45;

public  class XeOTo extends PhuongTienDiChuyen {

    private String loaiNhienLieu;

    public XeOTo(HangSanXuat hangSanXuat , String loaiNhienLieu) {
        super("Xe Ô tô", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layvantoc() {
        return 150;
    }


}
