package Bai2QuanLySanPham_Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
public class BaiTap2 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.0),
                new Product("Mouse", 20.0),
                new Product("Keyboard", 70.0),
                new Product("Phone", 800.0),
                new Product("Monitor", 150.0)
        );

        System.out.println("--- Sản phẩm giá cao (>500) ---");
        List<String> expensiveProds = products.stream()
                        .filter(x -> x.getPrice() > 500.0)
                        .map(x -> x.getName())
                        .collect(Collectors.toList());
        System.out.println(expensiveProds);

    }
}
