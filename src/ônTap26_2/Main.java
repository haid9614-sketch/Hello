package ônTap26_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] agrs) {
        QuanLy ql1 = new QuanLy();
        Scanner sc = new Scanner(System.in);
        GunDam g1 = new Mg("strike freedom", 500, "kim loai vang");
        GunDam g2 = new Mg("justic", 550, "kim loai bac");
        GunDam g3 = new Mg("babatod", 350, "nhua");
        GunDam g4 = new Hg("burning", 420);
        GunDam g5 = new Hg("Strike", 450);
        GunDam g6 = new Hg("destiny", 380);
        ql1.addGundam(g1);
        ql1.addGundam(g2);
        ql1.addGundam(g3);
        ql1.addGundam(g4);
        ql1.addGundam(g5);
        ql1.addGundam(g6);
        while(true) {
            System.out.println("1. tim kiem gundam ");
            System.out.println("2. hien thi toan bo gundam");
            System.out.println("3. loc gundam > 400k");
            System.out.println("0. dong chuong trinh");
            System.out.println("---------------------------------------------");
            System.out.print("nhap lua chon cua ban: ");
            String luaChon = sc.nextLine();
            int Choice = Integer.parseInt(luaChon);
            switch(Choice) {
                case 1:
                    ql1.timkiem();
                    break;
                case 2:
                    ql1.hienThiDanhSach();
                    break;
                case 3:
                    ql1.locGunDam();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong hop le");
                    break;
            }

        }
    }
}
