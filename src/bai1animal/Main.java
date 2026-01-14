package bai1animal;

public class Main {
    public static void main(String[] args) {
        Animal con1 = new Cat("meoMuop");
        Dog con2 = new Dog("choDom");
        System.out.println("test con meo: ");
        con1.getName();
        con1.ngu();
        con1.makeSound();
        System.out.println("test con cho: ");
        con2.getName();
        con2.ngu();
        con2.makeSound();
        con2.Run();
        System.out.println("TEST XE: ");
        Car xe1 = new Car("ferrari");
        xe1.getXe();
        xe1.Run();

    }
}
