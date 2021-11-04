import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The main world
 */
public class MyWorld extends World
{
    Label[] labels = new Label[7];
    Canvas currentCanvas = new Canvas();

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        super(500, 500, 1);

        
        // create and update the labels
        updateLabels();
        
    }

    /**
     * Create and update the labels
     * Calling this method moves the labels to the front so they can be clicked
     */
    private void updateLabels()
    {
        // world and label settings
        int fontSize = 50;
        int n = labels.length;
        int x = getWidth()/n/2;
        int xOffset = getWidth()/n;
        int y = getHeight() - fontSize/2;

        for(int i = 0; i < n; i++)
        {
            labels[i] = new Label(i, fontSize);
            labels[i].setFillColor(Color.ORANGE);
            addObject(labels[i], x + xOffset * i, y);
        }
    }
    
    public void act()
    {
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info == null || !(info.getActor() instanceof Label))
            return;

        Label label = (Label) info.getActor();
        if(Greenfoot.mouseClicked(label))
        {
            int n = Integer.valueOf(label.getValue());
            updateCanvas(n);
            updateLabels();
        }

    }

    /**
     *  Show the correct canvas based on its number 
     */
    private void updateCanvas(int n)
    {
        removeObject(currentCanvas);
        switch(n) {
            case 0: currentCanvas = new Example();
                break;
            case 1: currentCanvas = new MyH();
                break;
            case 2: currentCanvas = new MyInitial();
                break;
            case 3: currentCanvas = new MyDrawing();
                break;
            case 4: currentCanvas = new MyTree();
                break;
            case 5: currentCanvas = new MyMasterpiece();
                break;
            case 6: currentCanvas = new MyHanoi();
                break;

        }
        addObject(currentCanvas, getWidth()/2, getHeight()/2);
    }
}
