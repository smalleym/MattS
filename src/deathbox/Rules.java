/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathbox;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author smalleym
 */
public class Rules implements EventHandler<MouseEvent>{
    
    @Override
    public void handle(MouseEvent e){
    }
    
    public void handle(MouseEvent m, Pane r, Game g){
        Card c = g.grabDeck().pluck();
        r.getChildren().add(c);
    }
    
    
    public void event2(MouseEvent m){
        
    }
}
