package Assingment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Starm7481
 */
public class Assignment3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot kevin = new Robot(kw, 3, 3, Direction.EAST);

        kw.showThingCounts(true);

        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);

        int things = 0;

        // integer for counting things 
        while (true) {

            if (things < 10) {
                kevin.pickThing();
                kevin.move();
                kevin.putThing();
                kevin.turnLeft();
                kevin.turnLeft();
                kevin.move();
                kevin.turnLeft();
                kevin.turnLeft();
                // this is the robot picking a thing up, moving it over, then going back to where it started 
                things = things + 1;
                // adds one to the counter 
            } else {
                kevin.move();
                //moves him over to the second pile 
                break;
                // ends program 
            }

        }

    }
}
