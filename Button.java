import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int fontSize;
    private String firstImage;
    private String secondImage;
    private String text;
    private GreenfootImage text1;
    private GreenfootImage text2;
    
    
    
    public Button(int fs, String f, String s, String t)
    {
        fontSize = fs;
        firstImage = f;
        secondImage = s;
        text = t;
        text1 = new GreenfootImage( t, fontSize, Color.WHITE, new Color( 0, 0, 0, 0));
        text2 = new GreenfootImage( t, fontSize, Color.BLACK, new Color( 0, 0, 0, 0));
        
        setImage(firstImage);
        
        
        getImage().drawImage( text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
        
    }
    
    public Button( String f, String s )
    {
        firstImage = f;
        secondImage = s;
        
        setImage(firstImage);
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        handleMouseClicks();
    }   
    
    /**
     * handleMouseClicks checks if the button if being pressed 
     * or has been cliked and changes the color of the button appropriately.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void handleMouseClicks()
    {
        if( Greenfoot.mousePressed(this) )
        {
            setImage(secondImage);
            getImage().drawImage( text2, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
        }
        else if( Greenfoot.mouseClicked(this))
        {
            setImage(firstImage);
            getImage().drawImage( text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
            clickedAction();
        }
    }
    
    /**
     * clickedAction is the method that launches the action that the button controls.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void clickedAction()
    {
        UIMainWorld guiWorld = (UIMainWorld)getWorld();
        
        if( text.equalsIgnoreCase("Timbits!") )
        {
            guiWorld.addItem( new Timbit() );
        }
        else if( text.equalsIgnoreCase("Doughnuts!") )
        {
            guiWorld.addItem( new Doughnut() );
        }
        else if( text.equalsIgnoreCase("Coffee!") )
        {
            guiWorld.addItem( new Coffee() );
        }
        
        
        
        
    }
    
    
}
