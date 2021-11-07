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

    public Button(String text, int width, int height)
    {
        // Scale the image
        up.scale(width, height);
        down.scale(width, height);
        hover.scale(width, height);

        // Show text on the button
        this.text = text;
        Label label = new Label(text, height);
        up.drawImage(label.getImage(), width/3, 0);
        down.drawImage(label.getImage(), width/3, 0);
        hover.drawImage(label.getImage(), width/3, 0);
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
                
                // Update the screen
                MyWorld world = (MyWorld) getWorld();
                world.updateCanvas(this.text);
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

    /**
     * Update the button image based on its state
     */
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
