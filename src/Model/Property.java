package Model;

public class Property extends src.Model.BoardSquare {
    private int price;
    private int rent;
    private String color;

    public Property(String name, int price, int rent, String color) {
        super(name);
        this.price = price;
        this.rent = rent;
        this.color = color;
    }

    public int getPrice() { return price; }
    public int getRent() { return rent; }
    public String getColor() { return color; }
}
