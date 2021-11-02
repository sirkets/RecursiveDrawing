import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Canvas extends Actor
{
    public Canvas()
    {
        GreenfootImage image = new GreenfootImage(100,100);
        this.setImage(image);
        image.drawLine(0,0,100,100);
    }
    
}
