package deathbox;

import java.util.LinkedList;
import javafx.scene.layout.Pane;

/**
 *
 * @author smalleym
 */
public class Game{
    
    private static LinkedList<Card> [][] display;
    private static Deck deck;
    private static LinkedList<Card> temp = new LinkedList<Card>();
    
    /*
    Constructor
    */
    public Game(){
        
        display = new LinkedList[3][3];
        for(int i = 0; i < display.length; i++){
            for(int j = 0; j < display.length; j++){
                display[i][j] = new LinkedList<Card>();
            }
        }
        deck = new Deck();
    }
    
    
    /*
    Builds initial card locations for the Game.
    */
    public void buildGame(){
        for(int i = 0; i < display.length; i++){
            for(int j = 0; j < display.length; j++){
                display[i][j].push(deck.pluck());
                //System.out.print(display[i][j].peek().getValue());
            }
            //System.out.println();
        }
    }
    
    
    public static void pluckACard(Card c){
        for(int i = 0; i<display.length; i++){
            for(int j = 0; j<display.length; j++){
                if(display[i][j].get(0).cardWasPressed() == true){
                    display[i][j].push(c);
                    //System.out.println(display[i][j].peek().getValue());
                }
            }
        }  
    }
    
    
    public static LinkedList<Card> getPile(Card c){
        for (int i = 0; i < display.length; i++) {
            
            for (int j = 0; j < display.length; j++) {
               
                if (display[i][j].peek().cardWasPressed() == true) {
                    temp = display[i][j];
                }
            }
        }
        return temp;
        
    }
    
    public static LinkedList<Card> getPile2(){
        
        for (int i = 0; i < display.length; i++) {
            
            for (int j = 0; j < display.length; j++) {
                
                if (display[i][j].peek().cardWasEntered() == true) {
                    temp = display[i][j];
                    display[i][j].peek().setIfEntered(false);
                }
            }
        }
        return temp;
    }
    
    public static void unMark(Card c){
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display.length; j++) {
                if(!display[i][j].get(0).getValue().equals(c.getValue())){
                  
                    display[i][j].peek().setIfPressed(false);

                    Deathbox.root.getChildren().remove(Card.low);
                    Deathbox.root.getChildren().remove(Card.high);
                }
            }
        }
    }
 
    
    //*************************** Accessor Methods *************************************
    
    public static LinkedList<Card>[][] getGame(){
        return display;
    }
    
    
    public static Deck grabDeck(){
        return deck;
    }
    
    //************************************************************************************
    
    
    public static void main(String[] args){
        //Game g = new Game();
        //g.buildGame();
        //g.start(Stage primaryStage); 
    }
}
