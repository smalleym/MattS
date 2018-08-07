package deathbox;

import javafx.beans.property.DoubleProperty;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Card extends ImageView{
	
    private String value;
    private final double FITHEIGHT = 200;
    private final double FITWIDTH = 165;
	
    public Card(String value) {
        this.value = value;

        switch (value) {
            case "2C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_clubs.png")));
                addCardEffects(this);
                break;

            case "3C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_clubs.png")));
                addCardEffects(this);
                break;

            case "4C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_clubs.png")));
                addCardEffects(this);
                break;

            case "5C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_clubs.png")));
                addCardEffects(this);
                break;

            case "6C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_clubs.png")));
                addCardEffects(this);
                break;

            case "7C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_clubs.png")));
                addCardEffects(this);
                break;

            case "8C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_clubs.png")));
                addCardEffects(this);
                break;

            case "9C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_clubs.png")));
                addCardEffects(this);
                break;

            case "10C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_clubs.png")));
                addCardEffects(this);
                break;

            case "JC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_clubs.png")));
                addCardEffects(this);
                break;

            case "QC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_clubs.png")));
                addCardEffects(this);
                break;

            case "KC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_clubs.png")));
                addCardEffects(this);
                break;

            case "AC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_clubs.png")));
                addCardEffects(this);
                break;

            case "2D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "3D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "4D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "5D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "6D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "7D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "8D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "9D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "10D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "JD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "QD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "KD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "AD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_diamonds.png")));
                addCardEffects(this);
                break;

            case "2S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_spades.png")));
                addCardEffects(this);
                break;

            case "3S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_spades.png")));
                addCardEffects(this);
                break;

            case "4S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_spades.png")));
                addCardEffects(this);
                break;

            case "5S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_spades.png")));
                addCardEffects(this);
                break;

            case "6S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_spades.png")));
                addCardEffects(this);
                break;

            case "7S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_spades.png")));
                addCardEffects(this);
                break;

            case "8S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_spades.png")));
                addCardEffects(this);
                break;

            case "9S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_spades.png")));
                addCardEffects(this);
                break;

            case "10S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_spades.png")));
                addCardEffects(this);
                break;

            case "JS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_spades.png")));
                addCardEffects(this);
                break;

            case "QS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_spades.png")));
                addCardEffects(this);
                break;

            case "KS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_spades.png")));
                addCardEffects(this);
                break;

            case "AS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_spades.png")));
                addCardEffects(this);
                break;

            case "2H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_hearts.png")));
                addCardEffects(this);
                break;

            case "3H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_hearts.png")));
                addCardEffects(this);
                break;

            case "4H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_hearts.png")));
                addCardEffects(this);
                break;

            case "5H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_hearts.png")));
                addCardEffects(this);
                break;

            case "6H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_hearts.png")));
                addCardEffects(this);
                break;

            case "7H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_hearts.png")));
                addCardEffects(this);
                break;

            case "8H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_hearts.png")));
                addCardEffects(this);
                break;

            case "9H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_hearts.png")));
                addCardEffects(this);
                break;

            case "10H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_hearts.png")));
                addCardEffects(this);
                break;

            case "JH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_hearts.png")));
                addCardEffects(this);
                break;

            case "QH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_hearts.png")));
                addCardEffects(this);
                break;

            case "KH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_hearts.png")));
                addCardEffects(this);
                break;

            case "AH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_hearts.png")));
                addCardEffects(this);

                break;
        }
    }
    
    
    /*
    Adds effects to the card.
    */
    private void addCardEffects(Card card){
        card.setFitWidth(FITWIDTH);
        card.setFitHeight(FITHEIGHT);
        card.setPreserveRatio(true);
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10.0);
        dropShadow.setOffsetY(10.0);
        card.setEffect(dropShadow);
        
        card.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int depth = 70;
                
                DropShadow borderGlow = new DropShadow();
                borderGlow.setOffsetY(10.0);
                borderGlow.setOffsetX(10.0);
                borderGlow.setColor(Color.YELLOW);
                borderGlow.setWidth(depth);
                borderGlow.setHeight(depth);
                
                card.setEffect(borderGlow);
            } 
        });
        
        card.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                card.setEffect(dropShadow);
            }
        });
        
        
        
    }

    //************************* Accessor Methods ********************************/
    public String getValue() {
        return value;
    }

    public void setValue(String newValue) {
        value = newValue;
    }
    
    public void setXVal(double x){
        this.setX(x);
    }
    
    public void setYVal(double y){
        this.setY(y);
    }
    
    //*****************************************************************************/

    public static void main(String[] args) {

        // TODO Auto-generated method stub
    }

}
