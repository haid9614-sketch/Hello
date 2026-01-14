package bai1animal;

public class Dog extends Animal implements Runnable {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("gau gau gau gau");

    }
    @Override
    public void Run() {
        System.out.println("con  cho dang chay bang 4 chan");
    }
}
