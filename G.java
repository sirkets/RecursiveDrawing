import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hanoi Visualized
 * 
 * TODO: Show the Tower of Hanoi being solved.  Use a stack
 * data structure in the implementation
 */
public class G extends Canvas
{
    public void run()
    {
        solve(2, "A", "B", "C");
    }
    
    /**
     * @param N The number of disks
     * @param from The stack that we are moving the disk(s) from
     * @param to The stack that we are moving the disk(s) to
     * @param using The third stack that we are using to help us move the disks
     */
    private void solve(int N, String from, String to, String using)
    {
        if(N == 0) return;
        
        solve(N-1, from, using, to);
        System.out.println("Move a disk from " + from + " to " + to);
        solve(N-1, using, to, from);
        
    }
    
 
}


