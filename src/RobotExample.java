
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Starm7481
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a new city called colorado 
        City colorado = new City();
        
        //create a robot 
        Robot kevin = new Robot(colorado, 7, 11, Direction.SOUTH);
        
        Robot bhavraj = new Robot(colorado, 8, 12, Direction.NORTH);
        
        new Wall(colorado, 7,11, Direction.NORTH);
        
        new Thing(colorado, 7,12);
        
        kevin.setColor(Color.BLUE);
        
        kevin.setLabel("K");
        
        bhavraj.setColor(Color.MAGENTA);
        
        bhavraj.setLabel("B");
                
        kevin.move();
        
        bhavraj.move();
        
        bhavraj.pickThing();
        
        bhavraj.move();
        
        bhavraj.turnLeft();
        
        bhavraj.move();
        
        bhavraj.putThing();
        
        bhavraj.move();
        
        bhavraj.turnLeft();
        
        bhavraj.move();
        
        bhavraj.turnLeft();
        
        bhavraj.move();
        
        kevin.move();
        
        bhavraj.move();
        
        kevin.move();
       
    }
}
