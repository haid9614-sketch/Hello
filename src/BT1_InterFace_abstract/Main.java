package BT1_InterFace_abstract;

public class Main {
    public static void main(String[] args) {
        thietBiDienTu quat1 = new Quat("quatCay", "300w");
        smartTV tv1 = new smartTV("tvSAMSUNG", "200w");
        System.out.println("test Quat: ");
        System.out.println("Ten thiet bi: " + quat1.getTen());
        System.out.println("Cong suat: " + quat1.getCX());
        quat1.kiemTraDien();
        quat1.khoiDong();
        System.out.println("---------------------------");
        System.out.println("test TV");
        System.out.println("Ten thiet bi: " + tv1.getTen());
        System.out.println("Cong suat: " + tv1.getCX());
        tv1.kiemTraDien();
        tv1.khoiDong();
        tv1.truyCapInternet();
    }
}
