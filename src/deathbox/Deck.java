package deathbox;

import java.util.*;


/*
 * Class that represents a deck of Cards
 */
public class Deck {
	
	private ArrayList<Card> deck;
	private LinkedList<Card> gameDeck = new LinkedList<Card>();    
	
	public Deck() {
		deck = new ArrayList<Card>();
		deck.add(new Card("2D"));
		deck.add(new Card("3D"));
		deck.add(new Card("4D"));
		deck.add(new Card("5D"));
		deck.add(new Card("6D"));
		deck.add(new Card("7D"));
		deck.add(new Card("8D"));
		deck.add(new Card("9D"));
		deck.add(new Card("10D"));
		deck.add(new Card("JD"));
		deck.add(new Card("QD"));
		deck.add(new Card("KD"));
		deck.add(new Card("AD"));
		deck.add(new Card("2C"));
		deck.add(new Card("3C"));
		deck.add(new Card("4C"));
		deck.add(new Card("5C"));
		deck.add(new Card("6C"));
		deck.add(new Card("7C"));
		deck.add(new Card("8C"));
		deck.add(new Card("9C"));
		deck.add(new Card("10C"));
		deck.add(new Card("JC"));
		deck.add(new Card("QC"));
		deck.add(new Card("KC"));
		deck.add(new Card("AC"));
		deck.add(new Card("2S"));
		deck.add(new Card("3S"));
		deck.add(new Card("4S"));
		deck.add(new Card("5S"));
		deck.add(new Card("6S"));
		deck.add(new Card("7S"));
		deck.add(new Card("8S"));
		deck.add(new Card("9S"));
		deck.add(new Card("10S"));
		deck.add(new Card("JS"));
		deck.add(new Card("QS"));
		deck.add(new Card("KS"));
		deck.add(new Card("AS"));
		deck.add(new Card("2H"));
		deck.add(new Card("3H"));
		deck.add(new Card("4H"));
		deck.add(new Card("5H"));
		deck.add(new Card("6H"));
		deck.add(new Card("7H"));
		deck.add(new Card("8H"));
		deck.add(new Card("9H"));
		deck.add(new Card("10H"));
		deck.add(new Card("JH"));
		deck.add(new Card("QH"));
		deck.add(new Card("KH"));
		deck.add(new Card("AH"));
		
		Collections.shuffle(deck);
		
		
		for(int i = 0; i<deck.size(); i++) {
			//System.out.print(deck.get(i).getValue());
                        gameDeck.push(deck.get(i));
		}
		
		
	}
	
        /*
         *Shuffles the Deck
         */
	public void shuffle(LinkedList d){
            Collections.shuffle(d);
        }
        
        /*
         Gets the next Card from the top of the Deck.
        */
        public Card pluck(){
            return gameDeck.pop();
        }
	
	//**************************** Accessor Method ********************************
	
	public LinkedList getGameDeck() {
		return gameDeck;
	}

	
        //******************************************************************************
        
        
        
	public static void main(String[] args) {
		Deck d = new Deck();
	}
}
