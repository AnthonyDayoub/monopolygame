package src.Model;

public abstract class BoardSquare {
    protected String name;

    public BoardSquare(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}