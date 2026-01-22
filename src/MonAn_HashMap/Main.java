package MonAn_HashMap;
import KhachHangTrungLap_Set_Map.DanhSach;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        DanhSachOder ds1 = new DanhSachOder();
        List<String> orders = Arrays.asList("Cơm rang", "Phở bò", "Cơm rang", "Bún chả", "Cơm rang", "Phở bò");
        ds1.duyetMap(orders);
        ds1.chotDanhSach();
        ds1.monBestSaleCach1(ds1.getMap());
        System.out.println("test cach 2: ");
        ds1.monBestcach2(ds1.getMap());
    }
}
