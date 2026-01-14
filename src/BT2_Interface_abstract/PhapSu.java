package BT2_Interface_abstract;

public class PhapSu extends NhanVat implements HoiMau {
    public PhapSu(String ten, Long HP) {
        super(ten, HP);
    }
    @Override
    public void tanCong() {
        System.out.println("phap su dang chuong phep");
    }
    @Override
    public void tuHoiMau() {
        System.out.println("phap su dang tu hoi HP cho chinh minh");
    }
}
