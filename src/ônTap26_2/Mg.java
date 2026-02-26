package ônTap26_2;

public class Mg extends GunDam {
   private String loaiKhop;
   private final String chieuCao = "30cm";
   public Mg(String ten, int gia, String loaiKhop) {
       super(ten, gia);
       this.loaiKhop = loaiKhop;
   }
   @Override
    public void display() {
       super.display();
       System.out.println("loai khop: " + this.loaiKhop + " | + chieu cao: " + this.chieuCao);
   }
   @Override
    public void gundamTanCong() {
       System.out.println("gundam size MG tan cong");
   }
}
