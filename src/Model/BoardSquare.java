package Model;


public class BoardSquare {
    protected String name;

    public BoardSquare(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void executeStrategy() {
    }

    private void handleGo(Player player) {
        int salary = 200;
        player.updateBalance(salary);
    }

    private void handleJail(Player player) {
        player.isVisitingJail();
    }

    private void handleFreeParking(Player player) {
        // Free Parking does not have an action. (free resting space)
    }

    // Go to Jail is a special case where the player is sent to jail
    private void handleGoToJail(Player player) {
        player.sendToJail();
    }
}

