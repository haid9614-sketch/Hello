package BT2_Interface_abstract;

public class ChienBinh extends NhanVat {
    public ChienBinh(String ten, Long HP) {
        super(ten, HP);
    }
    @Override
    public void tanCong() {
        System.out.println("chien binh dang vung kiem");
    }
}
