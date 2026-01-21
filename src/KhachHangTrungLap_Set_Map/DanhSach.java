package KhachHangTrungLap_Set_Map;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class DanhSach {
    List<String> ds1 = new ArrayList<>();
    public void them(String a) {
        ds1.add(a);
    }
    public List<String> getDanhSachCu() {
        return ds1;
    }
    public void inDanhSachCu() {
        for(String x : ds1) {
            System.out.print(x + " ");
        }
    }
    Set<String> ds2 = new HashSet<>();
    public void suaDanhSach(List<String> b) {
        ds2.addAll(b);
    }
    public void indanhSachMoi() {
        for(String y : ds2) {
            System.out.print(y + " ");
        }
    }
}
