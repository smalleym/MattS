package deathbox;

import java.util.LinkedList;
import javafx.stage.Stage;

/**
 *
 * @author smalleym
 */
public class Game{
    
    private LinkedList<Card> [][] display;
    private Deck deck;
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
    
    
//    public void pluckACard(LinkedList<Card>[][] board, Deck deck){
//        for(int i = 0; i<board.length; i++){
//            for(int j = 0; j<board.length; j++){
//                if(board.)
//            }
//        }
//    }
    
    
    //*************************** Accessor Methods *************************************
    
    public LinkedList<Card>[][] getGame(){
        return display;
    }
    
    
    public Deck grabDeck(){
        return deck;
    }
    
    //************************************************************************************
    
    
    public static void main(String[] args){
        Game g = new Game();
        g.buildGame();
        //g.start(Stage primaryStage); 
    }
}
