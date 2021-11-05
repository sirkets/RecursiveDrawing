import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

/**
 * The main world
 * 
 * Don't make any changes in this class
 */
public class MyWorld extends World
{
    private HashMap<String, Button> buttons = new HashMap<String, Button>();
    private Canvas currentCanvas;  // The current canvas to show
    private int heightOffset = 50;  // the height of the buttons
    private int numDrawings = 7;  // How many canvases to display
    
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        super(500, 550, 1);

        // Create a blank canvas to show the line that separates canvas from buttons
        currentCanvas = new Canvas();
        int x = getWidth()/2;
        int y = (getHeight() - 50)/2;
        addObject(currentCanvas, x, y);

        // Draw and Update the buttons
        updateButtons();
    }

    /**
     * Create and update the labels
     * This method moves labels to the "front" so they can be clicked
     */
    private void updateButtons()
    {
        // label settings
        int fontSize = 50;
        int x = getWidth()/numDrawings/2;
        int xOffset = getWidth()/numDrawings;
        int y = getHeight() - fontSize/2;

        // Create the buttons
        for(int i = 0; i < numDrawings; i++)
        {
            String letter = Character.toString('A' + i);
            Button button = new Button(letter, fontSize, x, y, 50, 50);
            button.setFillColor(Color.ORANGE);
            buttons.put(letter, button);
            addObject(buttons.get(letter), x + xOffset * i, y);
        }

    }

    /**
     * Called by greenfoot each cycle of the game loop
     */
    public void act()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info == null || !(info.getActor() instanceof Button))
            return;

        Button button = (Button) info.getActor();
        if(Greenfoot.mouseClicked(button))
        {
            String letter = button.getValue();
            updateCanvas(letter);
            updateButtons();
        }
    }

    /**
     *  Show the correct canvas based on its letter 
     */
    public void updateCanvas(String letter)
    {
        // remove the currently displayed canvas
        removeObject(currentCanvas);  
        char c = letter.charAt(0);
        // load the currect canvas
        switch(c) {
            case 'A': currentCanvas = new A();
                break;
            case 'B': currentCanvas = new B();
                break;
            case 'C': currentCanvas = new C();
                break;
            case 'D': currentCanvas = new D();
                break;
            case 'E': currentCanvas = new E();
                break;
            case 'F': currentCanvas = new F();
                break;
            case 'G': currentCanvas = new G();
                break;

        }

        // add the current canvas to the world
        int x = getWidth()/2;
        int y = (getHeight() - heightOffset)/2;
        addObject(currentCanvas, x, y);
    }
}
