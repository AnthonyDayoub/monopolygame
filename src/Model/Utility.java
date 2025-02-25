package Model;

public class Utility extends src.Model.BoardSquare {
    private int price;

    public Utility(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() { return price; }
}