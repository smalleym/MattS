package deathbox;

//import static deathbox.Deathbox.root;
import java.util.LinkedList;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

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
    public static ImageView high = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/up_arrow.png")));
    public static ImageView low = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/down_arrow.png")));

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
        Rectangle rect = new Rectangle(getX(), getY(), FITWIDTH + 40, FITHEIGHT + 40);
        Deathbox.root.getChildren().add(rect);
        
        card.setFitWidth(FITWIDTH);
        card.setFitHeight(FITHEIGHT);
        card.setPreserveRatio(true);

        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(10.0);
        dropShadow.setOffsetY(10.0);
        card.setEffect(dropShadow);
        
//        rect.setOnMouseDragExited(new EventHandler<MouseDragEvent>() {
//            @Override
//            public void handle(MouseDragEvent event) {
//               Deathbox.root.getChildren().remove(low);
//               Deathbox.root.getChildren().remove(high);
//            }
//        });

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
            }
        });

        card.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                card.setEffect(dropShadow);
                isEntered = false;
                
            }
        });

        card.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                isPressed = true;
                Game.unMark(card);
                highOrLow(card);
                
            }
        });
    }
    
    
    /*
     * This method performs that main Action of what happens after picking a higher or lower card.
     * @param The card to go high or low on.
     */
    private void highOrLow(Card c){
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
            Text text = new Text();

            @Override
            public void handle(MouseEvent event) {
                picked = true;
                c1 = Game.grabDeck().pluck();
                c1.setIfPressed(true);
                Game.pluckACard(c1);

                c1.setXVal(Deathbox.cardStartX);
                c1.setYVal(Deathbox.cardStartY);

                Timeline timeline = new Timeline();

                KeyFrame end = new KeyFrame(Duration.seconds(.5),
                        new KeyValue(c1.xProperty(), getX() + 2),
                        new KeyValue(c1.yProperty(), getY() + 1));

                timeline.getKeyFrames().add(end);

                timeline.play();

                Deathbox.root.getChildren().add(c1);

                wasPressed();
                Deathbox.root.getChildren().remove(high);
                Deathbox.root.getChildren().remove(low);
                LinkedList<Card> pile = Game.getPile();

                timeline.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (c1.getRank() > pile.get(1).getRank()) {

                            //ImageView correct = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/up_arrow.png")));
                            text.setText("Correct");
                            text.setFont(Font.font("Verdana", 200));
                            text.setFill(Color.GREEN);
                            text.setEffect(borderGlow);
                            text.setX(300);
                            text.setY(500);

                            Deathbox.root.getChildren().add(text);

                            FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), text);
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();

                            text.setDisable(true);

                        } else if (c1.getRank() == pile.get(1).getRank()){
                            ImageView drink = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/beer_chug.png")));
                            drink.setFitHeight(400);
                            drink.setFitWidth(400);
                            drink.setPreserveRatio(true);
                            drink.setX(650);
                            drink.setY(100);
                            
                            ImageView drink2 = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/beer_chug2.png")));
                            drink2.setFitHeight(400);
                            drink2.setFitWidth(400);
                            drink2.setPreserveRatio(true);
                            drink2.setX(350);
                            drink2.setY(100);
                            
                            Deathbox.root.getChildren().addAll(drink, drink2);
                            
                            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), drink);
                            fadeOut.setDelay(Duration.seconds(1));
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();
                            
                            FadeTransition fadeOut2 = new FadeTransition(Duration.seconds(3), drink2);
                            fadeOut2.setDelay(Duration.seconds(1));
                            fadeOut2.setFromValue(1.0);
                            fadeOut2.setToValue(0.0);
                            fadeOut2.play();
                            
                            drink.setDisable(true);
                            drink2.setDisable(true);
                            
                        }else{

                            //text.setText("You're Ass!! Drink!");
                            ImageView drink = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/beer_chug.png")));
                            drink.setFitHeight(500);
                            drink.setFitWidth(500);
                            drink.setPreserveRatio(true);
                            drink.setX(550);
                            drink.setY(100);

                            Deathbox.root.getChildren().add(drink);

                            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), drink);
                            fadeOut.setDelay(Duration.seconds(1));
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();

                            drink.setDisable(true);
                        }
                    }
                });
            }
        });

        low.setOnMouseClicked(new EventHandler<MouseEvent>() {
            Card c1;

            Text text = new Text();

            @Override
            public void handle(MouseEvent event) {

                picked = true;
                c1 = Game.grabDeck().pluck();
                c1.setIfPressed(true);
                Game.pluckACard(c1);
                c1.setXVal(Deathbox.cardStartX);
                c1.setYVal(Deathbox.cardStartY);

                Timeline timeline = new Timeline();

                KeyFrame end = new KeyFrame(Duration.seconds(.5),
                        new KeyValue(c1.xProperty(), getX() + 2),
                        new KeyValue(c1.yProperty(), getY() + 1));

                timeline.getKeyFrames().add(end);

                timeline.play();

                Deathbox.root.getChildren().add(c1);

                wasPressed();
                Deathbox.root.getChildren().remove(high);
                Deathbox.root.getChildren().remove(low);
                LinkedList<Card> pile = Game.getPile();

                timeline.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (c1.getRank() < pile.get(1).getRank()) {

                            text.setText("Correct");
                            text.setFont(Font.font("Verdana", 200));
                            text.setFill(Color.GREEN);
                            text.setEffect(borderGlow);
                            text.setX(300);
                            text.setY(500);

                            Deathbox.root.getChildren().add(text);

                            FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), text);
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();

                            text.setDisable(true);


                        } else if (c1.getRank() == pile.get(1).getRank()){
                            ImageView drink = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/beer_chug.png")));
                            drink.setFitHeight(400);
                            drink.setFitWidth(400);
                            drink.setPreserveRatio(true);
                            drink.setX(650);
                            drink.setY(100);
                            
                            ImageView drink2 = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/beer_chug2.png")));
                            drink2.setFitHeight(400);
                            drink2.setFitWidth(400);
                            drink2.setPreserveRatio(true);
                            drink2.setX(350);
                            drink2.setY(100);
                            
                            Deathbox.root.getChildren().addAll(drink, drink2);
                            
                            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), drink);
                            fadeOut.setDelay(Duration.seconds(1));
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();
                            
                            FadeTransition fadeOut2 = new FadeTransition(Duration.seconds(3), drink2);
                            fadeOut2.setDelay(Duration.seconds(1));
                            fadeOut2.setFromValue(1.0);
                            fadeOut2.setToValue(0.0);
                            fadeOut2.play();
                            
                            drink.setDisable(true);
                            drink2.setDisable(true);
                            
                        }else {

                            ImageView drink = new ImageView(new Image(Deathbox.class.getResourceAsStream("images/beer_chug.png")));
                            drink.setFitHeight(500);
                            drink.setFitWidth(500);
                            drink.setPreserveRatio(true);
                            drink.setX(550);
                            drink.setY(100);

                            Deathbox.root.getChildren().add(drink);

                            FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), drink);
                            fadeOut.setDelay(Duration.seconds(1));
                            fadeOut.setFromValue(1.0);
                            fadeOut.setToValue(0.0);
                            fadeOut.play();

                            drink.setDisable(true);
                        }
                    }
                });
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
