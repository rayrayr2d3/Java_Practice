/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls;

/**
 *
 * @author rachelinderhees
 */

public class RPSLS {

    public static void main(String [] args) {
        GamePiece winner = new GamePiece(GamePiece.Piece.SPOCK, "spock", "Rachel"); //control
        System.out.println(winner.getPiece());
        System.out.println(winner.getName());
        GamePiece loser = new GamePiece(GamePiece.Piece.ROCK, "rock", "Nathan"); //doesn't allow the creation of a name longer than 20 characters
        System.out.println(loser.getPiece());
        System.out.println(loser.getName());
        winner.setPiece(GamePiece.Piece.LIZARD);
        System.out.println(winner.getPiece());
        System.out.println(winner.getName());
        loser.setPiece(GamePiece.Piece.SPOCK);
        System.out.println(loser.getPiece());
        System.out.println(loser.getName());
        System.out.println(loser.getPlayerName());
        System.out.println(winner.getPlayerName());
        System.out.println(winner.toString());
        System.out.println(loser.toString());
        System.out.println(winner.equals(loser));
        System.out.println(loser.equals(winner));
        System.out.println(winner.compareTo(loser));
        
        //the following creates instances of each GamePiece
        GamePiece rock = new GamePiece(GamePiece.Piece.ROCK, "Rock", "Rachel");
        GamePiece paper = new GamePiece(GamePiece.Piece.PAPER, "Paper","Kyle");
        GamePiece scissors = new GamePiece(GamePiece.Piece.SCISSORS, "Scissors", "Rachel");
        GamePiece lizard = new GamePiece(GamePiece.Piece.LIZARD, "Lizard", "Rachel");
        GamePiece spock = new GamePiece(GamePiece.Piece.SPOCK, "spock", "Rachel");
        
        //the following tests all possible win cases
        System.out.println(rock.compareTo(scissors));
        System.out.println(rock.compareTo(lizard));
        System.out.println(paper.compareTo(rock));
        System.out.println(paper.compareTo(spock));
        System.out.println(scissors.compareTo(paper));
        System.out.println(scissors.compareTo(lizard));
        System.out.println(lizard.compareTo(spock));
        System.out.println(lizard.compareTo(paper));
        System.out.println(spock.compareTo(rock));
        System.out.println(spock.compareTo(scissors));
        
        //tests all the possible losing cases
        System.out.println(scissors.compareTo(rock));
        System.out.println(lizard.compareTo(rock));
        System.out.println(rock.compareTo(paper));
        System.out.println(spock.compareTo(paper));
        System.out.println(paper.compareTo(scissors));
        System.out.println(lizard.compareTo(scissors));
        System.out.println(spock.compareTo(lizard));
        System.out.println(paper.compareTo(lizard));
        System.out.println(rock.compareTo(spock));
        System.out.println(scissors.compareTo(spock));
        
        //tests all the tied cases
        System.out.println(rock.compareTo(rock));
        System.out.println(paper.compareTo(paper));
        System.out.println(scissors.compareTo(scissors));
        System.out.println(lizard.compareTo(lizard));
        System.out.println(spock.compareTo(spock));
        
        //tests empty GamePiece constructor
        GamePiece cat = new GamePiece();
        System.out.println(cat);
        
        //tests equals method
        System.out.println(cat.equals(rock));
        System.out.println(cat.equals(scissors));
        
        //tests setPlayerName and getPlayerName
        cat.setPlayerName("George");
        System.out.println(cat.getPlayerName());
        
    }
}