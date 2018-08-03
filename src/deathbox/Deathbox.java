/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathbox;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author smalleym
 */
public class Deathbox extends Application {
    
    private ImageView cardtable;
    private ImageView stop;
    private Rectangle table;
    
    private  double startX = 350;
    private  double startY = 80;
    private final double initial = 350;       
    
    public Pane root = new Pane();
    
    private ImageView card1;
    private int test = 0;
    private double sX =0;
    private DoubleProperty coodXReal = new SimpleDoubleProperty(0);
    private Game game;
    
    @Override
    public void start(Stage primaryStage) {
        test = 24;
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
        
        Scene scene = new Scene(root, 1400, 800); 
        scene.setFill(null);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    private void placeCards(){
        game = new Game();
        game.buildGame();
        
        for(int i = 0; i< game.getGame().length; i++){
            for(int j = 0; j<game.getGame().length; j++){
                Card temp = (Card)game.getGame()[i][j].peek();
                temp.setXVal(startX);
                temp.setYVal(startY);
                root.getChildren().add(game.getGame()[i][j].peek()); 
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
