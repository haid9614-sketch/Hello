package Day5_StreamDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 12, 8, 20, 3, 15);
        System.out.println("loc nhung so lon hon 10: ");
        numbers.stream()
                .filter(n -> n > 10)
                .forEach(n -> System.out.print(n + ", "));
        System.out.println(" ");
        System.out.println("Bien doi thanh gap doi: ");
        numbers.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + ", "));
        System.out.println(" ");
        System.out.println("loc so chan va bien thanh chuoi: ");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> "so chan: " + n)
                .forEach(n -> System.out.println(n));
        System.out.println("--- Demo .collect() ---");
        IntStream.of(10, 80, 2, 90, 55)
                .filter(n -> n > 50)
                .boxed()
                .collect(Collectors.toList())
                .forEach(n -> System.out.println("Số lớn đã lưu: " + n));

        System.out.println("\n--- Giải bài toán 1-100 ---");
        int total = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sum();

        System.out.println("Tổng cuối cùng là: " + total);
    }

    }

