import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Recursive tree drawing
 */
public class E extends Canvas
{
    /**
     * TODO: change the values to personalize your tree
     */
    public void run()
    {
        drawTree(3, 0.5, 0, 90, 0.5);
    }

    /**
     * Base code for drawing a fractal tree.
     * 
     * TODO: Modify the code to personalize your tree.
     * You can: add colour, re-size, change angles, add branches.
     */
    private void drawTree(int N, double x, double y, double angle, double size) {
        if (N == 0) return;
        double x1 = x + Math.cos(Math.toRadians(angle)) * size;
        double y1 = y + Math.sin(Math.toRadians(angle)) * size;
        line(x, y, x1, y1);
        drawTree(N-1, x1, y1, angle - 45, size/2);
        drawTree(N-1, x1, y1, angle + 45, size/2);
    }

}
