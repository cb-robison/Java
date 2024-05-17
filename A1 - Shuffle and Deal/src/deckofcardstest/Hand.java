/*
 * This class is not functional. 
 * It was an attempt to store information about each hand in its own class.
 */

package deckofcardstest;

/**
 * Author: Connor Robison
 * Date: 2/19/23
 */
public class Hand {
    /*Class Attributes*/
    private final int SIZE = 5;     // number of cards in each hand
    private Card[] hand = new Card[SIZE];
    private int[] contains = new int[7];    // an array storing the contents of the card 
    // i.e. pairs, three or a kind, four of a kind, flush, straight, full house, and two pairs
    
    
    /*Class Methods*/public Card[] getHand(){
        return hand;
    }
    
    public void setContains(int num, int index){
        contains[index] += num;
    }
    
    public int getCouples(){
        return contains[0];
    }
    
    public int getTriples(){
        return contains[1];
    }
    
    public Card getCard(int index){
        return hand[index];
    }
    
    public void setCard(Card myCard, int index){
        hand[index] = myCard;
    }
    
    public int getValue(){
        int value = 0;  // approximate value of the hand
        for( int i =0; i<contains.length; i++){
            value += contains[i]*(i+1);
        }
        
        return value;
    }
    
    // Note: this algorith has limitations. 
    // It does not know all hand types and does not compare the value of card
}
