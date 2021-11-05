import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A button class.
 * 
 */
public class Button extends Label
{
    private int x;
    private int y;
    private int width;
    private int height;

    public Button(String text, int fontSize, int x, int y, int width, int height)
    {
        super(text, fontSize);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        GreenfootImage image = new GreenfootImage(width, height);
        image.drawRect(0, 0, 100, 100);
        setImage(image);
    }

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
