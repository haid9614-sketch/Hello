package QuanLyDiemSinhVien_Console;
public class SinhVien {
    private String name;
    private String maSV;
    private double diemTb;
    public SinhVien(String name, String maSV, double diemTb) {
        this.name = name;
        this.maSV = maSV;
        this.diemTb = diemTb;
    }
    public String getName() {
        return this.name;
    }
    public String getMaSV() {
        return this.maSV;
    }
    public double getDiemTb() {
        return this.diemTb;
    }
    public static String xepLoai(double tb ) {
        String a = " ";
        if (tb >= 8.0) {
            a = "hoc luc Gioi";
        }
        if(tb >= 6.5 && tb < 8.0) {
            a = "hoc luc Kha";
        }
        if(tb >= 0 && tb < 6.5) {
            a = "hoc luc Trung Binh";
        }
        return a;
    }
}