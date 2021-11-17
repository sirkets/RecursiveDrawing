import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

/**
 * The main world
 * This is the main interface for the buttons and the Canvas
 */
public class MyWorld extends World
{
    // Names of exercises
    private HashMap<String, String> drawingNamesMap = new HashMap<String, String>(){{
                put("A", "Drawing Practice");
                put("B", "Recursive H");
                put("C", "My Initial");
                put("D", "Simple Drawing");
                put("E", "Recursive Tree");
                put("F", "My Masterpiece");
                put("G", "Tower of Hanoi");
            }};

    private Canvas currentCanvas;  // The current canvas to show
    private int heightOffset = 50;  // the height of the buttons
    private int fontSize = heightOffset;  // font size of button text
    private int numCanvases = 7;  // How many canvases to display

    private int hoverTextFontSize = 20;
    private Label hoverTextLabel;

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

        // Create the buttons
        createButtons();
        hoverTextLabel = new Label("", hoverTextFontSize);
    }

    /**
     * Create and update the labels
     * This method moves labels to the "front" so they can be clicked
     */
    private void createButtons()
    {
        // label settings
        int x = getWidth()/numCanvases/2;
        int y = getHeight() - fontSize/2;
        int buttonWidth = getWidth()/numCanvases;
        int buttonHeight = fontSize;

        // get the padding on the ends of the buttons
        int offset = getWidth() - (buttonWidth * numCanvases);

        // Create the buttons
        for(int i = 0; i < numCanvases; i++)
        {
            String letter = Character.toString('A' + i);
            Button button = new Button(letter, buttonWidth, buttonHeight);
            addObject(button, x + offset/2 + buttonWidth * i, y);
        }
    }

    /**
     * Display the name of the exercise from the given letter
     */
    public void displayHoverText(String letter)
    {
        int x = getWidth()/2;
        int y = hoverTextFontSize;
        String displayText = drawingNamesMap.get(letter);
        hoverTextLabel.setValue(displayText);        
        hoverTextLabel.setFillColor(Color.GRAY);
        addObject(hoverTextLabel, x, y);
    }

    /**
     * Cancel the hover Text
     */
    public void cancelHoverText()
    {
        hoverTextLabel.setValue(""); 
    }

    /**
     *  Show the correct canvas based on its letter 
     */
    public void updateCanvas(String letter)
    {
        // remove the currently displayed canvas
        removeObject(currentCanvas);
        currentCanvas = null;
        
        // load the correct canvas subclass
        char c = letter.charAt(0);
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
        
        // Execute the run method of the subclass of Canvas
        currentCanvas.run();
    }
}
