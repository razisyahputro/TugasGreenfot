import greenfoot.*;

/**
 * Write a description of class Jellyfish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jellyfish extends Actor
{
    /**
     * Act - do whatever the Jellyfish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+1);
        if (getY() == getWorld().getHeight()-1) {
            ((Latar) getWorld()).gameOver();
            getWorld().addObject(new Lose(),400,300);
        }
    }    
}
