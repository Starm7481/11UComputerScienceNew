
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
public class Assignment1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kitchener = new City();
        // TODO code application logic here
        
        Robot kevin = new Robot(kitchener, 0, 2, Direction.WEST);
        
        new Wall(kitchener, 1,1, Direction.NORTH);
        new Wall(kitchener, 1,2, Direction.NORTH);
        new Wall(kitchener, 1,2, Direction.EAST);
        new Wall(kitchener, 2,2, Direction.EAST);
        new Wall(kitchener, 2,1, Direction.SOUTH);
        new Wall(kitchener, 2,2, Direction.SOUTH);
        new Wall(kitchener, 1,1, Direction.WEST);
        new Wall(kitchener, 2,1, Direction.WEST);
        
        kevin.move();
        kevin.move();
        kevin.turnLeft();
        
        kevin.move();
        kevin.move();
        kevin.move();
        kevin.turnLeft();
        
        kevin.move();
        kevin.move();
        kevin.move();
        kevin.turnLeft();
        
        kevin.move();
        kevin.move();
        kevin.move();
        kevin.turnLeft();
    }
}
