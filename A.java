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
        line(0, 0, 0.5, 0.5);
    }
    
    private void draw(int N, double x, double y, double size)
    {
        if(N == 0) {
          return;
        }
        
        circle(x, y, size);
        double x0 = x-size/2;
        double x1 = x+size/2;
        draw(N-1, x0, y, size/2);
        draw(N-1, x1, y, size/2);
    }

}
