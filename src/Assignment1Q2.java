
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
public class Assignment1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();
        // TODO code application logic here
        
        Robot kevin = new Robot(kitchener, 1, 2, Direction.SOUTH);
        
        new Wall(kitchener, 1,1, Direction.NORTH);
        new Wall(kitchener, 1,2, Direction.NORTH);
        new Wall(kitchener, 1,2, Direction.EAST);
        new Wall(kitchener, 1,2, Direction.SOUTH);
        new Wall(kitchener, 2,1, Direction.SOUTH);
        new Wall(kitchener, 1,1, Direction.WEST);
        new Wall(kitchener, 2,1, Direction.WEST);
        // TODO code application logic here
        
        new Thing(kitchener, 2,2);
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.pickThing();
        
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
        
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
        kevin.move();
         
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
    }
}
