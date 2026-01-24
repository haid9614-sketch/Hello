package Quan_ly_sp_Console;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ProductManagement {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("MENU LUA CHON, CHON SO DE TIEP TUC: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Them san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Tim kiem san pham");
            System.out.println("4. sap xep san pham trong danh sach ");
            System.out.println("0. thoat chuong trinh !!");
            System.out.print("nhap chuc nang ban muon dung: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1:
                    System.out.println("BAN DANG O TAB THEM SAN PHAM ");
                    System.out.println("-------------------------------------");
                    System.out.print("nhap ten san pham can them: ");
                    String tenSp = sc.nextLine();
                    System.out.print("nhap gia tien san pham: ");
                    Double giaTien = Double.parseDouble(sc.nextLine());
                    Product sp = new Product(tenSp, giaTien);
                    list.add(sp);
                    System.out.println("San pham da duoc them thanh cong!!!");
                    break;
                case 2:
                    System.out.println("BAN DANG O TAP HIEN THI DANH SACH ");
                    System.out.println("-------------------------------------");
                    if(list.isEmpty()) {
                        System.out.println(" danh sach rong");
                    } else {
                        for(Product item : list) {
                            System.out.println(item.toString());
                        }

                    }
                    break;
                case 3:
                    Boolean fould = false;
                    System.out.print("nhap san pham ban muon tim: ");
                    String key = sc.nextLine();
                    for(Product item : list) {
                        if(item.getName().toLowerCase().contains(key.toLowerCase())) {
                            System.out.println("ket qua tim kiem: ");
                            System.out.println(item.toString());
                            fould = true;
                        }
                    }
                    if(fould == false) {
                        System.out.println("khong tim thay san pham thich hop !!!");
                    }
                    break;
                case 4:
                    System.out.println("BAN DANG O TAB SAP XEP");
                    Collections.sort(list, new Comparator<Product>() {
                        public int compare(Product p1, Product p2) {
                            return Double.compare(p1.getPrice(), p2.getPrice());
                        }
                       }
                      );
                    System.out.println("da sap xep danh sach thanh cong, quay lai 2 de kiem tra!!");
                    break;

                case 0:
                    System.out.println("da thoat chuong trinh !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("chuc nang khong hop le !!!!");
            }

        }

    }
}
