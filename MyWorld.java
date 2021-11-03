import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private Label myCanvasLabel;
    private Label recursiveHLabel;
    private Label recursiveInitialLabel;
    private Label recursive
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Ensure width = height
        super(500, 500, 1);
        clickLabel = new Label("Click to Begin", 50);
        addObject(clickLabel, getWidth()/2, getHeight()/2);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            removeObject(clickLabel);
            RecursiveH h = new RecursiveH();
            addObject(h, 250, 250);
        }
    }
}
