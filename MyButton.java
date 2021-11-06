import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyButton extends Actor
{
    GreenfootImage up = new GreenfootImage("button_up.png");
    GreenfootImage down = new GreenfootImage("button_down.png");
    GreenfootImage hover = new GreenfootImage("button_hover.png");

    private State state = State.UP;

    private enum State
    {
        UP, DOWN, HOVER
    }

    public MyButton()
    {

    }

    public void act()
    {

        MouseInfo info = Greenfoot.getMouseInfo();
        if(info == null) {
            return;
        }

        if(info.getActor() instanceof MyButton)
        {
            MyButton button = (MyButton) info.getActor();

            if(Greenfoot.mousePressed(this))
            {
                state = state.DOWN;
            }
            else if(Greenfoot.mouseClicked(this))
            {
                state = state.HOVER;
            }
            else
            {
                state = state.HOVER;
            }
        }
        else if(info.getActor() != null)
        {
             state = state.UP;   
        }
       
        updateImage();
        
    }
    
    private void updateImage()
    {
        switch (state)
        {
            case UP:
                setImage(up);
                break;
            case DOWN:
                setImage(down);
                break;
            case HOVER: 
                setImage(hover);
                break;
        }

    }
}
