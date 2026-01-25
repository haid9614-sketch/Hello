package QuanLyDiemSinhVien_Console;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HoatDong hd1 = new HoatDong();
        while(true) {
            System.out.println("---------------------------MENU------------------------------");
            System.out.println("1. nhap thong tin sinh vien");
            System.out.println("2. hien thi danh sach va xep loai");
            System.out.println("3. top 3 sinh vien gioi nhat");
            System.out.println("4. tim kiem sinh vien");
            System.out.println("5. Sap xep sinh vien theo ten ");
            System.out.println("0. dong chuong trinh");
            System.out.println("--------------------------------------------------");
            System.out.print("nhap lua chon cua ban: ");
            String lc = sc.nextLine();
            int choice = Integer.parseInt(lc);
            switch(choice) {
                case 1:
                    System.out.println("ban dang o tab nhap thong tin sinh vien");
                    hd1.themSV();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("ban dang o tab hien thi va xep loai sinh vien");
                    hd1.dsXepLoai();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("ban dang o tab top 3 sinh vien");
                    hd1.top3SV();
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("ban dang o tab tim kiem sinh vien");
                    hd1.timKiemSv();
                    System.out.println(" ");
                    break;
                case 5:
                    hd1.sapXepTheoTen();
                    System.out.println(" ");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("chuc nang khong hop le");
            }

        }
    }
}
