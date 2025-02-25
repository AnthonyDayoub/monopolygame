package Model;

import Model.ChanceCards;
import Model.CommunityChestCards;
import Model.Player;
import src.Model.BoardSquare;
import src.Model.Property;
import src.Model.Railroad;
import src.Model.Utility;
import src.Model.BoardSquare;

import java.util.ArrayList;
import java.util.List;

public class Gameboard {
    private List<BoardSquare> squares;
    private List<ChanceCards> chanceCards;
    private List<CommunityChestCards> communityChestCards;

    public Gameboard() {
        squares = new ArrayList<>();
        initializeBoard();
        this.chanceCards = new ArrayList<>();
        this.communityChestCards = new ArrayList<>();
    }


    private void initializeBoard() {
        squares.add(new Property("Mediterranean Avenue", 60, 2, "Brown"));
        squares.add(new Railroad("Reading Railroad", 200, 25));
        squares.add(new Utility("Electric Company", 150));
        squares.add(new Property("Boardwalk", 400, 50, "Blue"));
        // Add other properties, railroads, utilities, and special squares
    }


    public void placeChanceCard(ChanceCards card) {

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
