package Model;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private Token token;
    private int balance;
    private List<Property> mortgagedProperties;
    private List<Property> ownedProperties;

    /**
     * Constructor for the Player class
     * @param name the name of the player
     * @param balance the initial balance of the player
     */
    public Player(String name, int balance, Token token) {
        this.name = name;
        this.balance = balance;
        this.token = token;
        this.token.assignToPlayer(this);
        this.mortgagedProperties = new ArrayList<>();
        this.ownedProperties = new ArrayList<>();
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }


    /**
     * Updates the player's balance by a specified amount
     * @param amount the amount to update the balance by
     */
    public void updateBalance(int amount) {
        this.balance += amount;
    }

    /**
     * Gets the player's current balance
     * @return the player's balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Deposits a specified amount to the player's balance
     * @param amount the amount to deposit
     */
    public void deposit(int amount) {
        balance += amount;
    }

    /**
     * Withdraws a specified amount from the player's balance
     * @param amount the amount to withdraw
     */
    public void withdraw(int amount) {
        balance -= amount;
    }

    /**
     * Buys a property for the player
     * @param titleDeedCards the property to buy
     */
    public void buyProperty(Property titleDeedCards) {
    }

    /**
     * Pays rent to another player
     * @param owner the owner of the property
     * @param titleDeedCards the property for which rent is being paid
     */
    public void payRent(Player owner, Property titleDeedCards) {
    }

    /**
     * Indicates that the player is visiting jail
     */
    public void isVisitingJail() {
    }

    /**
     * Sends the player to jail
     */
    public void sendToJail() {
    }

    /**
     * Mortgages a property for the player
     * @param property the property to mortgage
     */
    public void mortgageProperty(Property property) {
        mortgagedProperties.add(property);
    }

    /**
     * Unmortgages a property for the player
     * @param property the property to unmortgage
     */
    public void unmortgageProperty(Property property) {
        mortgagedProperties.remove(property);
    }

    /**
     * Gets the list of mortgaged properties for the player
     * @return the list of mortgaged properties
     */
    public List<Property> getMortgagedProperties() {
        return mortgagedProperties;
    }

    public List<Property> getOwnedProperties() {
        return ownedProperties;
    }

}