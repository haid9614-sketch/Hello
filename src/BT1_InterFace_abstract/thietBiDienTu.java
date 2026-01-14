package BT1_InterFace_abstract;

public abstract class thietBiDienTu {
    private String tenThietBi;
    private String congSuat;
    public thietBiDienTu() {
        this.tenThietBi = " ";
        this.congSuat = " ";
    }
    public thietBiDienTu(String tenThietBi, String congSuat) {
        this.tenThietBi = tenThietBi;
        this.congSuat = congSuat;
    }
    public String getTen() {
        return this.tenThietBi;
    }
    public String getCX() {
        return this.congSuat;
    }
    public void kiemTraDien() {
        System.out.println("thiet bi da duoc ket noi dien!!");
    }
    public abstract void khoiDong();
}
