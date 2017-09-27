package Assignment2;


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
public class Assignment2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        // TODO code application logic here

        Robot kevin = new Robot(kitchener, 3, 1, Direction.EAST);
        
        new Wall(kitchener, 3,1, Direction.SOUTH);
        new Wall(kitchener, 3,2, Direction.SOUTH);
        new Wall(kitchener, 3,3, Direction.SOUTH);
        new Wall(kitchener, 3,4, Direction.SOUTH);
        new Wall(kitchener, 3,5, Direction.SOUTH);
        new Wall(kitchener, 3,6, Direction.SOUTH);
        new Wall(kitchener, 3,7, Direction.SOUTH);
        new Wall(kitchener, 3,8, Direction.SOUTH);
        new Wall(kitchener, 3,9, Direction.SOUTH);
        new Wall(kitchener, 3,10, Direction.SOUTH);
        new Wall(kitchener, 3,11, Direction.SOUTH);
        new Wall(kitchener, 3,12, Direction.SOUTH);
        new Wall(kitchener, 3,4, Direction.WEST);
        new Wall(kitchener, 3,7, Direction.WEST);
        new Wall(kitchener, 3,2, Direction.WEST);
        new Wall(kitchener, 3,9, Direction.WEST);
        new Wall(kitchener, 3,11, Direction.WEST);
        
        new Thing(kitchener, 3, 12);
        
        if(kevin.canPickThing()== false){
            
            while(true){
            
            if(kevin.frontIsClear()== true) {
                kevin.move();
                
                if (kevin.canPickThing()== true) {
                    kevin.pickThing();
                    break;
                }
            }
            else {
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
            }
            
            
            
             }
        }
        else {kevin.pickThing();
         
        }
        
        
    }
}
