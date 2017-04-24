import greenfoot.*;
import java.awt.Color;

public class Score extends Actor
{
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int value;
    private int target;

    public Score()
    {
        background = getImage();
        value = 0;
        target = 0;
        updateImage();
    }

    public void act()
    {
        if(value < target)
        {
            value++;
            updateImage();
        }
        else if(value > target)
        {
            value--;
            updateImage();
        }
    }

    public void add(int score)
    {
        target += score;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int newValue)
    {
        target = newValue;
        value = newValue;
        updateImage();
    }

    private void updateImage()
    {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("Skor : " + value, 23, Color.BLACK, transparent);
        image.drawImage(text, (image.getWidth()-text.getWidth())/2,(image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}