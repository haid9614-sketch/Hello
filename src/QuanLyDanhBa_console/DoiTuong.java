package QuanLyDanhBa_console;

public class DoiTuong {
    private String name;
    private String phone;
    public DoiTuong(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return this.name;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String sdtmoi) {
        this.phone = sdtmoi;
    }
}
