package Bai3_stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
public class BaiTap3 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(8, 5, 9, 7, 10, 6, 4);
        int scoresMax = scores.stream()
                .mapToInt(n -> n)
                .max()
                .getAsInt();
        System.out.println("max la: " + scoresMax);
        int scoresMin = scores.stream()
                .mapToInt(n -> n)
                 .min()
                .getAsInt();
        System.out.println("Min la: " + scoresMin);
        double scoresAverage = scores.stream()
                .mapToDouble(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Trung binh cong la: " + scoresAverage);
        System.out.println("--------------------------------------------------");
        System.out.println(" test thu viet gon: ");
        IntSummaryStatistics stats = scores.stream()
                .mapToInt(n -> n)
                .summaryStatistics();

        System.out.println("Max la: " + stats.getMax());
        System.out.println("Min la: " + stats.getMin());
        System.out.println("Trung binh la: " + stats.getAverage());
    }

}
