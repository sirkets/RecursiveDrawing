import greenfoot.*;

/**
 * Recursive H Drawing.
 * 
 */
public class B extends Canvas
{    
    /**
     * TODO: Play with the following values to see how your drawing changes
     */
    public void run()
    {
        drawH(2, 0.5, 0.5, 0.3);
    }
    
    /**
     * Recursively draw H of order N centred on x, y of size
     */
    public void drawH(int N, double x, double y, double size) {
        if (N == 0) return;

        H(x, y, size);
        
        double x0 = x - size / 2;
        double y0 = y - size / 2;
        double x1 = x0 + size;
        double y1 = y0 + size;
        drawH(N-1, x0, y0, size / 2); // Draw H in bottom left part
        drawH(N-1, x0, y1, size / 2);
        drawH(N-1, x1, y0, size / 2);
        drawH(N-1, x1, y1, size / 2);
    }

    /**
     * Draw an H centred on x, y with size
     */
    public void H(double x, double y, double size){
        double x0 = x - size / 2;
        double y0 = y - size / 2;
        double x1 = x0 + size;
        double y1 = y0 + size;
        line(x0, y0, x0, y1); // draws left vertical line of H
        line(x0, y, x1, y);  // draws the horizonal piece of H
        line(x1, y0, x1, y1);  // draws right vertical line of H
    }
}