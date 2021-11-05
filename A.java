import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Example
 * 
 * Sample of how to use Canvas for drawing
 */
public class A extends Canvas
{
    /**
     * TODO: Practice drawing different lines and shapes.
     * Refer to the drawing API in the superclass
     */
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
