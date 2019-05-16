package rpsls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class was created to simulate a Rock, Paper, Scissors, Lizard, Spock 
 * game.
 * 
 * @author Rachel Inderhees
 * @course CIS 2353 
 * @professor John Baugh
 */

class GamePiece implements Comparable { 

    //declares each Piece and the equivalent string values
    public enum Piece {
    ROCK,
    PAPER,
    SCISSORS,
    LIZARD,
    SPOCK;
        //determines the win scheme of the game
        static {
            ROCK.winsAgainst.add(SCISSORS);
            ROCK.winsAgainst.add(LIZARD);
            PAPER.winsAgainst.add(ROCK);
            PAPER.winsAgainst.add(SPOCK);
            SCISSORS.winsAgainst.add(PAPER);
            SCISSORS.winsAgainst.add(LIZARD);
            LIZARD.winsAgainst.add(SPOCK);
            LIZARD.winsAgainst.add(PAPER);
            SPOCK.winsAgainst.add(ROCK);
            SPOCK.winsAgainst.add(SCISSORS);
        }       
        //creates an array that holds the win cases for the Pieces
        private final List<Piece> winsAgainst = new ArrayList<>();  
        //returns whether or not Piece A beat Piece B
        public boolean winsAgainst(Piece otherPiece) {
            return winsAgainst.contains(otherPiece);
        }
    }
    private String playerName; //String holder for Player Name
    private Piece classification; //assigns the enumerator value to the GamePiece
    private String name; //name of the GamePiece
    /*
    * Assigns the default game piece to be Rock.
    */
    public GamePiece() {
        this.classification = Piece.ROCK;
        this.name = "Rock";
        this.playerName = ""; 
    }; //ends GamePiece
    /*
    * Creates a specific GamePiece with a user-chosen classification, name, 
    * and includes the player name given by the player. Checks that the 
    * player name is no longer than 20 characters. 
    * 
    * @param classification Chosen piece.
    * @param name Name of chosen piece.
    * @param playerName Name of player.
    */
    public GamePiece(Piece classification, String name, String playerName) {
        if (!classification.toString().equalsIgnoreCase(name)) {
            System.out.print("Cannot create a gamepiece with a different classification and name.");
        } else {
            this.classification = classification;
            this.name = name;
        } //ensures that the classification and the name are for the same type

        if (playerName.length() > 20)
            System.out.println("Name is too long. Name must have fewer than 20 characters.");
        else
            this.playerName = playerName;
    }; //end GamePiece
    
    public void setPiece(Piece classification) {
        if (!classification.toString().equalsIgnoreCase(this.name)) {
            this.name = classification.toString();  
        }
        this.classification = classification;
    }; //end setPiece

    public void setName(String name) {
        if (!name.equals(classification.toString())) {
            if (name.equalsIgnoreCase("rock")) {
                this.classification = Piece.ROCK;
            } else if (name.equalsIgnoreCase("paper")) {
                this.classification = Piece.PAPER;
            } else if (name.equalsIgnoreCase("scissors")) {
                this.classification = Piece.SCISSORS;
            } else if (name.equalsIgnoreCase("lizard")) {
                this.classification = Piece.LIZARD;
            } else if (name.equalsIgnoreCase("spock")) {
                this.classification = Piece.SPOCK;
            }
        }
        this.name = name;
    }; //end setName

    /*
    * Sets the playerName and checks that it is shorter than 20 characters.
    * @param playerName User-chosen name.
    */
    public void setPlayerName(String playerName) {
        if (playerName.length() > 20)
            System.out.print("Name is too long. Name must have fewer than 20 characters.");
        else
            this.playerName = playerName;
    }; //end setPlayerName

    public Piece getPiece() {
        return classification;
    }; //end getPiece

    public String getName() {
        return name;
    }; //end getName

    public String getPlayerName() {
        return playerName;
    }; //end getPlayerName

    @Override
    public String toString() {
        String returnMessage = "An error occured.";
        switch (this.classification) {
            case ROCK:
                returnMessage = "I'm hard and have sharp edges.";
                break;
            case PAPER:
                returnMessage = "I'm made of trees and can cover a rock easily... and disprove Spock!";
                break;
            case SCISSORS:
                returnMessage = "I'm extra sharp to cut right through paper... and lizards!";
                break;
            case LIZARD:
                returnMessage = "Hssssss!";
                break;
            case SPOCK:
                returnMessage = "It is only logical that you do your CIS 2353 homework.";
                break;
        }
        return returnMessage;
    }; //end toString

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GamePiece) {
            GamePiece otherPiece = (GamePiece)obj;
            if(this.name.equals(otherPiece.getName())&& this.classification.equals((otherPiece.getPiece()))) {
                return true;
            }
        }
        return false;       
    } //end equals
    
    /*
    * Compares instances of Pieces to each other and assigns a numeric value to the 
    * win condition.
    *
    * @param obj The Piece to which the user chosen Piece is compared.
    * @return int An integer representation of the outcome of the game.
    */
    @Override
    public int compareTo(Object obj) {
        GamePiece otherPiece = null; 
        if (obj instanceof GamePiece) {
            otherPiece = (GamePiece)obj;
        } else {
            throw new IllegalArgumentException("Not a valid choice.");
        }
        if (this.getPiece().winsAgainst(otherPiece.getPiece())) {
            return 1;
        } else if(this.getPiece().equals(otherPiece.getPiece())) {
            return 0;
        } else {
            return -1;
        }    
    } //end compareTo
} //end class GamePiece