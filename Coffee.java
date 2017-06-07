import javax.swing.*;
/**
 * Write a description of class Coffee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coffee extends SalesItem 
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class Coffee
     */
    public Coffee()
    {
        double SMALL_COFFEE_PRICE = 1.33;
        double MEDIUM_COFFEE_PRICE = 1.59;
        double LARGE_COFFEE_PRICE = 1.86;
        
        String size = JOptionPane.showInputDialog( null, "Enter the coffee size:" );
        
        if( size.equalsIgnoreCase("s"))
        {
            setNumber(1);
            setPrice( SMALL_COFFEE_PRICE);
        }
        
        if( size.equalsIgnoreCase("m") )
        {
            setNumber(2);
            setPrice( MEDIUM_COFFEE_PRICE );
        }
        
        if( size.equalsIgnoreCase("l") )
        {
            setNumber(3);
            setPrice( LARGE_COFFEE_PRICE );
        }
        
    }

}
