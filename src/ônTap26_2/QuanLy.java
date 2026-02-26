package ônTap26_2;
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
    ArrayList<GunDam> shop = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addGundam(GunDam a) {
        shop.add(a);
    }
    public void timkiem() {
        System.out.print("nhap ten gundam ban muon: ");
        String tenTim = sc.nextLine();
        boolean timThay = false;
        for(GunDam x : shop) {
            if(x.getTen().equalsIgnoreCase(tenTim)) {
                timThay = true;
                System.out.println("ket qua tim kiem la: ");
                x.display();
            }
            if(timThay == false) {
                System.out.println("khong tim thay ket qua phu hop");
            }
        }

    }
    public void hienThiDanhSach() {
        System.out.println("toan bo gundam trong shop la: ");
        for(GunDam x : shop) {
            x.display();
        }
        System.out.println("---------------------------------");
    }
    public void locGunDam() {
        System.out.println("danh sach toan bo gundam > 400K:");
        shop.stream()
                .filter(a -> a.getGia() > 400)
                .forEach(a -> a.display());
    }
}
