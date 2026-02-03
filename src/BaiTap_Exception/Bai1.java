package BaiTap_Exception;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        String[] qua = {"Iphone 15", "Laptop Gaming", "Chuột không dây", "Bàn phím cơ", "Tai nghe"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ tự hộp quà bạn muốn mở (1-5): ");
        int viTri = scanner.nextInt();
        int viTriThat = viTri - 1;
        try {
            String luaChon = qua[viTriThat];
            System.out.println("Bạn nhận được: " + luaChon);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Lỗi: Hộp quà số " + viTri + " không tồn tại!");
        }

    }

}
