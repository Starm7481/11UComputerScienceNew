/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assingment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Starm7481
 */
public class Assignment3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          City kw = new City();
        
        Robot kevin = new Robot(kw,3,3,Direction.SOUTH);
        
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,2,2,Direction.EAST);
        
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,4,2,Direction.NORTH);
        new Wall(kw,4,2,Direction.EAST);
        new Wall(kw,5,1,Direction.WEST);
        new Wall(kw,5,1,Direction.SOUTH);
        new Wall(kw,5,2,Direction.SOUTH);
        new Wall(kw,5,2,Direction.EAST);
        
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,5,Direction.EAST);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,5,Direction.EAST);
        
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,4,5,Direction.NORTH);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,5,4,Direction.WEST);
        new Wall(kw,5,4,Direction.SOUTH);
        new Wall(kw,5,5,Direction.SOUTH);
        new Wall(kw,5,5,Direction.EAST);
        
        int blocks = 0;
        // blocks is used to define how many "blocks" the robot has gone around
        int side = 0;
        // side is used to define how many sides of each block the robot has gone around
        int go = 0;
        // go is used to define how many spaces on the side of the block the robot has moved
        
       
        while(blocks < 4){
            // this tells the robot to go around the sides of a block while it has gone around less than 4 blocks
            while(side < 4){
                // this tells the robot how many sides to go around the block  
                while(go < 3){
                    // this tells the robot how many spaces to move around the sides of the block
                kevin.move();
                go = go+1; 
                // adds one to the movement so that it will know it hit the end of a side 
                }
                kevin.turnLeft();
                // turns the robot left around a corner of a block 
                side = side+1; 
                // adds one to side so the robot knows its done 1/4 of the block 
                go = 0;
                // resets the moves so that it will know how far it has to move again 
                
            }
            blocks = blocks + 1;
            // adds one to block after all sides have been completed 
            kevin.turnLeft();
            //turns left so that the robot can go around a new block 
            side = 0;
            // resets side so that the robot will know how many sides to go around again
            
        }
    }
}
