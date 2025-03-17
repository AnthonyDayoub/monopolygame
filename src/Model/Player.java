package Model;

public class Player {


    private String name;
    private int balance;
    private int boardPosition;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.boardPosition = 0;
    }

    /**
     * Gets the name of the player
     * @return the name of the player
     */
    public int getBoardPosition() {
        return boardPosition;
    }


    public void updateBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void buyProperty(Property titleDeedCards) {
    }

    public void payRent(Player owner, Property titleDeedCards) {
    }

    public void isVisitingJail() {

    }

    public void sendToJail() {
    }
}
