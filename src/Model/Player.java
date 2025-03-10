package Model;

public class Player {


    private String name;
    private int balance;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    /**
     * Updates the balance of the player
     * @param amount the amount to update the balance by
     */
    public void updateBalance(int amount) {
        this.balance += amount;
    }

    /**
     * Returns the balance of the player
     * @return the balance of the player
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Deposits money into the player's account
     * @param amount
     */
    public void deposit(int amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the player's account
     * @param amount
     */
    public void withdraw(int amount) {
        balance -= amount;
    }



    public void isVisitingJail() {

    }

    public void sendToJail() {
    }
}
