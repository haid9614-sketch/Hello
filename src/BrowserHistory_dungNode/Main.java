package BrowserHistory_dungNode;

public class Main {
    public static void main(String[] args) {
        HoatDong hd = new HoatDong();
        hd.vaoApp("youtube.com");
        hd.vaoApp("facebook.com");
        hd.vaoApp("google.com");
        System.out.println("linh su ban dau la: ");
        hd.inLichSu();
        System.out.println("-----------------------------------");
        System.out.println("test back lan 1: ");
        hd.back();
        hd.inLichSu();
        System.out.println("-----------------------------------");
        System.out.println("test back lan 2: ");System.out.println("-----------------------------------");
        System.out.println("test back lan 2: ");
        hd.back();
        hd.inLichSu();
        hd.back();
        hd.inLichSu();
        System.out.println("-----------------------------------");
        System.out.println("test back lan 3: ");
        hd.back();
        hd.inLichSu();
    }
}
