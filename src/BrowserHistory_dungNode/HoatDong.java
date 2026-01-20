package BrowserHistory_dungNode;
import java.util.List;
import java.util.ArrayList;
public class HoatDong {
    Node head;
    public void vaoApp(String data) {
        Node newApp = new Node(data);
        newApp.next = head;
        head = newApp;
    }
    public void back() {
        if(head == null) {
            System.out.println("lich su trong khong the back");
            return;
        }
        head = head.next;
        Node curr = head;
        if(curr != null) {
            System.out.println("dang quay lai trang " + curr.data);
        } else {
            System.out.println("da dong het cac tab ");
        }
    }
    public void  inLichSu() {
        Node curr = head;
        System.out.println("lich su la: ");
        while(curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }

}
