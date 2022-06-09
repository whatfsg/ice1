/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice1;

/** define card value and suits
 * 
 *
 * @author Edwin Johnson
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
    
    //method for suits
    @Override
    public String toString(){
        return "Card: " + this.value + " " + this.suits;
    }
}