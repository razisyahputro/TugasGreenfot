import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Latar extends World
{
    Title title = null;
    
    /**
     * Constructor for objects of class Latar.
     * 
     */
    public Latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        Title title = new Title();
        addObject (title, getWidth()/2, getHeight()*1/3);

        prepare ();
    }
    
    public void act() 
    {
        
        if(Greenfoot.getRandomNumber(200) < 1) {
            addObject(new Jellyfish(), Greenfoot.getRandomNumber(800), 1);   
        }
    }
    public void gameOver() 
    {
        Greenfoot.playSound("lose.mp3");
        Greenfoot.stop();
    }
    

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        
        Score score = new Score();
        addObject(score, 66, 31);
        score.setLocation(63, 23);
        
        Spongebob spongebob = new Spongebob(score);
        addObject(spongebob, 410, 484); 
        spongebob.setLocation(400, 482);
        
    }
}
