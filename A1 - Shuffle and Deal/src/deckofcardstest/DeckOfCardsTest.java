/**
 * This program will use the Card and DeckOfCards classes to display the contents of 
 * two hands. The Hand class was created to compare the value of each hand and 
 * determine a winner, but the Hand class is not operational.
 */
package deckofcardstest;

/**
 *
 * @author diane
 */
public class DeckOfCardsTest {
    // execute application

    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        Card[] hand1 = new Card[5]; // store five cards
        Card[] hand2 = new Card[5]; // store five cards
        
        
        // get first five cards
        System.out.printf("%n%-18s\t%-18s","Hand 1:","Hand 2:");
        for (int i = 0; i < 5; i++) {
            hand1[i] = myDeckOfCards.dealCard(); // get next card
            hand2[i] = myDeckOfCards.dealCard(); // get next card
            System.out.printf("%n%-18s\t%-18s",hand1[i], hand2[i]);
        }

        // display result
        System.out.println("\n\nHand 1 contains:");
        int couples1 = myDeckOfCards.pairs(hand1); // a pair
        myDeckOfCards.twoPairs(couples1); // two pairs
        int triples1 = myDeckOfCards.threeOfAKind(hand1); // three of a kind
        myDeckOfCards.fourOfAKind(hand1); // four of a kind
        myDeckOfCards.flush(hand1); // a flush
        myDeckOfCards.straight(hand1); // a straight
        myDeckOfCards.fullHouse(couples1, triples1); // a full house
        
        System.out.println("\nHand 2 contains:");
        int couples2 = myDeckOfCards.pairs(hand2); // a pair
        myDeckOfCards.twoPairs(couples2); // two pairs
        int triples2 = myDeckOfCards.threeOfAKind(hand2); // three of a kind
        myDeckOfCards.fourOfAKind(hand2); // four of a kind
        myDeckOfCards.flush(hand2); // a flush
        myDeckOfCards.straight(hand2); // a straight
        myDeckOfCards.fullHouse(couples2, triples2); // a full house
        
     
     /* This is my attempt to implement the Hand Class. The Hand class is currently not functioning properly.
        Hand hand1 = new Hand();
        
        for (int i = 0; i < 5; i++) {
            hand1.setCard(myDeckOfCards.dealCard(), i); // get next card
        }

        // display result
        System.out.println("\nHand contains:");

        myDeckOfCards.pairs(hand1); // a pair
        myDeckOfCards.twoPairs(hand1); // two pairs
        myDeckOfCards.threeOfAKind(hand1); // three of a kind
        myDeckOfCards.fourOfAKind(hand1); // four of a kind
        myDeckOfCards.flush(hand1); // a flush
        myDeckOfCards.straight(hand1); // a straight
        myDeckOfCards.fullHouse(hand1); // a full house
*/
    }

}
