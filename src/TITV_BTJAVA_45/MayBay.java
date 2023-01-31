package TITV_BTJAVA_45;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLeu;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLeu) {

        this.loaiNhienLeu = loaiNhienLeu;
    }

    public void catCanh(){
        System.out.println("cat canh");
    }
    public void haCanh(){
        System.out.println("Ha canh");
    }

    @Override
    public double layvantoc() {
        return 500;
    }
}
