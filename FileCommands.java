import greenfoot.*;
/**
 * Write a description of class FileCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FileCommands implements MenuCommands 
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class FileCommands
     */
    public FileCommands()
    {
    }
    
    /**
     * execute prints the menu commands in the system.
     * 
     * @param idx represents whih menu option was clicked
     * @param w is the variable that represents the world class
     * @return Nothing is returned.
     */
    public void execute(int idx, World w)
    {
        UIMainWorld guiWorld = (UIMainWorld)w;
        
        if ( idx == 0 )
        {
            guiWorld.salesScreen();
        }
        else if ( idx == 1 )
        {

            guiWorld.startScreen();
        }
        else if ( idx == 2 )
        {
            
            guiWorld.thankYou();
        }
        
    }
}
