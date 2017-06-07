import greenfoot.*;
/**
 * Write a description of class SalesItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SalesItem  
{
    // instance variables - replace the example below with your own
    

    private double salesPrice;
    private int numOfItem;
    
    /**
     * Constructor for objects of class SalesItem
     */
    public SalesItem()
    {
        salesPrice = 0.0;
        numOfItem = 0;
    }

    /**
     * Constructor for objects of class SalesItem
     */
    public SalesItem( double sp)
    {
        salesPrice = sp;
        numOfItem = 0;
    }
    
    /**
     * getNumOfItems returns the number of sales items that are ordered
     * 
     * @param There are no parameters
     * @return numOfItem is returned 
     */
    public int getNumOfItems()
    {
        return numOfItem;
    }
    
    /**
     * getFinalPrice returns the totalprice of the items ordered including tax
     * 
     * @param There are no parameters
     * @return the salesPrice plus taxes is returned  
     */
    public double getFinalPrice()
    {
        return salesPrice * 1.13;
    }
    
    /**
     * setPrice sets the price of the items to the double variable parameter
     *  
     * @param sp is the value of the price of the items ordered
     * @return Nothing is returned
     */
    public void setPrice( double sp )
    {
        salesPrice = sp;
    }
    
    /**
     * setNumber sets the number of items ordered to the number in the parameter
     * 
     * @param numItems is the number of items orderded
     * @return Nothing is returned
     */
    public void setNumber( int numItems )
    {
        numOfItem = numItems;
    }
    
}
