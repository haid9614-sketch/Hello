package PlayList_Nhac;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class HoatDong {
    Node head;
    public void ThemBaiVip(String name) {
        Node newNode = new Node(name);
        newNode.next = head;
        head = newNode;
    }
    public void themVaoCuoi(String name) {
        Node newNode = new Node(name);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void xoaBaiDau() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Danh sách rỗng, không xóa được!");
        }
    }
   public void inDanhSach() {
        Node curr = head;
        while (curr != null) {
            System.out.println("ten bai hat: " + curr.data);
            curr = curr.next;
        }
   }

}
