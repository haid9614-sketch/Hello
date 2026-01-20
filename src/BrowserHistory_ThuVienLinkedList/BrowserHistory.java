package BrowserHistory_ThuVienLinkedList;
import java.util.LinkedList;
import java.util.List;
public class BrowserHistory {
    LinkedList<String> l1 = new LinkedList<>();
    public void themWeb(String a) {
        String tenapp = a;
        l1.addFirst(a);
    }
    public void back() {
        if(l1.isEmpty()) {
            System.out.println("loi khong con tab de back ");
            return;
        }
        l1.removeFirst();
        if(!l1.isEmpty()) {
            System.out.println("dang quay lai trang " + l1.getFirst());
        } else {
            System.out.println("da xoa het tab ");
        }
    }
    public void inLichSu() {
        System.out.println("lich su la: ");
        for(String x : l1) {
            System.out.println(x);
        }
    }
}
