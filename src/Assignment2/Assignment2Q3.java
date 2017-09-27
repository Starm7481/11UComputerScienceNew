package Assignment2;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Starm7481
 */
public class Assignment2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        // TODO code application logic here

        Robot kevin = new Robot(kitchener, 56, 78, Direction.SOUTH);
        
        kevin.getDirection();
        
        while(kevin.getDirection() != Direction.NORTH){
        
            kevin.turnLeft();
       
    }
        
        if((kevin.getDirection())== Direction.NORTH){
            
            while(kevin.getStreet() > 0){
                kevin.move();
            }
                kevin.turnLeft();
                
            while(kevin.getAvenue() > 0){
                kevin.move();
            }
               
            
    
    }
    }
}
