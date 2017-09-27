package Assignment2;


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
public class Assignment2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        // TODO code application logic here

        Robot kevin = new Robot(kitchener, 2,3, Direction.EAST);
        
        new Wall(kitchener, 3,3, Direction.NORTH);
        new Wall(kitchener, 3,3, Direction.EAST);
        new Wall(kitchener, 3,3, Direction.SOUTH);
        new Wall(kitchener, 3,3, Direction.WEST);
        new Wall(kitchener, 6,3, Direction.NORTH);
        new Wall(kitchener, 6,3, Direction.EAST);
        new Wall(kitchener, 6,3, Direction.SOUTH);
        new Wall(kitchener, 6,3, Direction.WEST);
        new Wall(kitchener, 3,6, Direction.NORTH);
        new Wall(kitchener, 3,6, Direction.EAST);
        new Wall(kitchener, 3,6, Direction.SOUTH);
        new Wall(kitchener, 3,6, Direction.WEST);
        new Wall(kitchener, 6,6, Direction.NORTH);
        new Wall(kitchener, 6,6, Direction.EAST);
        new Wall(kitchener, 6,6, Direction.SOUTH);
        new Wall(kitchener, 6,6, Direction.WEST);
        new Wall(kitchener, 4,4, Direction.WEST);
        new Wall(kitchener, 5,4, Direction.WEST);
        new Wall(kitchener, 4,4, Direction.NORTH);
        new Wall(kitchener, 4,5, Direction.NORTH);
        new Wall(kitchener, 5,4, Direction.SOUTH);
        new Wall(kitchener, 5,5, Direction.SOUTH);
        new Wall(kitchener, 5,5, Direction.EAST);
        new Wall(kitchener, 4,5, Direction.EAST);
        while(true){
            
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        
         if (kevin.frontIsClear()== true){
             kevin.move();
         }
         else{
             kevin.turnLeft();
             
         
             if (kevin.frontIsClear()== true) {
                kevin.move();
             }
                else{
                 kevin.turnLeft();
             }
             
         }
         
        }
    
        
    } 
        
       
        
    }
    

