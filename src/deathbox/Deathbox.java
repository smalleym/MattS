/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathbox;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author smalleym
 */
public class Deathbox extends Application {
    private ImageView cardtable;
    private ImageView stop;
    private ImageView deck;
    private Rectangle table;
    
    public  static double startX = 300;
    public  static double startY = 40;
    public  static double cardStartX = 1150;
    public  static double cardStartY = 300;
    public  static double onTop = 0;
    public static final double initial = 300;   
    private boolean gameOver = false;
    private static Card temp;
    private static TranslateTransition transition;
    
    
    public static Pane root = new Pane();
    private Game game;
    
    /*
    Places initial cards on Table.
    */
    private void placeCards(){
        //Card temp;
        
        for(int i = 0; i< Game.getGame().length; i++){
            
            for(int j = 0; j<Game.getGame().length; j++){
                
                temp = (Card)Game.getGame()[i][j].peek();
                temp.setXVal(cardStartX);
                temp.setYVal(cardStartY);
                
                Timeline timeline = new Timeline();

                KeyFrame end = new KeyFrame(Duration.seconds(1),
                        new KeyValue(temp.xProperty(), startX),
                        new KeyValue(temp.yProperty(), startY));

                timeline.getKeyFrames().add(end);


                timeline.play();
                root.getChildren().add(temp);
                incrementX();
                
//               
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
        deck.setX(cardStartX);
        deck.setY(cardStartY);
        
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
   
    
   //******************************** Accessor Methods ******************************************
    
    
    public static void incrementX(){
        startX += 300;
    }
    
    public static void incrementY(){
        startY += 250;
    }
  
    
     public static Pane getRoot(){
        return root;
    }
    
 //**********************************************************************************************
   
    @Override
    public void start(Stage primaryStage) {
        
        game = new Game();
        game.buildGame();
        
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        cardtable = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/cardtable.jpg")));
        table = new Rectangle(1400, 800);
        table.setArcHeight(20);
        table.setArcWidth(20);
        
        cardtable.setClip(table);
        root.getChildren().addAll(cardtable);
        
        
        
        
        setQuit();
        root.getChildren().addAll(stop, deck);
        placeCards();
        
        Scene scene = new Scene(root, 1400, 800); 
        scene.setFill(null);
        primaryStage.setScene(scene);
        primaryStage.show();
       
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
