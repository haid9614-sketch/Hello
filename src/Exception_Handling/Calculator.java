package Exception_Handling;

public class Calculator {
    public static void phepChia(int soChia, int soBiChia) {
        try {
            int ketQua = soChia / soBiChia;
            System.out.println("ket qua phep chia la: " + ketQua);
        }
        catch(ArithmeticException e) {
            System.out.println("co loi khong the chia cho 0");
        }
        finally {
            System.out.println("da chay xong !!");
        }

    }
}
