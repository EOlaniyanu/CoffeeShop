import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    private final Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    public Label()
    {
        value = new String("123");
        fontSize = 24;
        updateImage();
    }
    
    public Label( String v, int fs)
    {
        value = v;
        fontSize = fs;
        updateImage();
    }
    
    public Label( int v, int fs )
    {
        this(Integer.toString(v), fs);
    }
    
    /**
     * setStringValue sets the String of the label to a new String.
     * 
     * @param newValue is the new String that value will be set to.
     * @return Nothing is returned.
     */
    public void setStringValue( String newValue )
    {
        value = newValue;
        updateImage();
    }
    
    /**
     * setIntValue sets the String of the label to a new Integer by converting the Integer into a String.
     * 
     * @param newValue is the int that will be changed into a String will be changed to.
     * @return Nothing is returned.
     */
    public void setIntValue( int newValue )
    {
        value = Integer.toString(newValue);
        updateImage();
    }
    
    /**
     * setLineColor sets the outline color for the label to a color that is sent to it.
     * 
     * @param nc is the color that the outline of the label will be changed to.
     * @return Nothing is returned.
     */
    public void setLineColor( Color nc ) 
    {
        lineColor = nc;
        updateImage();
    }
    
    /**
     * setFillColor sets the color that the label will be filled with.
     * 
     * @param fc is the color that the label will be filled with.
     * @return Nothing is returned.
     */
    public void setFillColor( Color fc ) 
    {
        fillColor = fc;
        updateImage();
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /**
     * updateImage updates the image of the label based on any changes
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    public void updateImage()
    {
        setImage ( new GreenfootImage( value, fontSize, fillColor, TRANSPARENT, lineColor));
    }
}
