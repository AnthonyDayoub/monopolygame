import Model.Dice;
import Model.Player;
import Model.Property;
import Model.Token;
import Model.Tokens;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a token
        Token token = new Token(Tokens.BOOT);

        // Create a player with an initial balance of 1500
        Player player = new Player("John Doe", 1500, token);

        // Create a property
        Property property = new Property("Boardwalk", Color.BLUE);

        // Player buys the property
        player.buyProperty(property);

        // Update player's balance
        player.updateBalance(-200);

        // Roll the dice
        Dice dice = new Dice();
        int rollResult = dice.roll();
        System.out.println("Dice roll result: " + rollResult);

        // Print player's details
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Balance: " + player.getBalance());
        System.out.println("Player Token: " + player.getToken().getType());
        System.out.println("Player Board Position: " + player.getBoardPosition());
        System.out.println("Owned Properties: " + player.getOwnedProperties().size());
    }
}