package QuanLyDanhBa_console;
import java.util.ArrayList;
import java.util.Scanner;
public class HoatDong {
    Scanner sc = new Scanner(System.in);
    ArrayList<DoiTuong> list = new ArrayList<>();
    public void themLienHe() {

       System.out.print("nhap ten nguoi lien he: ");
       String name1 = sc.nextLine();
       System.out.println(" ");
       System.out.print("nhap sdt nguoi lien he: ");
       String phone1 = sc.nextLine();
       boolean tonTai = true;
       for(DoiTuong x : list) {
           if(x.getPhone().equals(phone1)) {
               tonTai = false;
               break;
           }
       }
       if(tonTai) {
           DoiTuong dt1 = new DoiTuong(name1, phone1);
           list.add(dt1);
           System.out.println("lien he da duoc them!!");
       } else {
           System.out.println("loi!! sdt da ton tai");
       }
    }
    public void timLienHe() {
        System.out.print("nhap ten lien he ban muon tim kiem: ");
        String tim1 = sc.nextLine();
        System.out.println(" ");
        boolean co1 = false;
        for(DoiTuong x : list) {
            System.out.println("KET QUA: ");
            if(x.getName().toLowerCase().contains(tim1.toLowerCase())) {
                System.out.print(x.getName() + " | " + x.getPhone());
                co1 = true;
                break;
            }
        }
        if(!co1) {
            System.out.println("khong tim thay lien he!!");
        }
    }
    public void suaLienHe() {
        System.out.print("nhap ten lien he muon sua sdt: ");
        String timTen = sc.nextLine();
        System.out.println(" ");
        boolean tonTai = false;
        for(DoiTuong x : list) {
            if(x.getName().toLowerCase().contains(timTen.toLowerCase())) {
                tonTai = true;
                System.out.print("nhap sdt moi: ");
                String sdtSua = sc.nextLine();
                x.setPhone(sdtSua);
                System.out.println("sdt da duoc sua thanh cong!!");
                break;
            }
        }
        if(!tonTai) {
            System.out.println("khong tim thay lien he phu hop");

        }

    }
    public void xoaLienHe() {
        System.out.print("nhap ten lien he can xoa: ");
        String xoa1 = sc.nextLine();
        System.out.println(" ");
        boolean co1 = false;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().toLowerCase().equals(xoa1.toLowerCase())) {
                co1 = true;
                list.remove(i);
                System.out.println("lien he da duoc xoa");
                break;
            }

        }
        if(!co1) {
            System.out.println("khong tim thay lien he can xoa");
        }
    }
    public void inDanhSach() {
        for(DoiTuong x : list) {
            System.out.println("Ten: " + x.getName() + " | sdt: " + x.getPhone());
        }
    }
}
