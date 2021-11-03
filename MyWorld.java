import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Ensure width = height
        super(500, 500, 1);
        MyCanvas myCanvas = new MyCanvas();
        addObject(myCanvas, getWidth()/2, getHeight()/2);
  
        
    }
}
