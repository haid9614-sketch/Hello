package bai1animal;

public class Car implements Runnable {
    private String tenXe;
    public Car(String tenXe) {
        this.tenXe = tenXe;
    }
    public void getXe() {
      System.out.println("tenxe: " + this.tenXe);
    }
    public void Run() {
        System.out.println("chiec xe dang chay bang 4 banh xe");
    }
}
