
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Starm7481
 */
public class Assingment3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot kevin = new Robot(kw,0,3,Direction.WEST);
        
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        
        int walkAbout = 0;
        // creates an integer for the sides of the block 
        while(walkAbout < 8){
            // this loop gets him to move around one side of the block eventually 8 times 
            kevin.move();
            kevin.move();
            kevin.move();
            kevin.turnLeft();
            
            walkAbout = walkAbout+1;
            // adds one to the counter 
        }
        
        
    }
}
