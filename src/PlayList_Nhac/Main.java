package PlayList_Nhac;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        HoatDong playList = new HoatDong();
        playList.themVaoCuoi("baiA");
        playList.themVaoCuoi("baiB");
        playList.themVaoCuoi("baiB");
        System.out.println("Danh sach ban dau la: ");
        playList.inDanhSach();
        System.out.println("----------------------------------------");
        playList.ThemBaiVip("BaiVip1");
        System.out.println("danh sach da them bai vip la: ");
        playList.inDanhSach();
        System.out.println("----------------------------------------");
        playList.xoaBaiDau();
        System.out.println("Danh sach da xoa bai dau la: ");
        playList.inDanhSach();
    }
}
