package BrowserHistory_ThuVienLinkedList;
import java.util.List;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        BrowserHistory br1 = new BrowserHistory();
        LinkedList<String> l1 = new LinkedList<>();
        br1.themWeb("youtube.com");
        br1.themWeb("facebook.com");
        br1.themWeb("google.com");
        br1.inLichSu();
        System.out.println("------------------------------");
        System.out.println("test back lan 1");
        br1.back();
        br1.inLichSu();
        System.out.println("------------------------------");
        System.out.println("test back lan 2");
        br1.back();
        br1.inLichSu();
        System.out.println("------------------------------");
        System.out.println("test back lan 3");
        br1.back();
        br1.inLichSu();
        System.out.println("------------------------------");
        System.out.println("test back lan 4");
        br1.back();
        br1.inLichSu();

    }
}



