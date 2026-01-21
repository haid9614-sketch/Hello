package KhachHangTrungLap_Set_Map;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DanhSach danhSach = new DanhSach();
        danhSach.them("duong");
        danhSach.them("duong");
        danhSach.them("han");
        danhSach.them("han");
        danhSach.them("khoa");
        danhSach.them("khoa");
        danhSach.them("trang");
        System.out.println("danh sach bi loi la: ");
        danhSach.inDanhSachCu();
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        danhSach.suaDanhSach(danhSach.getDanhSachCu());
        System.out.println("danh sach da duoc sua la: ");
        danhSach.indanhSachMoi();
    }
}
