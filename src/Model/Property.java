package Model;

import java.awt.*;

public class Property extends BoardSquare {
    private Color color;

    public Property(String name, Color color) {
        super(name);
        this.color = color;
    }

    public Color getColor() { return color; }
}
