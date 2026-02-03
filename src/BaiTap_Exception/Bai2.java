package BaiTap_Exception;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("vui long nhap nam sinh cua ban: ");
        String namSinh = sc.nextLine();
        try {
            int namSinhChuan = Integer.parseInt(namSinh);
            int tuoi = 2026 - namSinhChuan;
            System.out.println("tuoi cua ban la: " + tuoi);
        }
        catch (NumberFormatException e) {
            System.out.println("loi !!! " + namSinh +  " khong phai nam sinh dang so");
        }
    }
}
