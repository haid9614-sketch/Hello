package QuanLyDanhBa_console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoatDong hd1 = new HoatDong();
        while(true) {
            System.out.println("________________________MENU__________________________");
            System.out.println("1. them lien he");
            System.out.println("2. tim lien he");
            System.out.println("3. sua lien he");
            System.out.println("4. xoa lien he");
            System.out.println("5. hien thi danh sach ");
            System.out.println("0. dong chuong trinh");
            System.out.println("-----------------------------------------");
            System.out.print("nhap lua chon cua ban: ");
            String nhap = sc.nextLine();
            int choice = Integer.parseInt(nhap);
            switch (choice) {
                case 1:
                    System.out.println(" ban dang o tap them lien he");
                    hd1.themLienHe();
                    break;
                case 2:
                    System.out.println(" ban dang o tap tim lien he");
                    hd1.timLienHe();
                    System.out.println("  ");
                    break;
                case 3:
                    System.out.println(" ban dang o tap sua lien he");
                    hd1.suaLienHe();
                    break;
                case 4:
                    System.out.println(" ban dang o xoa lien he");
                    hd1.xoaLienHe();
                    break;
                case 5:
                    System.out.println(" ban dang o hien thi danh sach");
                    hd1.inDanhSach();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
