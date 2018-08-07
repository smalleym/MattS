/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deathbox;

/**
 *
 * @author smalleym
 */
public class Player {
    
    private int turnsLeft;
    private String playerName;
    
    
    public Player(String playerName){
        turnsLeft = 3;
        this.playerName = playerName;
    }
    
    
    
    /****************** Accessor Methods *******************************
     * 
     * 
     */
    public int getTurnsLeft(){
        return turnsLeft;
    }
    
    public void takeTurn(int t){
        turnsLeft--;
    }
    
    public void restartTurns(){
        turnsLeft = 3;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    
    
    //********************************************************************
    
    
    public static void main(String[] args){
        
    }
}
