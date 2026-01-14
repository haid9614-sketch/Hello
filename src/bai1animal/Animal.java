package bai1animal;

public abstract class Animal {
    private String name;
    public Animal() {
        this.name = " ";
    }
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void ngu() {
        System.out.println("con vat dang ngu ");
    }
    public abstract void makeSound();
}
