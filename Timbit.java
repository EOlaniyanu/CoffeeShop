import javax.swing.*;
/**
 * Write a description of class Timbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timbit extends SalesItem 
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Timbit
     */
    public Timbit()
    {
        double TIMBIT_PRICE = 0.30;
        int BOX_CAPACITY = 12;
        double BOX_PRICE = 3.00;
        
        int numTimbits = Integer.parseInt( JOptionPane.showInputDialog( null, "Enter the number of Timbits:" ) );
        int numBoxes;
        
        setNumber(numTimbits);
        
        numBoxes = numTimbits/BOX_CAPACITY;
        
        numTimbits = numTimbits % BOX_CAPACITY;
        
        setPrice((numTimbits * TIMBIT_PRICE) + (numBoxes * BOX_PRICE));
    }

    
}
