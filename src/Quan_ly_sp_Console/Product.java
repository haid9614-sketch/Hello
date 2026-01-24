package Quan_ly_sp_Console;

public class Product {
    private String name;
    private Double price;
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public Double getPrice() {
        return this.price;
    }
    @Override
    public String toString() {
        return "San pham: " + this.name + " | Gia tien: " + this.price;
    }
}
