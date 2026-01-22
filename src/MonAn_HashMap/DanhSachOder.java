package MonAn_HashMap;
import java.util.*;
public class DanhSachOder {
    Map<String, Integer> map = new HashMap<>();
    public void duyetMap(List<String> A) {
        for(String x : A) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

    }
    public void chotDanhSach() {
        System.out.println("danh sach oder hom nay la: ");
        System.out.println(map);
    }
    public Map<String, Integer> getMap() {
        return map;
    }
    public void monBestSaleCach1(Map<String, Integer> B) {
        PriorityQueue<String> queue = new PriorityQueue<>(
                (monA, monB) -> B.get(monB) - B.get(monA)
        );
        queue.addAll(B.keySet());

        String monHotNhat = queue.peek();
        int soLuong = B.get(monHotNhat);

        System.out.println("Món bán chạy nhất là: " + monHotNhat + " (" + soLuong + " suất)");
    }
    public void monBestcach2(Map<String, Integer> C) {
        String bestMon = " ";
        int MaxCount = 0;
        for(Map.Entry<String, Integer> D : C.entrySet()) {
            if(D.getValue() > MaxCount) {
                MaxCount = D.getValue();
                bestMon = D.getKey();
            }
        }
        System.out.println("mon hot nhat la: " + bestMon + " so luong: " + C.get(bestMon));
    }
}

