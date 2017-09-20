
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
public class Assignment1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City kitchener = new City();
         
         Robot kevin = new Robot(kitchener, 0, 0, Direction.SOUTH);
         
         Robot john = new Robot(kitchener, 0, 1, Direction.SOUTH);
         
         new Wall(kitchener, 0,1, Direction.WEST);
         new Wall(kitchener, 1,1, Direction.WEST);
         new Wall(kitchener, 1,1, Direction.SOUTH);
         
         kevin.move();
         
         john.move();
         
         kevin.move();
         
         john.turnLeft();
         
         john.move();
         
         john.turnLeft();
         john.turnLeft();
         john.turnLeft();
         
         john.move();
         
         john.turnLeft();
         john.turnLeft();
         john.turnLeft();
         
         kevin.turnLeft();
         
         kevin.move();
         
         john.move();
         
        
    }
}
