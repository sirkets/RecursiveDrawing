/**
 * Recursive Drawings.
 * 
 * @author Mr. Chan
 * @version Oct 2015
 */
public class RecursiveH extends Canvas
{
    public void draw()
    {
        
    }
    
    /**
     * Recursively draw H of order N centred on x, y of size
     */
    public static void drawH(int N, double x, double y, double size) {
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
    public static void H(double x, double y, double size){
        double x0 = x - size / 2;
        double y0 = y - size / 2;
        double x1 = x0 + size;
        double y1 = y0 + size;
        line(x0, y0, x0, y1); // draws left side of H
        line(x0, y, x1, y);
        line(x1, y0, x1, y1);
    }
}