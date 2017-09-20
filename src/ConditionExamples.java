
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
public class ConditionExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City waterloo = new City();
        
        Robot john = new Robot(waterloo, 2, 1, Direction.EAST);
        
        new Wall(waterloo, 2, 5,Direction.EAST);
        
        if(john.frontIsClear()) {
        
        john.move();
        
        }
        else {
    
       john.turnLeft();
       
       
        }
    }
}
