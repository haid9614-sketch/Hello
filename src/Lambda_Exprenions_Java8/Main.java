package Lambda_Exprenions_Java8;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        Student st1 = new Student("duong", 19);
        Student st2 = new Student("han", 20);
        Student st3 = new Student("kha", 17);
        Student st4 = new Student("quynh", 18);
        Student st5 = new Student("minh", 22);
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
        list1.add(st4);
        list1.add(st5);
        Collections.sort(list1, (a, b) -> a.getTuoi() - b.getTuoi());
        list1.forEach(a -> System.out.println("ten sinh vien: " + a.getName() + " | tuoi: " + a.getTuoi()));
        list1.removeIf(a -> a.getTuoi() < 19);
        System.out.println("-------------------------------------------------------");
        System.out.println("Nhung sinh vien lon hon 19 tuoi la: ");
        list1.forEach(a -> System.out.println("ten: " + a.getName() + " | tuoi: " + a.getTuoi()));

    }
}
