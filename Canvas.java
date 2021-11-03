import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Extend this class to make your drawing.
 * Override the 'draw()' method in your subclass
 */
public class Canvas extends Actor
{
    /**
     * Write code in this method to make the drawing.
     * Use values between 0.0 - 1.0
     * 
     * The canvas has coordinates (0, 0) in the bottom left corner
     * and (1.0, 1.0) in the top right corner
     * 
     *      |-----|(1.0,1.0)
     *      |     |
     *      |     |
     * (0,0)|-----|
     */
    public void draw()
    {
    }
    
    private GreenfootImage image;  // The image that greenfoot draws on
    private int scale;  // The scale or side-length of the world.  Ensure the world's width = height
    
    public void addedToWorld(World world)
    {
        // set the scale to the width of the world
        // ensure width = height in the world
        scale = world.getWidth();

        // instantiate an image to draw on
        image = new GreenfootImage(scale, scale);
        this.setImage(image);

        // draw the image
        draw();
    }

    /**
     * Draw a line between coordinates (x1, y1) and (x2, y2)
     */
    public void line(double x1, double y1, double x2, double y2)
    {
        int nx1 = (int) (x1*scale);
        int nx2 = (int) (x2*scale);
        int ny1 = (int) ((1 - y1) *scale);
        int ny2 = (int) ((1 - y2) *scale);
        image.drawLine(nx1, ny1, nx2, ny2);
    }

    /**
     * Draw a circle with centre (x, y) and radius
     */
    public void circle(double x, double y, double radius)
    {
        oval(x, y, radius, radius);
    }

    /**
     * Draw an oval with centre (x, y) and with xRadius and yRadius
     */
    public void oval(double x, double y, double xRadius, double yRadius)
    {
        int nx = (int) ((x - xRadius) * scale);
        int ny = (int) ((1 - y) * scale - yRadius * scale);
        int width = (int) (xRadius * 2 * scale);
        int height = (int) (yRadius * 2 * scale);
        image.drawOval(nx, ny, width, height);
    }
}
