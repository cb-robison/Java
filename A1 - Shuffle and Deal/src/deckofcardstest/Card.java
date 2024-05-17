/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcardstest;

/**
 *
 * @author diane
 */
public class Card {

    private final String face; // face of card
    private final String suit; // suit of card

    // constructor
    public Card(String cardFace, String cardSuit) {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    }

    // return card face
    public String getFace() {
        return face;
    }

    // return card suit
    public String getSuit() {
        return suit;
    }

    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    }
}
