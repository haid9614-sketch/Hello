package Bt_DaHinh;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
       DongVat dog1 = new Dog("vang");
       DongVat cat1 = new Cat("muop");
       DongVat duck1 = new Duck("den");
       List<DongVat> zoo = new ArrayList<>();
       zoo.add(dog1);
       zoo.add(cat1);
       zoo.add(duck1);
       System.out.println("CAC CON VAT TRONG ZOO BAT DAU KEU!! ");
       for(DongVat x : zoo) {
           x.makeSoud();
       }
    }
}
