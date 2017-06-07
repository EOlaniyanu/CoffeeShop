import greenfoot.*;
/**
 * Write a description of class MenuCommands here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface MenuCommands  
{   
    /**
     * execute prints the menu commands in the system.
     * 
     * @param idx represents whih menu option was clicked
     * @param w is the variable that represents UIMainWorld
     * @return Nothing is returned.
     */
    public void execute(int idx, World w);
}
