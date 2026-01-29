package Day4_StreamDemo;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        List<String> friend = Arrays.asList("duong", "minh", "long", "chinh", "tien");
        System.out.println("CACH CU: ");
        for(String name : friend) {
            System.out.println(name);
        }
        System.out.println("---------------------------------------------------");
        System.out.println(" TEST CACH STREAM: ");
        friend.stream().forEach(name -> System.out.println("friend: " + name));

    }
}
