import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sample of how to use Canvas for drawing
 */
public class Example extends Canvas
{
    public void draw()
    {
        line(0, 0, 1, 1);
        circle(0.5, 0.5, 0.4);
        
        setColor(Color.GREEN);
        oval(0.6, 0.6, 0.3, 0.6);
        
        setColor(Color.RED);
        rect(0.5, 0.3, 0.2, 0.3);
    }
}
