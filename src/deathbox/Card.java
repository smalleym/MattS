package deathbox;

//import static deathbox.Deathbox.root;
import java.util.LinkedList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Card extends ImageView {

    private String value;
    private final double FITHEIGHT = 200;
    private final double FITWIDTH = 165;
    private int rank;
    private boolean isPressed = false;
    private boolean isEntered = false;
    public static boolean picked = false;
    private LinkedList<Card> list = new LinkedList<Card>();
    private LinkedList<Card> temp = new LinkedList<Card>();
    private String choice = "";

    public Card(String value) {
        this.value = value;

        switch (value) {
            case "2C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_clubs.png")));
                addCardEffects(this);
                rank = 2;
                break;

            case "3C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_clubs.png")));
                addCardEffects(this);
                rank = 3;
                break;

            case "4C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_clubs.png")));
                addCardEffects(this);
                rank = 4;
                break;

            case "5C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_clubs.png")));
                addCardEffects(this);
                rank = 5;
                break;

            case "6C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_clubs.png")));
                addCardEffects(this);
                rank = 6;
                break;

            case "7C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_clubs.png")));
                addCardEffects(this);
                rank = 7;
                break;

            case "8C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_clubs.png")));
                addCardEffects(this);
                rank = 8;
                break;

            case "9C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_clubs.png")));
                addCardEffects(this);
                rank = 9;
                break;

            case "10C":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_clubs.png")));
                addCardEffects(this);
                rank = 10;
                break;

            case "JC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_clubs.png")));
                addCardEffects(this);
                rank = 11;
                break;

            case "QC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_clubs.png")));
                addCardEffects(this);
                rank = 12;
                break;

            case "KC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_clubs.png")));
                addCardEffects(this);
                rank = 13;
                break;

            case "AC":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_clubs.png")));
                addCardEffects(this);
                rank = 14;
                break;

            case "2D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_diamonds.png")));
                addCardEffects(this);
                rank = 2;
                break;

            case "3D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_diamonds.png")));
                addCardEffects(this);
                rank = 3;
                break;

            case "4D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_diamonds.png")));
                addCardEffects(this);
                rank = 4;
                break;

            case "5D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_diamonds.png")));
                addCardEffects(this);
                rank = 5;
                break;

            case "6D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_diamonds.png")));
                addCardEffects(this);
                rank = 6;
                break;

            case "7D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_diamonds.png")));
                addCardEffects(this);
                rank = 7;
                break;

            case "8D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_diamonds.png")));
                addCardEffects(this);
                rank = 8;
                break;

            case "9D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_diamonds.png")));
                addCardEffects(this);
                rank = 9;
                break;

            case "10D":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_diamonds.png")));
                addCardEffects(this);
                rank = 10;
                break;

            case "JD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_diamonds.png")));
                addCardEffects(this);
                rank = 11;
                break;

            case "QD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_diamonds.png")));
                addCardEffects(this);
                rank = 12;
                break;

            case "KD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_diamonds.png")));
                addCardEffects(this);
                rank = 13;
                break;

            case "AD":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_diamonds.png")));
                addCardEffects(this);
                rank = 14;
                break;

            case "2S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_spades.png")));
                addCardEffects(this);
                rank = 2;
                break;

            case "3S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_spades.png")));
                addCardEffects(this);
                rank = 3;
                break;

            case "4S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_spades.png")));
                addCardEffects(this);
                rank = 4;
                break;

            case "5S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_spades.png")));
                addCardEffects(this);
                rank = 5;
                break;

            case "6S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_spades.png")));
                addCardEffects(this);
                rank = 6;
                break;

            case "7S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_spades.png")));
                addCardEffects(this);
                rank = 7;
                break;

            case "8S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_spades.png")));
                addCardEffects(this);
                rank = 8;
                break;

            case "9S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_spades.png")));
                addCardEffects(this);
                rank = 9;
                break;

            case "10S":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_spades.png")));
                addCardEffects(this);
                rank = 10;
                break;

            case "JS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_spades.png")));
                addCardEffects(this);
                rank = 11;
                break;

            case "QS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_spades.png")));
                addCardEffects(this);
                rank = 12;
                break;

            case "KS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_spades.png")));
                addCardEffects(this);
                rank = 13;
                break;

            case "AS":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_spades.png")));
                addCardEffects(this);
                rank = 14;
                break;

            case "2H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/2_of_hearts.png")));
                addCardEffects(this);
                rank = 2;
                break;

            case "3H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/3_of_hearts.png")));
                addCardEffects(this);
                rank = 3;
                break;

            case "4H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/4_of_hearts.png")));
                addCardEffects(this);
                rank = 4;
                break;

            case "5H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/5_of_hearts.png")));
                addCardEffects(this);
                rank = 5;
                break;

            case "6H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/6_of_hearts.png")));
                addCardEffects(this);
                rank = 6;
                break;

            case "7H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/7_of_hearts.png")));
                addCardEffects(this);
                rank = 7;
                break;

            case "8H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/8_of_hearts.png")));
                addCardEffects(this);
                rank = 8;
                break;

            case "9H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/9_of_hearts.png")));
                addCardEffects(this);
                rank = 9;
                break;

            case "10H":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/10_of_hearts.png")));
                addCardEffects(this);
                rank = 10;
                break;

            case "JH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/jack_of_hearts.png")));
                addCardEffects(this);
                rank = 11;
                break;

            case "QH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/queen_of_hearts.png")));
                addCardEffects(this);
                rank = 12;
                break;

            case "KH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/king_of_hearts.png")));
                addCardEffects(this);
                rank = 13;
                break;

            case "AH":
                this.setImage(new Image(Deathbox.class.getResourceAsStream("images/ace_of_hearts.png")));
                addCardEffects(this);
                rank = 14;
                break;
        }
    }

    /*
    Adds effects to the card.
     */
    private void addCardEffects(Card card) {
        card.setFitWidth(FITWIDTH);
        card.setFitHeight(FITHEIGHT);
        card.setPreserveRatio(true);

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10.0);
        dropShadow.setOffsetY(10.0);
        card.setEffect(dropShadow);

        card.setOnMouseEntered(new EventHandler<MouseEvent>() {
            Text text = new Text();

            @Override
            public void handle(MouseEvent event) {
                int depth = 70;

                DropShadow borderGlow = new DropShadow();
                borderGlow.setOffsetY(5.0);
                borderGlow.setOffsetX(5.0);
                borderGlow.setColor(Color.YELLOW);
                borderGlow.setWidth(depth);
                borderGlow.setHeight(depth);

                card.setEffect(borderGlow);

//                double plusY = 0;
//                isEntered = true;
//                
//                list.addAll(Game.getPile());
//                if(list.isEmpty() || list.size() < 2){
//                    list.clear();
//                    return;
//                } else{
//                    //for (int i = 0; i < list.size(); i++) {
//                        
//                        Card c = list.peekLast();
//                        c.setFitHeight(70);
//                        c.setFitWidth(57);
//                        c.setOpacity(.75);
//                        c.setXVal(getX() - 50);
//                        c.setYVal(getY() + plusY);
//                        c.setDisable(true);
//                        temp.push(c);
//                        Deathbox.root.getChildren().add(c);
//                        plusY += 81;
//                    //}
//                    
//                }
                //for (int i = 0; i < temp.size(); i++) {
                //  Deathbox.root.getChildren().add(temp.pop());
                //}
                //list.removeAll(temp);
                //list.addAll(temp);
                //Deathbox.displayPile();
                //temp = new LinkedList<Card>();
            }
        });

        card.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                card.setEffect(dropShadow);
                //for(int i = 0; i<list.size(); i++){
                //  if(list.isEmpty() == true){
                //    Deathbox.root.getChildren().remove(list.pop());
                // }
                // }
                isEntered = false;
            }
        });

        card.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                isPressed = true;
                highOrLow(card);
                
            }
        });

    }
    
    
    
    private void highOrLow(Card c){
        ImageView high = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/up_arrow.png")));
        ImageView low = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/down_arrow.png")));
        high.setFitHeight(40);
        high.setFitWidth(40);
        high.setX(c.getX() + c.getFitWidth());
        high.setY(c.getY() + 10);
        
        
        low.setFitHeight(40);
        low.setFitWidth(40);
        low.setX(c.getX( )+ c.getFitWidth());
        low.setY(c.getY() + 50);
        
        
        Button button1 = new Button();
        button1.setGraphic(high);
        
        Button button2 = new Button();
        button2.setGraphic(low);
                
        DropShadow borderGlow = new DropShadow();
        borderGlow.setOffsetY(1.0);
        borderGlow.setOffsetX(1.0);
        borderGlow.setColor(Color.YELLOW);
        borderGlow.setWidth(20);
        borderGlow.setHeight(20);
        
        high.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               high.setEffect(borderGlow);
            }
        });
        
        
        high.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               high.setEffect(null);
            }
        });
        
        low.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               low.setEffect(borderGlow);
            }
        });
        
        
        low.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               low.setEffect(null);
            }
        });
        
        high.setOnMouseClicked(new EventHandler<MouseEvent>() {
            Card c1;

            @Override
            public void handle(MouseEvent event) {
                picked = true;
                c1 = Game.grabDeck().pluck();
                c1.setIfPressed(true);
                //isPressed = true;
                Game.pluckACard(c1);

                c1.setXVal(getX() + 2);
                c1.setYVal(getY() + 1);
                Deathbox.root.getChildren().add(c1);
                
                wasPressed();
                Deathbox.root.getChildren().remove(high);
                Deathbox.root.getChildren().remove(low);
                choice = "high";
                
                int size = Game.getPile().size();
                //System.out.println(Game.getPile().get(0).getValue());
                if(c1.getRank() > Game.getPile().get(1).getRank()){
                    System.out.println("Correct");
                    
                }else{
                    System.out.println("Wrong");
                }
            }
        });
        
        low.setOnMouseClicked(new EventHandler<MouseEvent>() {
            Card c1;

            @Override
            public void handle(MouseEvent event) {
                picked = true;
                c1 = Game.grabDeck().pluck();
                Game.pluckACard(c1);

                c1.setXVal(getX() + 2);
                c1.setYVal(getY() + 1);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                }
                Deathbox.root.getChildren().add(c1);
                wasPressed();
                Deathbox.root.getChildren().remove(high);
                Deathbox.root.getChildren().remove(low);
                choice = "low";
                
                if(c1.getRank() < Game.getPile().get(1).getRank()){
                    System.out.println("Correct");
                    
                }else{
                    System.out.println("Wrong");
                }
            }
        });
        
        
        Deathbox.root.getChildren().add(high);
        Deathbox.root.getChildren().add(low);
    }


    //************************* Accessor Methods ********************************/
    public String getValue() {
        return value;
    }

    public void setValue(String newValue) {
        value = newValue;
    }

    public double getXVal() {
        return this.getX();
    }

    public double getYVal() {
        return this.getY();
    }

    public void setXVal(double x) {
        this.setX(x);
    }

    public void setYVal(double y) {
        this.setY(y);
    }

    public void wasPressed() {
        if (isPressed == true) {
            this.setFocused(false);
            this.setDisable(true);
        }
    }

    public boolean cardWasPressed() {
        return isPressed;
    }

    public void setIfPressed(boolean value) {
        isPressed = value;
    }

    public boolean cardWasEntered() {
        return isEntered;
    }
    
    public int getRank(){
        return rank;
    }

    //*****************************************************************************/
    public static void main(String[] args) {

        // TODO Auto-generated method stub
    }

}
