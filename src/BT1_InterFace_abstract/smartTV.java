package BT1_InterFace_abstract;

public class smartTV extends thietBiDienTu implements ketNoiWifi {
    public smartTV(String tenThietBi, String congXuat) {
        super(tenThietBi, congXuat);
    }
    @Override
    public void khoiDong() {
        System.out.println("cai TV dang chieu phim ");
    }

    @Override
    public void truyCapInternet() {
        System.out.println("TV da duoc ket noi WIFI");
    }
}
