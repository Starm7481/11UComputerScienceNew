
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Starm7481
 */
public class Assignment1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         City kitchener = new City();
         
         Robot kevin = new Robot(kitchener, 3, 0, Direction.EAST);
         
         new Wall(kitchener, 3,1, Direction.WEST);
         new Wall(kitchener, 3,1, Direction.NORTH);
         new Wall(kitchener, 1,2, Direction.WEST);
         new Wall(kitchener, 2,2, Direction.WEST);
         new Wall(kitchener, 1,2, Direction.NORTH);
         new Wall(kitchener, 1,2, Direction.EAST);
         new Wall(kitchener, 2,3, Direction.NORTH);
         new Wall(kitchener, 2,3, Direction.EAST);
         new Wall(kitchener, 3,3, Direction.EAST);
         
         new Thing(kitchener, 0,3);
         
        
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        
        kevin.move();
        kevin.move();
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        kevin.move();
        
        kevin.pickThing();
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        kevin.move();
        
        kevin.turnLeft();
    }
}
