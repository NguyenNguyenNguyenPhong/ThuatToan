package TITV_BTJAVA_45;

public class XeDap extends PhuongTienDiChuyen{

    public XeDap(HangSanXuat hangSanXuat) {
        super("Xe đạp", hangSanXuat);
    }



    @Override
    public double layvantoc() {
        return 20;
    }
}