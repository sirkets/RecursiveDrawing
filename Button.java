import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clickable button
 */
public class Button extends Actor
{
    GreenfootImage up = new GreenfootImage("button_up.png");
    GreenfootImage down = new GreenfootImage("button_down.png");
    GreenfootImage hover = new GreenfootImage("button_hover.png");

    private State state = State.UP;
    private String text;

    private enum State
    {
        UP, DOWN, HOVER
    }

    public Button(String text)
    {
        this.text = text;
        Label label = new Label(text, 50);
        
        // Scale the image
        int xScale = 73;
        int yScale = 51;
        up.scale(xScale, yScale);
        down.scale(xScale, yScale);
        hover.scale(xScale, yScale);
        
        up.drawImage(label.getImage(), xScale/3, 0);
        down.drawImage(label.getImage(), xScale/3, 0);
        hover.drawImage(label.getImage(), xScale/3, 0);
        setImage(up);
    }
    
    public String getText()
    {
        return text;
    }

    public void act()
    {

        MouseInfo info = Greenfoot.getMouseInfo();
        if(info == null) {
            return;
        }

        if(info.getActor() == this)
        {
            Button button = (Button) info.getActor();

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
