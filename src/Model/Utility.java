package src.Model;

public class Utility extends BoardSquare {
    private int price;

    public Utility(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() { return price; }
}