/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathbox;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author smalleym
 */
public class Deathbox extends Application {
    //final AtomicReference<boolean> c = new AtomicReference<Card>(false);
    private ImageView cardtable;
    private ImageView stop;
    private ImageView deck;
    private Rectangle table;
    
    public  static double startX = 300;
    public  static double startY = 40;
    public  static double onTop = 0;
    public static final double initial = 300;   
    private boolean gameOver = false;
    
    
    public static Pane root = new Pane();
    private Game game;
    private int rootSize;
    
    
    public static Pane getRoot(){
        return root;
    }

     /*
    Places initial cards on Table.
    */
    private void updatePlaceCards(){
        for(int i = 0; i< Game.getGame().length; i++){
            
            for(int j = 0; j<Game.getGame().length; j++){
                
                for (int k = 0; k < Game.getGame()[i][j].size(); k++) {

                    Card temp = (Card) Game.getGame()[i][j].get(k);
                    temp.setXVal(startX + onTop);
                    temp.setYVal(startY + onTop);
                    root.getChildren().add(temp);
                    onTop+=5;
                    onTop+=5;
                }
                onTop = 0;
                incrementX();
            }
            startX = initial;
            incrementY();
        }
    }
        
    /*
    Places initial cards on Table.
    */
    private void placeCards(){
        for(int i = 0; i< Game.getGame().length; i++){
            
            for(int j = 0; j<Game.getGame().length; j++){
                
                Card temp = (Card)Game.getGame()[i][j].peek();
                temp.setXVal(startX);
                temp.setYVal(startY);
                root.getChildren().add(temp);
                incrementX();
            }
            startX = initial;
            incrementY();
        }
    }
    
    /*
     * Sets the Quit Button
     */
    private void setQuit() {
        deck = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/playing-card-back.jpg")));
        deck.setFitWidth(165);
        deck.setFitHeight(200);
        deck.setPreserveRatio(true);
        deck.setX(1150);
        deck.setY(300);
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10.0);
        dropShadow.setOffsetY(10.0);
        deck.setEffect(dropShadow);
        
        
        
        stop = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/close.png")));
        stop.setFitHeight(25);
        stop.setFitWidth(25);
        stop.setX(20);
        stop.setY(10);
        
        stop.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.exit(0);
            }
        });
    }
   
    
    
    public static void incrementX(){
        startX += 300;
    }
    
    public static void incrementY(){
        startY += 250;
    }
    

    
//    private void setDrag() {
//        cardtable.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent t) {
//                sX = t.getSceneX() - coodXReal.getValue();
//            }
//        });
//        
//        cardtable.setOnMouseDragged(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent t) {
//                coodXReal.setValue(t.getSceneX() - sX);
//            }
//        });
//        
//        cardtable.xProperty().bind(coodXReal);
//    }
    
    
    @Override
    public void start(Stage primaryStage) {
        
        game = new Game();
        game.buildGame();
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        cardtable = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/cardtable.jpg")));
        table = new Rectangle(1400, 800);
        table.setArcHeight(20);
        table.setArcWidth(20);
        
        //setDrag();
        cardtable.setClip(table);
        setQuit();
        root.getChildren().addAll(cardtable, stop, deck);
        
        
        placeCards();
        //Deathbox.highOrLow();
        //rootSize = root.getChildren().size();
        //setClickAction();
        
        //root.getChildren()
        
        Scene scene = new Scene(root, 1400, 800); 
        scene.setFill(null);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        //while(gameOver == false){
          //  updateGame();
        //}
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//        }
    }

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
        //while(gameOver == false){
            
        //}
    }
    
}
