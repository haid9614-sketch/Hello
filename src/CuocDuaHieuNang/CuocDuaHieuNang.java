package CuocDuaHieuNang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CuocDuaHieuNang {
    public static void main(String[] args) {

        int n = 200000;

        System.out.println("--- BẮT ĐẦU CUỘC ĐUA (Thêm " + n + " phần tử vào ĐẦU danh sách) ---");

        // --- ĐỘI 1: ArrayList ---
        List<Integer> arrayList = new ArrayList<>();
        long t1 = System.currentTimeMillis(); // Bấm giờ bắt đầu

        for (int i = 0; i < n; i++) {
            // add(0, value): Chen vào vị trí đầu tiên
            // ArrayList phải dời tất cả phần tử cũ ra sau -> Rất chậm
            arrayList.add(0, i);
        }

        long t2 = System.currentTimeMillis(); // Bấm giờ kết thúc
        long timeArray = t2 - t1;
        System.out.println("ArrayList   mất: " + timeArray + " ms");

        // --- ĐỘI 2: LinkedList ---
        List<Integer> linkedList = new LinkedList<>();
        long t3 = System.currentTimeMillis(); // Bấm giờ bắt đầu

        for (int i = 0; i < n; i++) {
            // LinkedList chỉ cần nối node, không cần dời ai -> Siêu nhanh
            linkedList.add(0, i);
        }

        long t4 = System.currentTimeMillis(); // Bấm giờ kết thúc
        long timeLinked = t4 - t3;
        System.out.println("LinkedList  mất: " + timeLinked + " ms");

        // --- KẾT QUẢ ---
        if (timeLinked > 0) { // Tránh lỗi chia cho 0 nếu máy chạy quá nhanh
            long gap = timeArray / timeLinked;
            System.out.println("\n=> KẾT LUẬN: LinkedList nhanh gấp khoảng " + gap + " lần ArrayList!");
        } else {
            System.out.println("\n=> LinkedList chạy quá nhanh (0ms), không đo đếm nổi!");
        }
    }
}
