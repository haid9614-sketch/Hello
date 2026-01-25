package QuanLyDiemSinhVien_Console;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class HoatDong {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> list = new ArrayList<>();
    public void themSV() {
        System.out.print("nhap ten sinh vien: ");
        String name1 = sc.nextLine();
        System.out.print("nhap ma so sinh vien: ");
        String ms = sc.nextLine();
        System.out.println(" ");
        System.out.print("nhap diem tb cua sinh vien: ");
        double tb1 = Double.parseDouble(sc.nextLine());
        System.out.println(" ");
        SinhVien sv1 = new SinhVien(name1, ms, tb1);
        list.add(sv1);
        System.out.println("da them thong tin sinh vien thanh cong !! !");
    }
    public void dsXepLoai() {
         System.out.println("danh sach sinh vien da xep loai la: ");
       for(SinhVien x : list) {
           System.out.println("ten sv: " + x.getName() + " | maSV: " + x.getMaSV() +
                   " | diem tb: " + x.getDiemTb() + " " + SinhVien.xepLoai(x.getDiemTb()
           ));
       }
    }
    public void top3SV() {
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemTb(), sv1.getDiemTb());
            }
        });
        System.out.println("top 3 sinh vien gioi nhat la: ");
        for(int i = 0; i < list.size() && i < 3; i++) {
            System.out.println(" ten sv: " + list.get(i).getName() + " | ma sv: " + list.get(i).getMaSV() +
                    " | diem tb " + list.get(i).getDiemTb() + " " + SinhVien.xepLoai(list.get(i).getDiemTb()));
        }
    }
    public void timKiemSv() {
        System.out.print("nhap diem min: ");
        double min = Double.parseDouble(sc.nextLine());
        System.out.print("nhap diem max: ");
        double max = Double.parseDouble(sc.nextLine());
        System.out.println(" ");
        boolean co1 = false;
        for(SinhVien x : list) {
            if(x.getDiemTb() >= min && x.getDiemTb() <= max) {
               System.out.println("ten sv: " + x.getName() + " | maSV: " + x.getMaSV() + " | diemtb: "
               + x.getDiemTb() + " " + SinhVien.xepLoai(x.getDiemTb()));
               co1 = true;
            }

        }
        if(!co1) {
            System.out.println("khong tim thay ket qua phu hop!!");
        }
    }
    public void sapXepTheoTen() {
        Collections.sort(list, new Comparator<SinhVien>() {
           @Override
           public int compare(SinhVien sv1, SinhVien sv2) {
               return sv1.getName().compareToIgnoreCase(sv2.getName());
           }
        });
       System.out.println("Da sap xep ten sinh vien theo A - Z ");
    }

}
