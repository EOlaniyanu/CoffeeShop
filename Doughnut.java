import javax.swing.*;
/**
 * Write a description of class Doughnut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doughnut extends SalesItem 
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Doughnut
     */
    public Doughnut()
    {
        double DOUGHNUT_PRICE = 0.99;
        double BOX_PRICE = 5.00;
        int BOX_CAP = 6;
        
        int numDoughnuts = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Doughnuts:" ) );
        int numBoxes;
        
        setNumber(numDoughnuts);
        numBoxes = numDoughnuts/BOX_CAP;
        numDoughnuts = numDoughnuts % BOX_CAP;
        
        setPrice( (numDoughnuts * DOUGHNUT_PRICE) + (numBoxes * BOX_PRICE) );
    }
}
