package ice1;
import java.util.Random;
import java.util.Scanner;
/*
 * @author Edwin Johnson Student ID =991667321 
*/
public class Ice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        Random drawCards = new Random();
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(drawCards.nextInt(13) + 1);
            c1.setSuits(Card.SUITS[drawCards.nextInt(4)]);//random method suit 
            magicHand[i] = (c1);
            System.out.println(c1);
        }
      
        
        Card cardtaken = new Card();
        
        cardtaken.setValue(5);
        cardtaken.setSuits("Spades");
        
        boolean found = false;
        
        for (Card magicHand1 : magicHand) {
            if (magicHand1.getValue() == cardtaken.getValue() && magicHand1.getSuits().equalsIgnoreCase(cardtaken.getSuits())) {
                found = true;
               break;
            }
                      
         }
             
         if(found)
                System.out.println("card selected");
            else
                System.out.println("Sorry, card not selected");
    }
        
    }