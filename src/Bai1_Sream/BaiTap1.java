package Bai1_Sream;
import java.util.Arrays;
import java.util.List;
public class BaiTap1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("  duong  ", "   Minh", "HaNH ", "   tuan   ");

        System.out.println("--- Danh sách chuẩn hóa ---");
        names.stream()
                .map(name -> name.trim())
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + ", "));
    }
}
