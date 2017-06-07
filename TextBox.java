import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    private GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    public TextBox()
    {
        
    }
    
    public TextBox(String message, int fs, boolean b, Color fg, Color bg )
    {
        
        border = b;
        fontSize = fs;
        foreground = fg;
        background = bg;
        img = new GreenfootImage( message, fontSize, foreground, background );
        display();
    }
    
    
    /**
     * Act - do whatever the TextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /**
     * setText sets the text of the TextBox to the String message parameter
     * 
     * @param message is the String that TextBox will display.
     * @return Nothing is returned.
     */
    public void setText( String message)
    {
        img = new GreenfootImage( message, fontSize, foreground, background );
        display();
    }
    
    /**
     * display changes the image of the TextBox to the img changes its color based on the image.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void display()
    {
        setImage(img);
        
        if( border ) 
        {
            img.setColor(Color.BLACK);
            img.drawRect( 0, 0, img.getWidth() - 1, img.getHeight() - 1);
            setImage(img);
        }
        
    }
}
