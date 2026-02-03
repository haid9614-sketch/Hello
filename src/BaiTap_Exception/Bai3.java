package BaiTap_Exception;

public class Bai3 {
    public static void main(String[] args) {
        String[] data = {"20", "0", "5", "abc", "10"};
        int tuSo = 100;
        System.out.println("Bắt đầu xử lý danh sách...");
        for(String x : data) {
            try {
                int mauSo = Integer.parseInt(x);
                int ketQua = tuSo / mauSo;
                System.out.println("100 / " + mauSo + " = " + ketQua);
            }
            catch(ArithmeticException e) {
                System.out.println(" loi khong the chia cho " + x);
            }
            catch(NumberFormatException e) {
                System.out.println("loi " + x + " khong phai la so");
            }

        }
        System.out.println("da xu ly xong danh sach");

    }
}
