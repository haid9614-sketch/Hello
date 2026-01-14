package BT2_Interface_abstract;

public class Main {
    public static void main(String[] args) {
        NhanVat cb1 = new ChienBinh("jack", 20000L);
        PhapSu ps1 = new PhapSu("ona", 1200L);
        System.out.println("test chien binh: ");
        System.out.println("ten: " + cb1.getTen());
        System.out.println("mau: " + cb1.getHP());
        cb1.tanCong();
        System.out.println("-----------------------------------------");
        System.out.println("test phap su: ");
        System.out.println("ten: " + ps1.getTen());
        System.out.println("mau: " + ps1.getHP());
        ps1.tanCong();
        ps1.tuHoiMau();

    }
}
