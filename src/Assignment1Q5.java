
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
public class Assignment1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kitchener = new City();
         
         Robot john = new Robot(kitchener, 3, 3, Direction.EAST);
        
         Robot kevin = new Robot(kitchener, 0, 1, Direction.WEST);
         
         john.setLabel("K");
         
         
         kevin.setLabel("M");
         new Thing(kitchener, 0,0);
         new Thing(kitchener, 1,0);
         new Thing(kitchener, 1,1);
         new Thing(kitchener, 1,2);
         new Thing(kitchener, 2,2);
         
         new Wall(kitchener, 2,3, Direction.WEST);
         new Wall(kitchener, 2,3, Direction.NORTH);
         new Wall(kitchener, 2,3, Direction.EAST);
         new Wall(kitchener, 3,3, Direction.EAST);
         new Wall(kitchener, 3,3, Direction.SOUTH);
         
         kevin.move();
         kevin.pickThing();
         kevin.turnLeft();
         kevin.move();
         kevin.pickThing();
         kevin.turnLeft();
         kevin.move();
         kevin.pickThing();
         
         john.turnLeft();
         john.turnLeft();
         john.move();
         john.turnLeft();
         john.turnLeft();
         john.turnLeft();
         john.move();
         john.pickThing();
         john.move();
         john.pickThing();
         john.turnLeft();
        
         
         
    }
}
