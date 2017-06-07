import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;
/**
 * Write a description of class UIMainWorld here.
 * 
 * Name: Emmanuel Olaniyanu
 * Teacher: Mr. Hardman
 * Lab #7, CoffeeShop
 * Date Last Modified: 06/06/2017
 * 
 */
public class UIMainWorld extends World
{
    private boolean onSales;
    
    private SalesItem[] salesItems;
    
    private int numItemsAdded;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        startScreen();
    }
    
    /**
     * startScreen creates the menu for the program and prepares the program to start
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void startScreen()
    {
        onSales = false;
        salesItems = new SalesItem[50];
        numItemsAdded = 0;
        
        Menu guiMenu = new Menu("File", "NewSale...\nClose\nExit", 24, Color.RED, Color.WHITE, Color.YELLOW, Color.ORANGE, new FileCommands());
        clearScreen();
        
        addObject( guiMenu, 100, 20);
        
        
    }
    
    /**
     * salesScreen displays the salesScreen to the user in the world
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void salesScreen()
    {
        onSales = true;
        
        Button timbitAdd = new Button( 25,  "button-blue.png" , "button-green.png", "Timbits!" );
        Button doughnutAdd = new Button( 25,  "button-blue.png" , "button-green.png", "Doughnuts!");
        Button coffeeAdd = new Button( 25,  "button-blue.png" , "button-green.png", "Coffee!");
        
        addObject( timbitAdd, 75, 150);
        addObject( doughnutAdd, 75, 200);
        addObject( coffeeAdd, 75, 250);
    }
    
    /**
     * thankYou stops the program and displays a farewell text to the user
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void thankYou()
    {
        onSales = false;
        clearScreen();
        
        addObject(new Label( "Thank You for Eating at Tim Hortons", 24), getWidth()/2, getHeight()/2 ); 
        
        Greenfoot.stop();
    }
    
    public void act()
    {
        if( onSales == true)
        {
            calculateSale();
        }
    }
    
    /**
     * calculateSale displays the details of the sale like the total price and number of items bought.
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void calculateSale() 
    {
        double costTotal = 0;
        int numTimbits = 0;
        int numDoughnuts = 0;
        int numCoffeeS = 0;
        int numCoffeeM = 0;
        int numCoffeeL = 0;
        String orderList;
        
        
        for( int i = 0; salesItems[i] != null && i < salesItems.length; i++)
        {
            
            
            if ( salesItems[i] instanceof Timbit)
            {
                numTimbits += salesItems[i].getNumOfItems();
            }
            else if ( salesItems[i] instanceof Doughnut)
            {
                numDoughnuts += salesItems[i].getNumOfItems();
            }
            else if ( salesItems[i] instanceof Coffee)
            {
                if (salesItems[i].getNumOfItems() == 1 )
                {
                    numCoffeeS++;
                }
                else if(salesItems[i].getNumOfItems() == 2 )
                {
                    numCoffeeM++;
                }
                else
                {
                    numCoffeeL++;
                }
            }
            
            costTotal += salesItems[i].getFinalPrice();
        }
        
        orderList = " Timbits: " + numTimbits + "\nDoughnuts:" + numDoughnuts + "\nSmall Coffee:" + numCoffeeS +"\nMedium Coffee:" + numCoffeeM + "\nLarge Coffee:" + numCoffeeL ;
        
        showText( orderList + String.format("\nTotal Price: $%5.2f", costTotal), getWidth()/2, getHeight()/2 );
        
    }
    
    /**
     * addItem adds the new SalesItem into the salesItems array and one to the variable that stores the number of Items added
     * 
     * @param si is the newly added salesItem object.
     * @return Nothing is returned
     */
    public void addItem(SalesItem si)
    {
        salesItems[numItemsAdded] = si;
        numItemsAdded++;
    }
    
    /**
     * clearScreen clears the screen of all objects and text and empties the list of objects
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void clearScreen()
    {
        showText("", getWidth()/2, getHeight()/2 );
        
        List objects = getObjects(null);//(null gets all the objects in the world)
        
        if ( objects != null)
        {
            removeObjects(objects);
        }
        
    }
    
}
