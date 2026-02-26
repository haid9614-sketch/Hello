package ônTap26_2;

public abstract class GunDam {
    private String ten;
    private int gia;
    public GunDam(String ten, int gia) {
        this.ten = ten;
        this.gia =gia;
    }
    public void display() {
        System.out.println("ten gundam: " + this.ten + " | gia: " + this.gia);
    }
    public String getTen() {
        return this.ten;
    }
    public int getGia() {
        return this.gia;
    }
    public abstract  void gundamTanCong();

}
