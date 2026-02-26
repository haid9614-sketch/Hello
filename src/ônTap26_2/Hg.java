package ônTap26_2;

public class Hg extends GunDam {
    private final String chieuCaoHG = "14cm";
    public Hg(String ten, int gia) {
        super(ten, gia);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("chieu cao cua hg la: " + this.chieuCaoHG);
    }
    @Override
    public void gundamTanCong() {
        System.out.println("gundam hg dang tan cong!!!");
    }
}
