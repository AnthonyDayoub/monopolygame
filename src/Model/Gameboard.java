package Model;

import Model.ChanceCards;
import Model.CommunityChestCards;
import Model.Player;

import java.util.ArrayList;
import java.util.List;

public class Gameboard {
    private List<ChanceCards> chanceCards;
    private List<CommunityChestCards> communityChestCards;

    public Gameboard() {
        this.chanceCards = new ArrayList<>();
        this.communityChestCards = new ArrayList<>();

    }

    public void shuffleChanceCards() {
        // shuffle the chance cards
    }

    public void shuffleCommunityChestCards() {
        // shuffle the community chest cards
    }

    public void placeChanceCard(ChanceCards card) {
        // place the chance card on the bottom of the deck
    }

    public void placeCommunityChestCard(CommunityChestCards card) {
        // place the community chest card on the bottom of the deck
    }

    public void assignTokens() {
        // assign tokens to the board squares
    }

    public void giveStartingMoney(Player player) {
        // give the players starting money
    }

    public void moveToken(Player player, int steps) {
        // move the token a certain number of spaces
    }
}
