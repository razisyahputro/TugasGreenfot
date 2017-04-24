import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Luffy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spongebob extends Actor
{
    /**
     * Act - do whatever the Luffy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int isi=0;
    private Score counter;
    public Spongebob(Score pointCounter)
    {
        counter = pointCounter;
    }
    public void act() 
    {
        // Add your action code here.
        gerak();
        tangkap();
    }    
    public void gerak()
    {
        
        if(Greenfoot.isKeyDown("right"))
        {
            move(8);
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            move(-8);
        }
    }
    
    public void tangkap()
    {
        Actor Jellyfish;
        Jellyfish = getOneObjectAtOffset(0,-90,Jellyfish.class);
        
        if(Jellyfish !=null)
        {
            getWorld().removeObject(Jellyfish);
            Greenfoot.playSound("coin.mp3");
            counter.add(10);
            isi++;
        }
        if(isi==15)
        {
            getWorld().addObject(new Win(),400,300);
            Greenfoot.stop();
            Greenfoot.playSound("keprok.mp3");
        }
        
    }
}
