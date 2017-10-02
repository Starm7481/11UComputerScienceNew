
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
public class Assignment3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        // TODO code application logic here
        
        Robot kevin = new Robot(kitchener, 10, 10, Direction.EAST,20);
        
        int corn = 0;
        // integer for how many items the robot has placed 
        int row = 0;
        // integer for how many rows are planted 
        int rev = 0;
        // integer for the robot to reverse once it reaches the end of a row 
        while(row < 4){
            //this loop allows the robot to plant the field 
             while(corn < 5){
                 // this loop tells the robot to plant a row 
                kevin.putThing();
                kevin.move();
                
                corn = corn+1;
                // adds one corn each time it puts a thing down 
             }
             row = row+1;
             // once a row is finished it adds one to the integer 
             
             kevin.turnLeft();
             kevin.turnLeft();
             // turns the robot 180 degrees 
           
             
             while(rev < 6){
                 // this loop allows the robot to start a new row 
             kevin.move();
             
             rev = rev+1;
          
             }
             
             kevin.turnLeft();
             kevin.move();
             kevin.turnLeft();
             kevin.move();
             // allows a robot to move to the next row 
             
             rev = 0;
             // resets reverse so that it can repeat the process 
             corn = 0;
             // resets corn so that the robot will be able to plant a new row 
                
        }
    }
}
