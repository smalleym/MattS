/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathbox;

import java.util.concurrent.atomic.AtomicReference;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
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

/**
 *
 * @author smalleym
 */
public class Deathbox extends Application {
    //final AtomicReference<boolean> c = new AtomicReference<Card>(false);
    private ImageView cardtable;
    private ImageView stop;
    private Rectangle table;
    
    
    private  double startX = 350;
    private  double startY = 80;
    private final double initial = 350;   
    private boolean gameOver = false;
    
    public Pane root = new Pane();
    
    private ImageView card1;
    private double sX =0;
    private DoubleProperty coodXReal = new SimpleDoubleProperty(0);
    private Game game;
    
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
        root.getChildren().addAll(cardtable, stop);
        placeCards();
        setClickAction();
        //play();
        
        //boolean clicked = false;
        int size = root.getChildren().size();
        Scene scene = new Scene(root, 1400, 800); 
        scene.setFill(null);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
//         while(!gameOver){
//      
//             if (root.getChildren().size() > size) {
//                 root.getChildren().get(size + 1).setLayoutX(game.getGame()[0][0].peek().getX());
//                 root.getChildren().get(size + 1).setLayoutY(game.getGame()[0][0].peek().getY());
//             }
//             
//         }
    }
    

    private void setClickAction() {
        for(int i = 0; i< game.getGame().length; i++){
            for(int j = 0; j< game.getGame().length; j++){
                
                game.getGame()[i][j].peek().setOnMouseClicked(new EventHandler<MouseEvent>(){
                    @Override
                    public void handle(MouseEvent event) {
                        Card c = game.grabDeck().pluck();
                        //c.setXVal(game.getGame()[i][j].peek().getX());
                        //c.setYVal(game.getGame()[i][j].peek().getY());
                        root.getChildren().add(c);
                        //c.setXVal();
                    }
                    
                    
                });
                
            }
        }
    }
    
//    private void play(){
//      Iterator it = root.getChildren().iterator();
//      while(it.hasNext()){
//          Card c;
//          if(c.isPressed()){
//              double indexX = c.getX();
//              double indexY = c.getY();
//              root.getChildren().add(c);
//          }
//      }
//    }
    
    private void placeCards(){
        ImageView deck = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/playing-card-back.jpg")));
        deck.setFitWidth(165);
        deck.setFitHeight(200);
        deck.setPreserveRatio(true);
        deck.setX(1150);
        deck.setY(300);
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10.0);
        dropShadow.setOffsetY(10.0);
        deck.setEffect(dropShadow);
        
        root.getChildren().add(deck);
        

        for(int i = 0; i< game.getGame().length; i++){
            for(int j = 0; j<game.getGame().length; j++){
                Card temp = (Card)game.getGame()[i][j].peek();
                temp.setXVal(startX);
                temp.setYVal(startY);
                //root.getChildren().add(game.getGame()[i][j].peek());
                
                
                
                root.getChildren().add(temp);
                incrementX();
                
            }
            startX = initial;
            incrementY();
        }
    }

    
    
    
    public void incrementX(){
        startX += 250;
    }
    
    public void incrementY(){
        startY += 250;
    }
    
    private void setDrag() {
        cardtable.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                sX = t.getSceneX() - coodXReal.getValue();
            }
        });
        
        cardtable.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                coodXReal.setValue(t.getSceneX() - sX);
            }
        });
        
        cardtable.xProperty().bind(coodXReal);
        
//        card1.setOnMouseEntered(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                card1.setOpacity(1.0);
//            }
//        });
//        
//        card1.setOnMouseExited(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                card1.setOpacity(0.0);
//            }
//        });
    }
    

    /*
     * Sets the Quit Button
     */
    private void setQuit() {
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
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
