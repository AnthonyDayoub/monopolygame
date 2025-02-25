package src.Model;

public class Railroad extends BoardSquare {
    private int price;
    private int baseRent;

    public Railroad(String name, int price, int baseRent) {
        super(name);
        this.price = price;
        this.baseRent = baseRent;
    }

    public int getPrice() { return price; }
    public int getBaseRent() { return baseRent; }
}