import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PenguinTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the PenguinTitle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")) {
            World world;
            world = getWorld();
            world.removeObject(this);
            
        }
    }    
}
