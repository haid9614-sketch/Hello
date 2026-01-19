import java.util.ArrayList;
import java.util.List;

public class Week2_List_Demo {
    public static void main(String[] args) {
        // 1. Khai báo (Sử dụng tính đa hình như lộ trình yêu cầu)
        // Dùng ArrayList vì bài này ta cần truy xuất theo index (người thứ 3, thứ 5)
        List<String> studentNames = new ArrayList<>();

        // 2. Thêm 10 người (Add)
        // Cách thủ công
        studentNames.add("An");      // index 0
        studentNames.add("Bình");    // index 1
        studentNames.add("Cường");   // index 2 (Người thứ 3)
        studentNames.add("Dũng");    // index 3
        studentNames.add("Hạnh");    // index 4 (Người thứ 5)
        studentNames.add("Hoa");
        studentNames.add("Khôi");
        studentNames.add("Lan");
        studentNames.add("Minh");
        studentNames.add("Nga");

        System.out.println("Danh sách ban đầu (" + studentNames.size() + " bạn): " + studentNames);

        // 3. Xóa người thứ 3
        // Lưu ý: Trong lập trình đếm từ 0, nên "người thứ 3" có index là 2.
        String removedStudent = studentNames.remove(2);
        System.out.println("\nĐã xóa bạn: " + removedStudent);
        System.out.println("Danh sách sau khi xóa: " + studentNames);

        // 4. Sửa tên người thứ 5
        // Lưu ý: Lúc này danh sách đã bị dồn lại do bước xóa ở trên.
        // Nếu đề bài tính "người thứ 5" so với danh sách HIỆN TẠI => index 4.
        // Dùng hàm set(index, gia_tri_moi)
        String oldName = studentNames.set(4, "Hạnh (Đã sửa tên)");

        System.out.println("\nĐã đổi tên bạn: " + oldName);
        System.out.println("Danh sách cuối cùng: " + studentNames);
    }
}