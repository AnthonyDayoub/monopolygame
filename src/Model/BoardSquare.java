package src.Model;

import Model.Property;
import java.util.Collection;

public class boardSquare {
    private Property titleDeedCards;
    private Model.Player owner;
    private Collection<Model.Token> tokens;

    // Constructor
    public boardSquare(Property titleDeedCards) {
        this.titleDeedCards = titleDeedCards;
        this.owner = null; // Initially, the square has no owner
        this.tokens = new java.util.ArrayList<>(); // Initialize an empty collection of tokens
    }

    // Getter for titleDeedCards
    public Property getTitleDeedCards() {
        return titleDeedCards;
    }

    // Setter for titleDeedCards
    public void setTitleDeedCards(Property titleDeedCards) {
        this.titleDeedCards = titleDeedCards;
    }

    // Getter for owner
    public Model.Player getOwner() {
        return owner;
    }

    // Setter for owner
    public void setOwner(Model.Player owner) {
        this.owner = owner;
    }

    // Getter for tokens
    public Collection<Model.Token> getTokens() {
        return tokens;
    }

    // Method to add a token to the square
    public void addToken(Model.Token token) {
        this.tokens.add(token);
    }

    // Method to remove a token from the square
    public void removeToken(Model.Token token) {
        this.tokens.remove(token);
    }

    // Method to execute a strategy when a player lands on this square
    public void executeStrategy(Model.Player player) {
        // If the square has no owner, the player can buy it`
        if (this.owner == null) {
            player.buyProperty(this.titleDeedCards);
        } else {
            // If the square has an owner, the player must pay rent
            player.payRent(this.owner, this.titleDeedCards);
        }
    }
}
