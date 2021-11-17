import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Example Canvas
 * 
 * A Sample of how to use Canvas for drawing
 */
public class A extends Canvas
{
    /**
     * TODO: Replace this code with your own code.
     * Practice drawing different lines and shapes.
     * Refer to the drawing API in the superclass
     */
    public void run()
    {
        line(0, 0, 1, 1);
        circle(0.5, 0.5, 0.4);
      
        setColor(Color.GREEN);
        oval(0.6, 0.6, 0.3, 0.2);
        
        setColor(Color.RED);
        rect(0.7, 0.4, 0.2, 0.3);
    }
}
